package com.zmscr.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:24:04
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

