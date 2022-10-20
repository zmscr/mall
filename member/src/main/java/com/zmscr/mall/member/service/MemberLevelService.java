package com.zmscr.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:24:04
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

