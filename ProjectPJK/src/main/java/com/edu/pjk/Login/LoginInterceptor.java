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

		/*가져온 세션 정보로 로그인여부 확인 */
		MemberVo memVo = (MemberVo)session.getAttribute("user");
		
		/*로그인 여부를 확인하는 조건문*/
		if(memVo != null) {
			
			/*권한을 확인하는 조건문 - 추후 수정필요할듯*/
			if ("admin".equals(memVo.getMemAuthor())||"user".equals(memVo.getMemAuthor())) {
				
				}	
			return true;
		}
		/*로그인 상태 아닐시 초기 페이지로 이동*/
		else {
		response.sendRedirect("/");
		return false;
		}

	}
}

