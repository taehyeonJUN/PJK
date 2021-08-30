package com.edu.pjk.Login.service;

import java.util.List;

import com.edu.pjk.Login.MemberVo;

public interface MemberService {
	/*로그인*/
	MemberVo memlogin(MemberVo memberVo);

	/*회원목록*/
	List<MemberVo> memList();

	/*회원정보*/
	MemberVo memSeletOne(MemberVo vo);

	/*회원정보 수정*/
	void memEdit(MemberVo memberVo);

	/*회원탈퇴*/
	void memDel(MemberVo vo);

	/*회원가입*/
	void memJoin(MemberVo memberVo);

	/*아이디 중복 체크*/
	int memChk(MemberVo memberVo);
}
