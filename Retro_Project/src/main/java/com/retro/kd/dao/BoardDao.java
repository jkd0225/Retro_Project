package com.retro.kd.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.retro.kd.vo.BoardVo;

@Repository
public class BoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	private final static String NAMESPACE = "com.retro.kd.mybatis.BoardMapper.";
	
	public int insert(BoardVo boardVo) {
		return sqlSession.insert(NAMESPACE + "insert", boardVo);
	}
	
	public List<BoardVo> list(){
		return sqlSession.selectList(NAMESPACE + "list");
	}
	
	public int getCount(Map<String, Object> map) {
		return sqlSession.selectOne(NAMESPACE + "getCount", map);
	}
	
	public BoardVo detail(int board_num) {
		return sqlSession.selectOne(NAMESPACE + "detail", board_num);
	}
	
	public int hitUp(int board_num) {
		return sqlSession.update(NAMESPACE + "hitUp", board_num);
	}
	
	public int update(BoardVo boardVo) {
		return sqlSession.update(NAMESPACE + "update", boardVo);
	}
	
	public int delete(int board_num) {
		return sqlSession.delete(NAMESPACE + "delete", board_num);
	}
}














