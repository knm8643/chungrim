package com.tsib.chungrim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin("*")
public class HomeController {
    // 메인에 게시물 뿌려주는 로직
    @GetMapping("/getHomePage")
    @ResponseBody
    public List<Map<String, Object>> getHomePage() {
        List<Map<String, Object>> dummyData = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Map<String, Object> item = new HashMap<>();
            item.put("ptSeq", i);
            item.put("ptPhoto", "");
            item.put("ptTitle", "제목 " + i);
            item.put("ptSub", "내용 " + i);
            item.put("ptTag", "태그 " + i);

            dummyData.add(item);
        }

        return dummyData;
    }
}
