package com.zmscr.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:27:48
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

