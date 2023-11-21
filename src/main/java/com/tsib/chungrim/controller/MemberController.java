package com.tsib.chungrim.controller;

import com.tsib.chungrim.dao.MemberDAO;
import com.tsib.chungrim.dto.MemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
public class MemberController {

    @Autowired
    private MemberDAO memberDAO;

    private MemberDTO sharedMember;
    // 회원관련 로직
    @PostMapping("/memberJoin")
    @ResponseBody
    public String memberJoin(@RequestBody MemberDTO MemberDto) {
        System.out.println(MemberDto);
        System.out.println(MemberDto.getCheckid());
        System.out.println(MemberDto.getCheckpw());
        System.out.println(MemberDto.getLoginpass());

        String id = MemberDto.getCheckid();
        String pw = MemberDto.getCheckpw();

        memberDAO.test(id, pw);
        if (sharedMember == null) {
            // 회원가입 로직은 디비 생기면 더 로직개선 필요
            sharedMember = MemberDto;
            return "Y";
        } else {
            System.out.println("임시 회원가입이라 두번가입은 불가능합니다");
        }
        return "Success";
    }

    @PostMapping("/memberLogin")
    @ResponseBody
    public String memberLogin(@RequestBody MemberDTO MemberDto) {

        System.out.println(MemberDto.getCheckid());
        System.out.println(MemberDto.getCheckpw());

        String id = MemberDto.getCheckid();
        String pw = MemberDto.getCheckpw();

        memberDAO.selectId(id, pw);

        if (sharedMember != null) {
            if(sharedMember.getCheckid().equals(MemberDto.getCheckid())){
                System.out.println("아이디가 일치합니다");
            }else {
                System.out.println("아이디가 일치하지않습니다.");
                return "N";
            }

            if(sharedMember.getCheckpw().equals(MemberDto.getCheckpw())){
                System.out.println("비밀번호가 일치합니다");
                return "Y";
            }else {
                System.out.println("비밀번호가 일치하지않습니다.");
                return "N";
            }
        } else {
            System.out.println("회원가입 정보가 없습니다.");
        }
        return "Success";
    }
    @GetMapping("/memberFind")
    @ResponseBody
    public String memberFind() {
        if (sharedMember == null) {
            // 회원가입 로직은 디비 생기면 더 로직개선 필요
            System.out.println("찾을 정보가 없습니다.");
        } else {
            return sharedMember.getCheckid() +" | "+ sharedMember.getCheckpw();
        }
        return "Success";
    }

}
