package com.morro.mall.product;

import com.morro.mall.product.entity.BrandEntity;
import com.morro.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MallProductApplicationTests {

	@Resource
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("Apple");
		brandService.save(brandEntity);
		System.out.println("保存成功");
	}

}
