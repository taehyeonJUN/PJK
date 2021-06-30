package com.edu.pjk.Login;

import java.util.Date;

public class MemberVo {
	/*회원번호*/
	private String memNo;
	
	/*회원 ID*/
	private String memId;
	
	/*비밀번호*/
	private String memPass;
	
	/*이름*/
	private String memName;
	
	/*가입일*/
	private Date memJoinDate;
	
	/*삭제여부*/
	private String memCheckDel;
	
	/*권한*/
	private String memAuthor;
	
	/*수정차수*/
	private int memCount;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPass() {
		return memPass;
	}
	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}
	public Date getMemJoinDate() {
		return memJoinDate;
	}
	public void setMemJoinDate(Date memJoinDate) {
		this.memJoinDate = memJoinDate;
	}
	public String getMemCheckDel() {
		return memCheckDel;
	}
	public void setMemCheckDel(String memCheckDel) {
		this.memCheckDel = memCheckDel;
	}
	public String getMemAuthor() {
		return memAuthor;
	}
	public void setMemAuthor(String memAuthor) {
		this.memAuthor = memAuthor;
	}
	public int getMemCount() {
		return memCount;
	}
	public void setMemCount(int memCount) {
		this.memCount = memCount;
	}
	public String getMemNo() {
		return memNo;
	}
	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	
	
	
}
