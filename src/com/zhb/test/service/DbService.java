package com.zhb.test.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zhb.test.dao.BaseDao;
import com.zhb.test.model.SystemLog;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class DbService {

	@Inject
	private BaseDao dao;
	
	public void addLog() {
		SystemLog sl = new SystemLog();
		sl.setTimestamp("2013");
		sl.setAction("1");
		dao.insert(sl);
	}
}
