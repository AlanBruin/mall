package com.morro.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morro.common.utils.PageUtils;
import com.morro.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author zheng
 * @email morrowind0422@gmail.com
 * @date 2021-05-04 13:36:49
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

