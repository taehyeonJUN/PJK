package com.edu.pjk.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.pjk.post.PostVo;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostDao postDao;

	@Override
	public List<PostVo> PostList() {
		return postDao.PostList();
	}

	@Override
	public void PostAdd(PostVo postVo) {
		postDao.PostAdd(postVo);
	}

	@Override
	public PostVo PostSelect(PostVo postVo) {
		return postDao.PostSelect(postVo);
	}

	@Override
	public void PostEdit(PostVo postVo) {
		 postDao.PostEdit(postVo);
	}

	@Override
	public void PostDelete(PostVo postVo) {
		postDao.PostDelete(postVo);
	}
	


}
