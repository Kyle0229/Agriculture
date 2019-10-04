package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Shoper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer sid;
    String sname;
    String spassword;
    String saddress;
    String semail;
    String stel;
    Integer aid;
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    @Override
    public String toString() {
        return "Shoper{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", spassword='" + spassword + '\'' +
                ", saddress='" + saddress + '\'' +
                ", semail='" + semail + '\'' +
                ", stel='" + stel + '\'' +
                ", aid=" + aid +
                '}';
    }
}
