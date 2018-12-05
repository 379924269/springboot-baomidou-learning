package com.dnp.test.modular.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dnp.test.modular.dao.UserMapper;
import com.dnp.test.modular.entity.User;
import com.dnp.test.modular.service.UserService;
import com.dnp.test.vo.UserRoleOrgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserRoleOrgVo> selectUserListPage(Page<UserRoleOrgVo> page, String searchName) {
        return userMapper.selectUserListPage(page, searchName);
    }
}
