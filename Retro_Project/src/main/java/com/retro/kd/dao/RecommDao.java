package com.retro.kd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.retro.kd.vo.RecommVo;

@Repository
public class RecommDao {
	@Autowired
	private SqlSession session;
	
	private final static String NAMESPACE = "com.retro.kd.mybatis.RecommMapper.";
	
	public int insert(RecommVo recommVo) {
		return session.insert(NAMESPACE + "insert", recommVo);
	}
	
	public RecommVo isRecomm(RecommVo recommVo) {
		return session.selectOne(NAMESPACE + "isRecomm", recommVo);
	}
	
	public int getRecommCount(int board_num) {
		return session.selectOne(NAMESPACE + "getRecommCount", board_num);
	}
	
	public int delete(RecommVo recommVo) {
		return session.delete(NAMESPACE + "delete", recommVo);
	}
	
	public List<RecommVo> list() {
		return session.selectList(NAMESPACE + "list");
	}
	
}
