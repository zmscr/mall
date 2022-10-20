package com.zmscr.mall.product.dao;

import com.zmscr.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-19 09:06:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
