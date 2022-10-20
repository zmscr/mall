package com.zmscr.mall.order.dao;

import com.zmscr.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:27:48
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
