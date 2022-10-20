package com.zmscr.mall.member.dao;

import com.zmscr.mall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:24:04
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
