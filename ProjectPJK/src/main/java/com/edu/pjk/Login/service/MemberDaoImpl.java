package com.edu.pjk.Login.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.pjk.Login.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public MemberVo memlogin(MemberVo memberVo) {
		return sql.selectOne("mem.memLogin", memberVo);
	}

	@Override
	public List<MemberVo> memList() {
		return sql.selectList("mem.memList");
	}

	@Override
	public MemberVo memSeletOne(MemberVo vo) {
		return sql.selectOne("mem.selectOne", vo);
	}

	@Override
	public void memEdit(MemberVo memberVo) {
		 sql.update("mem.memEdit1", memberVo);
		 sql.insert("mem.memEdit2", memberVo);
	}

	@Override
	public void memDel(MemberVo vo) {
		sql.update("memDel", vo);
	}

	@Override
	public void memJoin(MemberVo memberVo) {
		sql.insert("mem.memJoin",memberVo);
	}

}
