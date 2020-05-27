package com.chinasoft.service;

import java.util.List;

import com.chinasoft.pojo.Line;
import com.chinasoft.pojo.LineDetail;

public interface LineService {
	public LineDetail getLine(String name);
	
	public List<Line> getLineByTypeName(String name);
	
	public List<LineDetail> getAll();
}
