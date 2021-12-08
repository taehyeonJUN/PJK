package com.edu.pjk.post;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

//@WebAppConfiguration
public class PostTestImpl extends PostTest{

	@Test
	public void dbConnect() throws Exception{
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		Connection conn = (Connection)dataSource.getConnection();
		System.out.println("성공 : " + conn);
		
	}
}
