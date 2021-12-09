package com.edu.pjk.post;

import java.util.Date;

public class PostVo {
	/*게시글 번호*/
	private String postNo;
	
	/*작성자 아이디*/
	private String postId;
	
	/*게시글 제목*/
	private String postTitle;
	
	/*게시글 내용*/
	private String postContents;
	
	/*게시일자*/
	private Date postUpdate;
	
	/*삭제여부*/
	private String postCheckDel;
	
	/*수정횟수*/
	private int postCount;
	
	
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostContents() {
		return postContents;
	}
	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}
	public Date getPostUpdate() {
		return postUpdate;
	}
	public void setPostUpdate(Date postUpdate) {
		this.postUpdate = postUpdate;
	}
	public String getPostCheckDel() {
		return postCheckDel;
	}
	public void setPostCheckDel(String postCheckDel) {
		this.postCheckDel = postCheckDel;
	}
	public int getPostCount() {
		return postCount;
	}
	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}
	
	
	
	
	
}
