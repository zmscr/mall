package com.zmscr.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmscr.common.utils.PageUtils;
import com.zmscr.common.utils.Query;

import com.zmscr.mall.coupon.dao.HomeSubjectSpuDao;
import com.zmscr.mall.coupon.entity.HomeSubjectSpuEntity;
import com.zmscr.mall.coupon.service.HomeSubjectSpuService;


@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpuEntity> implements HomeSubjectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeSubjectSpuEntity> page = this.page(
                new Query<HomeSubjectSpuEntity>().getPage(params),
                new QueryWrapper<HomeSubjectSpuEntity>()
        );

        return new PageUtils(page);
    }

}