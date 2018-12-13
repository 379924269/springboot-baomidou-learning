package com.dnp.test.modular.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dnp.test.modular.entity.Role;

import java.util.List;

/**
 * <p>
 * 角色 服务类
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
public interface RoleService extends IService<Role> {
    List<Role> findByUsername(String username);

}
