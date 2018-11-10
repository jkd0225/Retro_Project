package com.retro.kd.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.kd.dao.UsersDao;
import com.retro.kd.vo.AuthVo;
import com.retro.kd.vo.UsersInfoVo;
import com.retro.kd.vo.UsersVo;

@Service
public class UsersService {
	@Autowired
	private UsersDao dao;
	
	public int insert(UsersVo vo) {
		return dao.insert(vo);
	}
	
	public int addAuth(Map<String, Object> map) {
		return dao.addAuth(map);
	}
	
	public List<UsersInfoVo> list(){
		return dao.list();
	}
	
	public UsersInfoVo getInfo(String email) {
		return dao.getInfo(email);
	}
	
	public List<AuthVo> getAuth(String email) {
		return dao.getAuth(email);
	}
	
	public int insertAuth(AuthVo vo) {
		return dao.insertAuth(vo);
	}
	
	public int deleteAuth(AuthVo vo) {
		return dao.deleteAuth(vo);
	}
}










