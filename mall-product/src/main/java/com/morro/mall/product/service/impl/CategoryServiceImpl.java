package com.morro.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.morro.common.utils.PageUtils;
import com.morro.common.utils.Query;

import com.morro.mall.product.dao.CategoryDao;
import com.morro.mall.product.entity.CategoryEntity;
import com.morro.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<CategoryEntity> page = this.page(
				new Query<CategoryEntity>().getPage(params),
				new QueryWrapper<CategoryEntity>()
		);

		return new PageUtils(page);
	}

	@Override
	public List<CategoryEntity> listWithTree() {
		List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
		List<CategoryEntity> parentsMenus = categoryEntities.stream().
				filter(categoryEntity -> categoryEntity.getParentCid() == 0
				).peek(menus -> menus.setChildren(getChildren(menus, categoryEntities))
				).sorted((menus1, menus2)->{
					return (menus1.getSort()==null?0:menus1.getSort()) - (menus2.getSort()==null?0:menus2.getSort());
				}).collect(Collectors.toList());
		return parentsMenus;
	}

	@Override
	public void removeMenuByIds(List<Long> asList) {
		//TODO 检查简单是否被引用
		baseMapper.deleteBatchIds(asList);
	}


	private List<CategoryEntity> getChildren(CategoryEntity parent, List<CategoryEntity> all) {
		List<CategoryEntity> children = all.stream().filter(categoryEntity -> Objects.equals(categoryEntity.getParentCid(), parent.getCatId())
		).peek(menus -> menus.setChildren(getChildren(menus, all))).sorted((menus1, menus2)->{
			return (menus1.getSort()==null?0:menus1.getSort()) - (menus2.getSort()==null?0:menus2.getSort());
		}).collect(Collectors.toList());
		return children;
	}
}