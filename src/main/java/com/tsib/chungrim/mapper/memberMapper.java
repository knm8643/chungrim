package com.tsib.chungrim.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface memberMapper {
    public int test(String id, String pw);

    public Integer selectId(String id, String pw);
}

