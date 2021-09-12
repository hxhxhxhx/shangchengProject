package com.huaxiti.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huaxiti.common.utils.PageUtils;
import com.huaxiti.product.entity.AttrEntity;

import java.util.Map;

/**
 * ��Ʒ����
 *
 * @author huaxi
 * @email huaxiti@g163.com
 * @date 2021-09-12 12:35:57
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

