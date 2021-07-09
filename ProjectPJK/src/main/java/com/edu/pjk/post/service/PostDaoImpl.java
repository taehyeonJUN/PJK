package com.edu.pjk.post.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.pjk.post.PostVo;

@Repository
public class PostDaoImpl implements PostDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<PostVo> PostList() {
		return sql.selectList("post.PostList");
	}

	@Override
	public void PostAdd(PostVo postVo) {
		sql.insert("post.PostAdd", postVo);
	}

	@Override
	public PostVo PostSelect(PostVo postVo) {
		return sql.selectOne("post.PostSelect", postVo);
	}

	@Override
	public void PostEdit(PostVo postVo) {
		 sql.update("post.PostEdit", postVo);
	}

	@Override
	public void PostDelete(PostVo postVo) {
		sql.delete("post.PostDelete", postVo);
	}

}
