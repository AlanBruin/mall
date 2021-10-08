package com.morro.mall.coupon.dao;

import com.morro.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zheng
 * @email morrowind0422@gmail.com
 * @date 2021-05-04 13:36:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
