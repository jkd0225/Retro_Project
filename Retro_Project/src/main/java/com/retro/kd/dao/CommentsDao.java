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
	
	private final static String NAMESPACE = "com.retro.kd.mybatis.CommentsMapper.";
	
	public int insert(CommentsVo commentsVo) {
		return session.insert(NAMESPACE + "insert", commentsVo);
	}
	
	public List<CommentsVo> list(int comm_num){
		return session.selectList(NAMESPACE + "list", comm_num);
	}
	
	public int getCount(int board_num) {
		return session.selectOne(NAMESPACE + "getCount", board_num);
	}
	
	public int delete(int comm_num) {
		return session.delete(NAMESPACE + "delete", comm_num);
	}
}
