package com.zmscr.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:27:48
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

