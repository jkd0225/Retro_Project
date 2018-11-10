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
	
	public int insert(RecommVo vo) {
		return session.insert("com.jhta.mybatis.GrecommMapper.insert", vo);
	}
	
	public RecommVo isRecomm(RecommVo vo) {
		return session.selectOne("com.jhta.mybatis.GrecommMapper.isRecomm", vo);
	}
	
	public int getRecommCount(int num) {
		return session.selectOne("com.jhta.mybatis.GrecommMapper.getRecommCount", num);
	}
	
	public int delete(RecommVo vo) {
		return session.delete("com.jhta.mybatis.GrecommMapper.delete", vo);
	}
	
	public List<RecommVo> list() {
		return session.selectList("com.jhta.mybatis.GrecommMapper.list");
	}
	
}
