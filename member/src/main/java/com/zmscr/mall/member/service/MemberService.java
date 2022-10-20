package com.zmscr.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:24:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

