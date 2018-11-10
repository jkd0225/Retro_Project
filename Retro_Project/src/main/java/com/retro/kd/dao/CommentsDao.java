package com.retro.kd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.retro.kd.vo.CommentsVo;

@Repository
public class CommentsDao {
	@Autowired
	private SqlSession session;
	
	public int insert(CommentsVo vo) {
		return session.insert("com.jhta.mybatis.GcommentMapper.insert", vo);
	}
	
	public List<CommentsVo> list(int num){
		return session.selectList("com.jhta.mybatis.GcommentMapper.list", num);
	}
	
	public int getCount(int num) {
		return session.selectOne("com.jhta.mybatis.GcommentMapper.getCount", num);
	}
	
	public int delete(int cnum) {
		return session.delete("com.jhta.mybatis.GcommentMapper.delete", cnum);
	}
}
