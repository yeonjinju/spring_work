package com.gura.spring05.persistence;

import com.gura.spring05.domain.MemberVO;

public interface MemberDao {
	// 회원가입
	public void signup(MemberVO dto) throws Exception;
	
	// 로그인
	public MemberVO signin(MemberVO dto) throws Exception; 

}
