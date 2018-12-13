package com.dnp.test.modular.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dnp.test.modular.dao.ResourceMapper;
import com.dnp.test.modular.dao.UserMapper;
import com.dnp.test.modular.dao.UserRoleMapper;
import com.dnp.test.modular.entity.Resource;
import com.dnp.test.modular.entity.User;
import com.dnp.test.modular.entity.UserRole;
import com.dnp.test.modular.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 资源 服务实现类
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ResourceMapper resourceMapper;
    @Override
    public List<Resource> findByUserName(String userName) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lambda().eq(User::getName, userName);
        User user = this.userMapper.selectOne(userQueryWrapper);

        QueryWrapper<UserRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(UserRole::getUserId, user.getId());
        List<UserRole> userRoleList = userRoleMapper.selectList(queryWrapper);

        return  resourceMapper.selectByRoleIds(userRoleList);
    }
}
