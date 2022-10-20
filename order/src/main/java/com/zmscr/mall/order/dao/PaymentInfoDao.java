package com.zmscr.mall.order.dao;

import com.zmscr.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:27:48
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
