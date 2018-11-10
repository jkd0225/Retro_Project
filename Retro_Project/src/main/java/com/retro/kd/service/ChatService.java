package com.retro.kd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.kd.dao.ChatDao;
import com.retro.kd.vo.ChatRoomVo;
import com.retro.kd.vo.ChatVo;

@Service
public class ChatService {
	@Autowired
	private ChatDao dao;
	
	public int insert(ChatVo vo) {
		return dao.insert(vo);
	}
	
	public List<ChatVo> list(int room){
		return dao.list(room);
	}
	
	public List<ChatRoomVo> getRoom(String user_id) {
		return dao.getRoom(user_id);
	}
	
	public int update(ChatVo vo) {
		return dao.update(vo);
	}
}
