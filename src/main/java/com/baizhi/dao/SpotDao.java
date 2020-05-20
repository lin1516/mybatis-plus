package com.baizhi.dao;

import com.baizhi.entity.Spot;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface SpotDao  extends BaseMapper<Spot> {
    public Spot selectByPid(Integer pid);
}
