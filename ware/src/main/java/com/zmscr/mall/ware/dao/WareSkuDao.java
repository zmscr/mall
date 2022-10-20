package com.zmscr.mall.ware.dao;

import com.zmscr.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:35:10
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
