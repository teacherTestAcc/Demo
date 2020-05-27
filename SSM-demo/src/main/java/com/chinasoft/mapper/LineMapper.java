package com.chinasoft.mapper;

import java.util.List;

import com.chinasoft.pojo.Line;
import com.chinasoft.pojo.LineDetail;

public interface LineMapper {
    int deleteByPrimaryKey(Integer lineid);

    int insert(Line record);

    int insertSelective(Line record);

    Line selectByPrimaryKey(Integer lineid);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
    
    public LineDetail selectLineByLineName(String name);
    
    public List<Line> selectLineByTypeName(String name);
    
    public List<LineDetail> selectLine();
}