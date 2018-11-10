package com.retro.kd.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.kd.dao.IconDao;
import com.retro.kd.vo.IconVo;

@Service
public class IconService {
	@Autowired
	private IconDao dao;
	
	public List<IconVo> list(Map<String, Object> map){
		return dao.list(map);
	}
	
	public int getCount(Map<String, Object> map) {
		return dao.getCount(map);
	}
}
