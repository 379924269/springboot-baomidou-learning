package com.dnp.test.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dnp.test.modular.entity.Role;
import com.dnp.test.modular.entity.User;
import com.dnp.test.modular.service.ResourceService;
import com.dnp.test.modular.service.RoleService;
import com.dnp.test.modular.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by huazai on 2018/12/12.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    //    用户登录的时候，比较用户名和密码，赋角色权限
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getName, username);
        User user = userService.getOne(queryWrapper);

        List<Role> roles = roleService.findByUsername(username);

        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        if (roles != null) {
            for (Role role : roles) {
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
                authorities.add(authority);
            }
        }

        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), true, true, true, true, authorities);
    }
}
