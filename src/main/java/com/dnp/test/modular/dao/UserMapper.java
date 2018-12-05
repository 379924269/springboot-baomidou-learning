package com.dnp.test.modular.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dnp.test.modular.entity.User;
import com.dnp.test.vo.PageVo;
import com.dnp.test.vo.UserRoleOrgVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
public interface UserMapper extends BaseMapper<User> {
    List<UserRoleOrgVo> selectUserListPage(Page<UserRoleOrgVo> page, @Param("searchName") String searchName);
}
