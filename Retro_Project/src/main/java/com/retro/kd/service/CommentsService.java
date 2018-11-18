package com.retro.kd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.kd.dao.CommentsDao;
import com.retro.kd.vo.CommentsVo;


@Service
public class CommentsService {
	@Autowired
	private CommentsDao commentsDao;
	
	public int insert(CommentsVo commentsVo) {
		return commentsDao.insert(commentsVo);
	}
	
	public List<CommentsVo> list(int comm_num){
		return commentsDao.list(comm_num);
	}
	
	public int getCount(int board_num) {
		return commentsDao.getCount(board_num);
	}
	
	public int delete(int comm_num) {
		return commentsDao.delete(comm_num);
	}
}
