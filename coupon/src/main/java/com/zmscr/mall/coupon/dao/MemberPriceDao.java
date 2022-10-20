package com.zmscr.mall.coupon.dao;

import com.zmscr.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:16:06
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
