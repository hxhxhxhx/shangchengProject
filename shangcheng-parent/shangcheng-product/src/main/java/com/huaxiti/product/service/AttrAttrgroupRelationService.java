package com.huaxiti.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huaxiti.common.utils.PageUtils;
import com.huaxiti.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * ����&���Է������
 *
 * @author huaxi
 * @email huaxiti@g163.com
 * @date 2021-09-12 12:35:57
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

