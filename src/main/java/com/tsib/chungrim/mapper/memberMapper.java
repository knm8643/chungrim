package com.tsib.chungrim.mapper;

import org.springframework.stereotype.Repository;

public interface memberMapper {
    public int test(String id, String pw);

    public int selectId(String id, String pw);
}

