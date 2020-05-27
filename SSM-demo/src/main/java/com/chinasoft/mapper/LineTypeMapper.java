package com.chinasoft.mapper;

import com.chinasoft.pojo.LineType;

public interface LineTypeMapper {
    int deleteByPrimaryKey(Integer linetypeid);

    int insert(LineType record);

    int insertSelective(LineType record);

    LineType selectByPrimaryKey(Integer linetypeid);

    int updateByPrimaryKeySelective(LineType record);

    int updateByPrimaryKey(LineType record);
}