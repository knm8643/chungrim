package com.tsib.chungrim.controller;

import com.tsib.chungrim.dto.MemberDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
public class MemberController {

    @RequestMapping("/memberJoin")
    @ResponseBody
    public String memberJoin() {
        System.out.println("회원가입");
        return "성공";
    }

    @PostMapping("/memberLogin")
    @ResponseBody
    public String memberLogin(@RequestBody MemberDto MemberDto) {
        String loginpass = MemberDto.getLoginpass();
        String checkid = MemberDto.getCheckid();
        String checkpw = MemberDto.getCheckpw();

        System.out.println(loginpass + checkid + checkpw);
        return "성공";
    }
}
