package com.edu.pjk.post;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.edu.pjk.post.service.PostService;


@Controller("/post")
public class PostController {

	@Autowired
	PostService postService;

	/*게시글 목록 조회*/
	/*작성자와 상관 없이 최근것만 노출되는것으로!*/
	/*쿼리 만들때 rnum 부여해서 페이지 구분. 매개변수로 몇번쨰 페이지 가져오는지 지정하는걸로?*/
	/*일단 당장은 그냥 최근 5개만 가져오기*/
	public String PostList(Map map) {

		List<PostVo> postVo = postService.PostList();

		return "";
	}



	/*게시글 작성*/
	public String PostAdd(PostVo postVo) {

		postService.PostAdd(postVo);

		return "";
	}

	/*게시글 수정 페이지*/
	public String PostSelect(PostVo postVo, Map map) {

		PostVo Vo = postService.PostSelect(postVo);

		return "";
	}	

	/*게시글 수정*/
	public String PostEdit(PostVo postVo, Map map) {

		postService.PostEdit(postVo);

		return "";
	}	

	/*게시글 삭제*/
	public String PostDelete(Map map,PostVo postVo) {

		postService.PostDelete(postVo);

		return "";
	}

}
