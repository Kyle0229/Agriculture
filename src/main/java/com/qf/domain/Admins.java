package com.qf.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Admins {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
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
