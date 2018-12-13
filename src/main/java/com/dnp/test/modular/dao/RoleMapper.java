package com.dnp.test.modular.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dnp.test.modular.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 角色 Mapper 接口
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
public interface RoleMapper extends BaseMapper<Role> {
    List<Role> findByUsername(@Param("username") String username);
}
