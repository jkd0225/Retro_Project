package com.retro.kd.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.retro.kd.vo.IconVo;

@Repository
public class IconDao {
	@Autowired
	private SqlSession session;
	
	private final static String NAMESPACE = "com.retro.kd.mybatis.IconMapper.";
	
	public List<IconVo> list(Map<String, Object> map){
		return session.selectList(NAMESPACE + "list", map);
	}
	
	public int getCount(Map<String, Object> map) {
		return session.selectOne(NAMESPACE + "getCount", map);
	}
}
