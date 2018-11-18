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
	private ChatDao chatDao;
	
	public int insert(ChatVo chatVo) {
		return chatDao.insert(chatVo);
	}
	
	public List<ChatVo> list(int room_num){
		return chatDao.list(room_num);
	}
	
	public List<ChatRoomVo> getRoom(String user_id) {
		return chatDao.getRoom(user_id);
	}
	
	public int update(ChatVo chatVo) {
		return chatDao.update(chatVo);
	}
}
