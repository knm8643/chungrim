package com.tsib.chungrim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@CrossOrigin("*")
public class WriteController {

    // 글작성 및 삭제 관련 로직

    @PostMapping("/savePost")
    @ResponseBody
    public String savePost(
            @RequestParam("markdownText") String markdownText,
            @RequestParam("tags") String tags,
            @RequestParam("previewImage") MultipartFile previewImage
    ) {
        if (markdownText.isEmpty() || tags.isEmpty() || previewImage.isEmpty()) {
            return "입력한 값중 하나가 비어있군요 자바단에서 세부 코드 다시 작성하시길~";
        } else {
            // 처리 로직
            return "Success";
        }
    }
}
