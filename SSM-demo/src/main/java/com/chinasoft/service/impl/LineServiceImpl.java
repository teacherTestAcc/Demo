package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.LineMapper;
import com.chinasoft.pojo.Line;
import com.chinasoft.pojo.LineDetail;
import com.chinasoft.service.LineService;
@Service
public class LineServiceImpl implements LineService {
	@Autowired
	private LineMapper lm;
	
	public LineMapper getLm() {
		return lm;
	}

	public void setLm(LineMapper lm) {
		this.lm = lm;
	}

	@Override
	public LineDetail getLine(String name) {
		// TODO Auto-generated method stub
		return lm.selectLineByLineName(name);
	}

	@Override
	public List<Line> getLineByTypeName(String name) {
		// TODO Auto-generated method stub
		return lm.selectLineByTypeName(name);
	}

	@Override
	public List<LineDetail> getAll() {
		// TODO Auto-generated method stub
		return lm.selectLine();
	}

}
