package com.zmscr.mall.product.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.common.utils.Query;

import com.zmscr.mall.product.dao.CategoryDao;
import com.zmscr.mall.product.entity.CategoryEntity;
import com.zmscr.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

//    @Autowired
//    CategoryDao categoryDao;

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
        //1.查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //组成父子结构
        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity) ->
             categoryEntity.getParentCid() == 0
        ).map((menus) -> {
            menus.setChildren(getChildren(menus, entities));
            return menus;
        }).sorted((menus1, menus2) -> {
            return menus1.getSort() - menus2.getSort();
        }).collect(Collectors.toList());
        return level1Menus;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> Children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menus1, menus2) -> {
            return (menus1.getSort()==null?0:menus1.getSort()) - (menus2.getSort()==null?0:menus2.getSort());
        }).collect(Collectors.toList());
        return Children;
    }


}