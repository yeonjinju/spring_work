package com.gura.spring05.service;

import javax.servlet.http.HttpSession;

import com.gura.spring05.domain.MemberVO;

public interface MemberService {
	// 회원가입
	public void signup(MemberVO dto) throws Exception;
	
	// 로그인
	public MemberVO signin(MemberVO dto) throws Exception; 
	
	// 로그아웃
	public void signout(HttpSession session) throws Exception; 

}
