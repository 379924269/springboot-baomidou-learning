package com.dnp.test.modular.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dnp.test.modular.entity.Resource;
import com.dnp.test.modular.entity.Role;

import java.util.List;

/**
 * <p>
 * 资源 服务类
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
public interface ResourceService extends IService<Resource> {
    List<Resource> findByUserName(String userName);
}
