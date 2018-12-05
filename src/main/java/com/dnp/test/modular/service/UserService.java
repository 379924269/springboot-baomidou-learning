package com.dnp.test.modular.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dnp.test.modular.entity.User;
import com.dnp.test.vo.UserRoleOrgVo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
public interface UserService extends IService<User> {
    List<UserRoleOrgVo> selectUserListPage(Page<UserRoleOrgVo> page, String searchName);
}
