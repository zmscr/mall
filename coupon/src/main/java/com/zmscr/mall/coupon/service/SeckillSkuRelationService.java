package com.zmscr.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author zm
 * @email zmscr@outlook.com
 * @date 2022-10-20 08:16:06
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

