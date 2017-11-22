package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;

	private static final String namespace =
			"org.zerock.mapper.MemberMapper";

	@Override
	public String getTime() {
		// 시간 출력
		return sqlSession.selectOne(namespace+".getTime");
	}


	@Override
	public void insertMember(MemberVO vo) {
		// 데이터베이스에 정보 저장
		sqlSession.insert(namespace+".insertMember", vo);
	}


	@Override
	public MemberVO readMember(String userid) throws Exception {
		return (MemberVO) 
				// 유저 정보 읽기
				sqlSession.selectOne(namespace+".selectMember", userid);
	}


	@Override
	public MemberVO readWithPW(String userid, String pw) throws Exception {
		// 유저의 아이디와 비밀번호를 맵타입객체로 저장
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", pw);
		
		// 아이디와 비밀번호 인증
		return sqlSession.selectOne(namespace+".readWithPW", paramMap);
	}

}
