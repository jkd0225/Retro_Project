package com.retro.kd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.kd.dao.RecommDao;
import com.retro.kd.vo.RecommVo;

@Service
public class RecommService {
	@Autowired
	private RecommDao dao;
	
	public int insert(RecommVo vo) {
		return dao.insert(vo);
	}
	
	public RecommVo isRecomm(RecommVo vo) {
		return dao.isRecomm(vo);
	}
	
	public int getRecommCount(int num) {
		return dao.getRecommCount(num);
	}
	
	public int delete(RecommVo vo) {
		return dao.delete(vo);
	}
	
	public List<RecommVo> list() {
		return dao.list();
	}
}
