package com.morro.mall.product.dao;

import com.morro.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zheng
 * @email morrowind0422@gmail.com
 * @date 2021-05-02 14:03:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
