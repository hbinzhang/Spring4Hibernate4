package com.zhb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhb.test.service.DbService;


public class Main {

	public static void main(String[] s) {
		 ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{
				 "applicationContext.xml"});
	     System.out.println("Go");
	     DbService dbs = ac.getBean(DbService.class);
	     dbs.addLog();
	     System.out.println("End");
	}

}
