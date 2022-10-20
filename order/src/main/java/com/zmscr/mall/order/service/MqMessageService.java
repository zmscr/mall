package com.zmscr.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:27:48
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

