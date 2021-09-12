package com.huaxiti.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huaxiti.common.utils.PageUtils;
import com.huaxiti.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu��Ϣ
 *
 * @author huaxi
 * @email huaxiti@g163.com
 * @date 2021-09-12 12:35:57
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

