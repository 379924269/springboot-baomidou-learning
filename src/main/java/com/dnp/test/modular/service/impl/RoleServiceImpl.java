package com.dnp.test.modular.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dnp.test.modular.dao.RoleMapper;
import com.dnp.test.modular.entity.Role;
import com.dnp.test.modular.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> findByUsername(String username) {
        return roleMapper.findByUsername(username);
    }
}
