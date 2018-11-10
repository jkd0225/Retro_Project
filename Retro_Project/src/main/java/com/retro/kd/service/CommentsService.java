package com.retro.kd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.kd.dao.CommentsDao;
import com.retro.kd.vo.CommentsVo;


@Service
public class CommentsService {
	@Autowired
	private CommentsDao dao;
	
	public int insert(CommentsVo vo) {
		return dao.insert(vo);
	}
	
	public List<CommentsVo> list(int num){
		return dao.list(num);
	}
	
	public int getCount(int num) {
		return dao.getCount(num);
	}
	
	public int delete(int cnum) {
		return dao.delete(cnum);
	}
}
