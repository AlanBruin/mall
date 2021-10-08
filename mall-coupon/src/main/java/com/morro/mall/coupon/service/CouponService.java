package com.morro.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morro.common.utils.PageUtils;
import com.morro.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author zheng
 * @email morrowind0422@gmail.com
 * @date 2021-05-04 13:36:48
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

