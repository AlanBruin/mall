package com.morro.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morro.common.utils.PageUtils;
import com.morro.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zheng
 * @email morrowind0422@gmail.com
 * @date 2021-05-02 14:03:20
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

