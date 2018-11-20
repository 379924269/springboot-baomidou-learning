package com.dnp.test.modular.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dnp.test.modular.dao.OrganizationMapper;
import com.dnp.test.modular.entity.Organization;
import com.dnp.test.modular.service.OrganizationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 组织机构 服务实现类
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Service
public class OrganizationServiceImpl extends ServiceImpl<OrganizationMapper, Organization> implements OrganizationService {

}
