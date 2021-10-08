package com.morro.mall.order.dao;

import com.morro.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zheng
 * @email morrowind0422@gmail.com
 * @date 2021-05-04 13:45:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
