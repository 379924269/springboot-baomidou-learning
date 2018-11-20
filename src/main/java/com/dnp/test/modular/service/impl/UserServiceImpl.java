package com.dnp.test.modular.service.impl;

import com.dnp.test.modular.entity.User;
import com.dnp.test.modular.dao.UserMapper;
import com.dnp.test.modular.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
