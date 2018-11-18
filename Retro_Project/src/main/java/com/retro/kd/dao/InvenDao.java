package com.retro.kd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.retro.kd.vo.InvenVo;

@Repository
public class InvenDao {
	@Autowired
	private SqlSession sqlSession;
	
	private final static String NAMESPACE = "com.retro.kd.mybatis.InvenMapper.";
	
	public int insert(InvenVo invenVo) {
		return sqlSession.insert(NAMESPACE + "insert", invenVo);
	}
	
	public int delete(int inven_num) {
		return sqlSession.delete(NAMESPACE + "delete", inven_num);
	}
	
	public List<InvenVo> list(){
		return sqlSession.selectList(NAMESPACE + "list");
	}
	
	public InvenVo select(int inven_num) {
		return sqlSession.selectOne(NAMESPACE + "select", inven_num);
	}
}
