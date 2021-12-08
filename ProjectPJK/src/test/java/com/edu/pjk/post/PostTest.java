package com.edu.pjk.post;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
// ApplicationContext를 만들고 작업할 수 있도록 Junit기능 확장(컨테이너 객체생성)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
//스프링 bean 설정 파일 위치지정, 위의 어노테이션에서 컨테이너를 새로 만들었기에 새로운 설정파일이 필요해서, 기존의 설정파일 위치로 대체함.
//기본적으로 디폴트로 설정되어있는 위치는  "src/test/resources" 경로이나 이렇게 하면 파일을 일일이 복사해야하기 때문에 Full path로 경로 지정
public class PostTest {
//컨테이너 설정정보를 가지고 있는 설정클래스
//이 클래스를 상속받으면 컨테이너 ctx필드 사용가능
	
	
	//스프링 bean 의존성주입
	@Autowired
	//스프링 bean 객체 생성 및 관리기능을 가진 인터페이스
	public ApplicationContext ctx;
	
	
	
	
//	@Before
//	public void beforeClass() {
//		System.out.println("-----테스트 시작------");
//	}
	
	
//	@org.junit.Test
//	public void dbTest() {
//		
//		//컨테이너에서 getBean()
//		SqlSessionTemplate session = ctx.getBean("sqlSessionTemplate",SqlSessionTemplate.class);
//		System.out.println(session);
//	}
	
	
	
	
//	@After
//	public void afterClass() {
//		System.out.println("-----테스트 종료------");
//	}
	
}
