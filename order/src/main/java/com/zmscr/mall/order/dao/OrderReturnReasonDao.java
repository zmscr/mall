package com.zmscr.mall.order.dao;

import com.zmscr.mall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:27:48
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
