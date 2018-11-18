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
	private UsersDao usersDao;
	
	public int insert(UsersVo usersVo) {
		return usersDao.insert(usersVo);
	}
	
	public int addAuth(Map<String, Object> map) {
		return usersDao.addAuth(map);
	}
	
	public List<UsersInfoVo> list(){
		return usersDao.list();
	}
	
	public UsersInfoVo getInfo(String user_email) {
		return usersDao.getInfo(user_email);
	}
	
	public List<AuthVo> getAuth(String user_email) {
		return usersDao.getAuth(user_email);
	}
	
	public int insertAuth(AuthVo authVo) {
		return usersDao.insertAuth(authVo);
	}
	
	public int deleteAuth(AuthVo authVo) {
		return usersDao.deleteAuth(authVo);
	}
}










