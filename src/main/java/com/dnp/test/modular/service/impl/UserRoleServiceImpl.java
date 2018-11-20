package com.dnp.test.modular.service.impl;

import com.dnp.test.modular.entity.UserRole;
import com.dnp.test.modular.dao.UserRoleMapper;
import com.dnp.test.modular.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色 服务实现类
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
