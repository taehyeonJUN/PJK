package com.edu.pjk.Login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.pjk.Login.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memDao;
	
	@Override
	public MemberVo memlogin(MemberVo memberVo) {
		return memDao.memlogin(memberVo);
	}

	@Override
	public List<MemberVo> memList() {
		return memDao.memList();
	}

	@Override
	public MemberVo memSeletOne(MemberVo vo) {
		return memDao.memSeletOne(vo);
	}

	@Override
	public void memEdit(MemberVo memberVo) {
		 memDao.memEdit(memberVo);
	}

	@Override
	public void memDel(MemberVo vo) {
		memDao.memDel(vo);
	}

	@Override
	public void memJoin(MemberVo memberVo) {
		memDao.memJoin(memberVo);
	}

}
