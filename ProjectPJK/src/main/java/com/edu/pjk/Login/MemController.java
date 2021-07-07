package com.edu.pjk.Login;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.pjk.Login.service.MemberService;

@Controller
@RequestMapping("/mem")
public class MemController {
	
	final String path = "mem/";
	
	@Autowired
	MemberService memberService;
	
	/*로그인 화면으로 이동*/
	@GetMapping("/login")
	public String login() {
		
		return "mem/login";
	}
	
	
	/*로그인 실행*/
	@PostMapping("/login")
	public String login(MemberVo memberVo , HttpSession session) {
		MemberVo memlogin = memberService.memlogin(memberVo);
		
		if (memlogin == null) {
			return "redirect:/";
		}
		else
			session.setAttribute("user", memlogin);
		
		
		return "main/main";
	}
	
	
	
	/*해쉬맵 사용?*/
	/*가입회원 목록*/
	@GetMapping("/memList")
	public String memList(Map model){
		
		List<MemberVo> memListVo = memberService.memList();
		
		model.put("list", memListVo);
		
		
		return path + "memList";
	}
	
	
	/*회원정보 수정 페이지*/
	@GetMapping("/memEdit")
	public String memEdit(HttpSession session, Map map){
		MemberVo vo=(MemberVo) session.getAttribute("user");
		
		MemberVo memberVo = memberService.memSeletOne(vo);
		
		map.put("edit", memberVo);
		
		return path+"memEdit";
	}
	
	/*회원정보 수정*/
	@PostMapping("/memEdit")
	public String memEdit(MemberVo memberVo, Map map){

		memberService.memEdit(memberVo);
		
		return path +"memList";
	}
	
	
	
	/*회원탈퇴(논리)*/
	@GetMapping("/memDel")
	public String memDel(HttpSession session, Map map){
		MemberVo vo = (MemberVo) session.getAttribute("user");
		
		memberService.memDel(vo);
		
		
		return path + "memList";
	}
	
	
	/*회원가입 양식*/
	@GetMapping("/memJoin")
	public String memJoin(){
		
		return path + "memJoin";
	}
	
	
	/*회원가입*/
	@PostMapping("/memJoin")
	public String memJoin(MemberVo memberVo) {
		
		memberService.memJoin(memberVo);
		
		return path + "login";
	}
	
	
	
	/*회원정보 삭제(물리)*/
	
	
	

}
