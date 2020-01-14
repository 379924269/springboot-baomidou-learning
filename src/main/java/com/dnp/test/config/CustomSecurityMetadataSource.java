package com.dnp.test.config;

import com.dnp.test.modular.dao.RoleResourceMapper;
import com.dnp.test.vo.RoleResourceVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.ObjectUtils;
import org.springframework.util.PathMatcher;

import java.util.*;
public class CustomSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    private static final Logger logger = LoggerFactory.getLogger(CustomAccessDecisionManager.class);
    //    代表需要管理的所有权限
    private Map<String, Collection<ConfigAttribute>> resourceMap = null;
    private PathMatcher pathMatcher = new AntPathMatcher();

    private RoleResourceMapper roleResourceMapper;

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    public CustomSecurityMetadataSource  (RoleResourceMapper roleResourceMapper) {
        super();
        this.roleResourceMapper = roleResourceMapper;
        resourceMap = loadResourceMatchAuthority();
    }

    private Map<String, Collection<ConfigAttribute>> loadResourceMatchAuthority() {
        List<RoleResourceVo> roleResourceVos = roleResourceMapper.list();

        Map<String, Collection<ConfigAttribute>> map = new HashMap<>();

        if(!roleResourceVos.isEmpty()){
            for (RoleResourceVo r :
                    roleResourceVos) {
                Collection<ConfigAttribute> list = new ArrayList<>();
                ConfigAttribute config = new SecurityConfig(r.getRoleName());
                list.add(config);
                map.put(r.getUrl(), list);
            }
        }else{
            logger.error("'securityconfig.urlroles' must be set");
        }

        logger.info("Loaded UrlRoles Resources.");
        return map;

    }

    //    判断请求是否在权限保护里面，如果是，会到权限断绝器（CustomAccessDecisionManager）判断用户是否有权限
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object)
            throws IllegalArgumentException {
        String url = ((FilterInvocation) object).getRequestUrl();

        Object updateResourceFlag =  ((FilterInvocation) object).getHttpRequest().getServletContext().getAttribute("updateResourceFlag");
        if (!ObjectUtils.isEmpty(updateResourceFlag)) {
            resourceMap = loadResourceMatchAuthority();
            ((FilterInvocation) object).getHttpRequest().getServletContext().removeAttribute("updateResourceFlag");
        }

        Iterator<String> ite = resourceMap.keySet().iterator();
        while (ite.hasNext()) {
            String resURL = ite.next();
            if (pathMatcher.match(resURL,url)) {
                return resourceMap.get(resURL);
            }
        }
        return resourceMap.get(url);
    }

    public boolean supports(Class<?> clazz) {
        return true;
    }
}
