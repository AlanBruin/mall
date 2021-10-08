package com.morro.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morro.common.utils.PageUtils;
import com.morro.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author zheng
 * @email morrowind0422@gmail.com
 * @date 2021-05-04 13:45:21
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

