package com.zmscr.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:27:48
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

