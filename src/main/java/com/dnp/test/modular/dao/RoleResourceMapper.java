package com.dnp.test.modular.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dnp.test.modular.entity.Resource;
import com.dnp.test.modular.entity.RoleResource;
import com.dnp.test.modular.entity.UserRole;
import com.dnp.test.vo.RoleResourceVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 角色资源 Mapper 接口
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
public interface RoleResourceMapper extends BaseMapper<RoleResource> {
    List<RoleResourceVo> list();
}
