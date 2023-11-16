package com.tsib.chungrim.dao;

import com.tsib.chungrim.mapper.memberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

    @Autowired
    private memberMapper memberMapper;

    public int test(String id, String pw){
        System.out.println("여기는 DAO입니다.");
        System.out.println(id + pw);

        return memberMapper.test(id, pw);
    }

}
