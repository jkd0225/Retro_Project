package com.retro.kd.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.retro.kd.vo.AuthVo;
import com.retro.kd.vo.UsersInfoVo;
import com.retro.kd.vo.UsersVo;

@Repository
public class UsersDao {
	@Autowired
	private SqlSession session;
	
	private final static String NAMESPACE = "com.retro.kd.mybatis.UsersMapper.";
	
	public int insert(UsersVo usersVo) {
		return session.insert(NAMESPACE+"insert",usersVo);
	}
	
	public int addAuth(Map<String, Object> map) {
		return session.insert(NAMESPACE + "addAuth",map);
	}
	
	public List<UsersInfoVo> list(){
		return session.selectList(NAMESPACE+ "list");
	}
	
	public UsersInfoVo getInfo(String user_email) {
		return session.selectOne(NAMESPACE + "getInfo", user_email);
	}
	
	public List<AuthVo> getAuth(String user_email){
		return session.selectList(NAMESPACE + "getAuth", user_email);
	}
	
	public int insertAuth(AuthVo authVo) {
		return session.insert(NAMESPACE +"insertAuth", authVo);
	}
	
	public int deleteAuth(AuthVo authVo) {
		return session.delete(NAMESPACE + "deleteAuth", authVo);
	}
}










