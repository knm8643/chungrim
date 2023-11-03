package com.tsib.chungrim.dto;

public class MemberDto {
    private String loginpass;
    private String checkid;
    private String checkpw;

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
    }

    public String getCheckid() {
        return checkid;
    }

    public void setCheckid(String checkid) {
        this.checkid = checkid;
    }

    public String getCheckpw() {
        return checkpw;
    }

    public void setCheckpw(String checkpw) {
        this.checkpw = checkpw;
    }
}
