package com.retro.kd.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.kd.dao.BoardDao;
import com.retro.kd.vo.BoardVo;

@Service
public class BoardService {
	@Autowired
	private BoardDao boardDao;

	public int insert(BoardVo boardVo) {
		return boardDao.insert(boardVo);
	}

	public List<BoardVo> list() {
		return boardDao.list();
	}

	public int getCount(Map<String, Object> map) {
		return boardDao.getCount(map);
	}

	public BoardVo detail(int board_num) {
		return boardDao.detail(board_num);
	}

	public int hitUp(int board_num) {
		return boardDao.hitUp(board_num);
	}

	public int update(BoardVo boardVo) {
		return boardDao.update(boardVo);
	}

	public int delete(int board_num) {
		return boardDao.delete(board_num);
	}
}
