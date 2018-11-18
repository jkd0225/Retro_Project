package com.retro.kd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.kd.dao.RecommDao;
import com.retro.kd.vo.RecommVo;

@Service
public class RecommService {
	@Autowired
	private RecommDao recommDao;
	
	public int insert(RecommVo recommVo) {
		return recommDao.insert(recommVo);
	}
	
	public RecommVo isRecomm(RecommVo recommVo) {
		return recommDao.isRecomm(recommVo);
	}
	
	public int getRecommCount(int board_num) {
		return recommDao.getRecommCount(board_num);
	}
	
	public int delete(RecommVo recommVo) {
		return recommDao.delete(recommVo);
	}
	
	public List<RecommVo> list() {
		return recommDao.list();
	}
}
