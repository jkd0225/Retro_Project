package com.retro.kd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.kd.dao.InvenDao;
import com.retro.kd.vo.InvenVo;

@Service
public class InvenService {
	@Autowired
	private InvenDao invenDao;
	
	public int insert(InvenVo invenVo) {
		return invenDao.insert(invenVo);
	}
	
	public int delete(int inven_num) {
		return invenDao.delete(inven_num);
	}
	
	public List<InvenVo> list(){
		return invenDao.list();
	}
	
	public InvenVo select(int inven_num) {
		return invenDao.select(inven_num);
	}
}
