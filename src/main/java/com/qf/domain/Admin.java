package com.qf.domain;

import lombok.Data;

@Data
public class Admin {
    Integer apid;
    String apname;
    String appassword;

    public Integer getApid() {
        return apid;
    }

    public void setApid(Integer apid) {
        this.apid = apid;
    }

    public String getApname() {
        return apname;
    }

    public void setApname(String apname) {
        this.apname = apname;
    }

    public String getAppassword() {
        return appassword;
    }

    public void setAppassword(String appassword) {
        this.appassword = appassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "apid=" + apid +
                ", apname='" + apname + '\'' +
                ", appassword='" + appassword + '\'' +
                '}';
    }
}
