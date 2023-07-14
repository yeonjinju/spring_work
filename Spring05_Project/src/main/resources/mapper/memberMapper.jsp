<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" 
	"http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="member">
   
   	<!-- 회원가입 -->
   	<insert id="insert">
		INSERT INTO tbl_member(userId, userPass, userName, userPhon)
			VALUES(#{userId}, #{userPass}, #{userName}, #{userPhon})
	</insert>
	
	<!-- 로그인 -->
	<select id="signin" resultType="MemberDto">
		 SELECT userId, userName, userPass, userPhon, userAddr1, userAddr2, userAddr3, regiDate, verify
		 FROM tbl_member
		 WHERE userId=#{userId}
	</select>
</mapper>








