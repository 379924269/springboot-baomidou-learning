package com.dnp.test.modular.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dnp.test.modular.entity.Resource;
import com.dnp.test.modular.entity.Role;
import com.dnp.test.modular.entity.UserRole;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 资源 Mapper 接口
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
public interface ResourceMapper extends BaseMapper<Resource> {
    List<Resource> selectByRoleIds(@Param("listRoles") List<UserRole> listRoles);
}
