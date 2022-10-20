package com.zmscr.mall.coupon.dao;

import com.zmscr.mall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:16:06
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
