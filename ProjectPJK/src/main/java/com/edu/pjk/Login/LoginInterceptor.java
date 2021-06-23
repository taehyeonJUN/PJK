package com.edu.pjk.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		/*세션정보를 가져옴*/
		HttpSession session = request.getSession();

		/*가져온 세션 정보로 로그인여부 확인 - 권한이 user 혹은 admin일 경우*/
		MemberVo memVo = (MemberVo)session.getAttribute("user");
		if ("admin".equals(memVo.getMemAuthor())||"user".equals(memVo.getMemAuthor())) {
			return true;
		}	
		else {
			/*로그인 실패시 이전 페이지로 이동함.*/
			response.sendRedirect("..");
			return false;
		}

	}
}

