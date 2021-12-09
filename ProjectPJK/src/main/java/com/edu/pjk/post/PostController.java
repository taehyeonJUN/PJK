package com.edu.pjk.post;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.pjk.Login.MemberVo;
import com.edu.pjk.post.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostService postService;

	/*게시글 목록 조회*/
	/*작성자와 상관 없이 최근것만 노출되는것으로!*/
	/*쿼리 만들때 rnum 부여해서 페이지 구분. 매개변수로 몇번쨰 페이지 가져오는지 지정하는걸로?*/
	/*일단 당장은 그냥 최근 5개만 가져오기*/
	@GetMapping("/postList")
	public String PostList(Map map) {
		
		List<PostVo> postVo = postService.PostList();
		map.put("post", postVo);
		//일단은 주소창으로 직접 전송하고, 추후 제이슨 방식으로 바꾸고, Map타입 변수로 전송방법 변경할것. 
		return "post/postList";
	}


	/*게시글 작성*/
	@GetMapping("/postAdd")
	public String AddForm(PostVo postVo) {

		return "post/postAdd";
	}
	
	/*게시글 작성*/
	@PostMapping("/postAdd")
	public String PostAdd(PostVo postVo, HttpSession session) {
		
		MemberVo memVo = (MemberVo)session.getAttribute("user");
		postVo.setPostId(memVo.getMemId());
		postService.PostAdd(postVo);

		return "/post/postAdd";
	}

	/*게시글 수정 페이지*/
	@GetMapping("/editForm")
	public String PostSelect(PostVo postVo) {

		PostVo Vo = postService.PostSelect(postVo);

		return "";
	}	

	/*게시글 수정*/
	@PostMapping("/edit")
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
