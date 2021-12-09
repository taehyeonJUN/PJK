package com.edu.pjk.post;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.edu.pjk.Login.MemberVo;
import com.edu.pjk.Login.service.MemberService;

//@WebAppConfiguration
@Transactional //성공이든 실패는 무조건 롤백
//@Rollback(false)  //테스트 결과를 디비에 반영하고 싶을떄
public class PostTestImpl extends PostTest{
	
	@Autowired
	MemberService memService;
	
	@Test
	public void dbConnect() throws Exception{
		//given 데이터 준비
		//when 실행
		//then 검증
	
		
	/* DB연결 확인		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		Connection conn = (Connection)dataSource.getConnection();
		System.out.println("성공 : " + conn);
	*/	
		//
		List<MemberVo> memVo = memService.memList();
		System.out.println(memVo.get(0).getMemName());
		
	}
}
