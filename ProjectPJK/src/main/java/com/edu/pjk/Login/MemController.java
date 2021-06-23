package com.edu.pjk.Login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mem")
public class MemController {
	
	@Autowired
	MemberServie memberService;
	
	/*로그인*/
	@PostMapping
	public String login(MemberVo memberVo , HttpSession session) {
		MemberVo memlogin = memberService.memlogin(memberVo);
		
		if (memlogin == null) {
			return "login";
		}
		else
			session.setAttribute("user", memlogin);
		
		
		return "Home";
	}
	

}
