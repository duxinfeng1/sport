package com.dfz.dao;

import com.dfz.entity.Funs;

public interface FunsMapper {
    int deleteByPrimaryKey(Integer tfId);

    int insert(Funs record);

    int insertSelective(Funs record);

    Funs selectByPrimaryKey(Integer tfId);

    int updateByPrimaryKeySelective(Funs record);

    int updateByPrimaryKey(Funs record);
}