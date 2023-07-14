package com.gura.spring05.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gura.spring05.domain.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Inject
	private SqlSession sql;
	
	// 매퍼
	private static String namespace = "com.gura.spring05.mappers.MemberMappers";

	// 회원가입
	@Override
	public void signup(MemberVO dto) throws Exception {
		sql.insert(namespace+".signup", dto);
		
	}
	
	// 로그인
	@Override
	public MemberVO signin(MemberVO dto) throws Exception{
		return sql.selectOne(namespace+".signin",dto);
	}
	


}


















