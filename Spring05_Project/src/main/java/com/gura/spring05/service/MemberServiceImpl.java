package com.gura.spring05.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gura.spring05.domain.MemberVO;
import com.gura.spring05.persistence.MemberDao;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	private MemberDao dao;

	// 회원가입
	@Override
	public void signup(MemberVO dto) throws Exception {
		dao.signup(dto);
		
	}

	// 로그인
	@Override
	public MemberVO signin(MemberVO dto) throws Exception {
		return dao.signin(dto);
	}

	// 로그아웃
	@Override
	public void signout(HttpSession session) throws Exception {
		session.invalidate();
	}
		

}
















