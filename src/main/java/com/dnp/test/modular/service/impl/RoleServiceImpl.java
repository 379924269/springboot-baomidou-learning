package com.dnp.test.modular.service.impl;

import com.dnp.test.modular.entity.Role;
import com.dnp.test.modular.dao.RoleMapper;
import com.dnp.test.modular.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
