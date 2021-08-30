package com.edu.pjk.Login.service;

import java.util.List;

import com.edu.pjk.Login.MemberVo;

public interface MemberDao {

	MemberVo memlogin(MemberVo memberVo);

	List<MemberVo> memList();

	MemberVo memSeletOne(MemberVo vo);

	void memEdit(MemberVo memberVo);

	void memDel(MemberVo vo);

	void memJoin(MemberVo memberVo);

	int memChk(MemberVo memberVo);

}
