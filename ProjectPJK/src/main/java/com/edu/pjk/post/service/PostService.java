package com.edu.pjk.post.service;

import java.util.List;

import com.edu.pjk.post.PostVo;

public interface PostService {

	List<PostVo> PostList();

	void PostAdd(PostVo postVo);

	PostVo PostSelect(PostVo postVo);

	void PostEdit(PostVo postVo);

	void PostDelete(PostVo postVo);



}
