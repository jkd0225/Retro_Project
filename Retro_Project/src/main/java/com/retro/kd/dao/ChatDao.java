package com.retro.kd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.retro.kd.vo.ChatRoomVo;
import com.retro.kd.vo.ChatVo;

@Repository
public class ChatDao {
	@Autowired
	private SqlSession session;
	
	private final static String NAMESPACE = "com.retro.kd.mybatis.ChatMapper.";
	
	public int insert(ChatVo chatVo) {
		return session.insert(NAMESPACE + "insert",chatVo);
	}
	
	public List<ChatVo> list(int room_num){
		return session.selectList(NAMESPACE + "list",room_num);
	}
	
	public List<ChatRoomVo> getRoom(String user_id) {
		return session.selectList(NAMESPACE + "getRoom", user_id);
	}
	
	public int update(ChatVo chatVo) {
		return session.update(NAMESPACE + "read", chatVo);
	}
}
