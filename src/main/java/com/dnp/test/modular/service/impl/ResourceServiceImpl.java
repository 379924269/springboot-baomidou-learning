package com.dnp.test.modular.service.impl;

import com.dnp.test.modular.entity.Resource;
import com.dnp.test.modular.dao.ResourceMapper;
import com.dnp.test.modular.service.ResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源 服务实现类
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

}
