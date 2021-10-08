package com.morro.mall.member.feign;

import com.morro.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
@Service
public interface CouponFeignServeice {

	@RequestMapping("/coupon/coupon/member/list")
	public R memberCoupons();
}
