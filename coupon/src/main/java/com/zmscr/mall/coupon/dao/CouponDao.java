package com.zmscr.mall.coupon.dao;

import com.zmscr.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:16:06
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
