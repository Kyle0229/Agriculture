package com.qf.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Appointment {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer aid;
    Integer sid;
    Integer uid;
    String uaddress;
    Date ocreatetime;
    String info;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Date getOcreatetime() {
        return ocreatetime;
    }

    public void setOcreatetime(Date ocreatetime) {
        this.ocreatetime = ocreatetime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "aid=" + aid +
                ", uaddress='" + uaddress + '\'' +
                ", ocreatetime=" + ocreatetime +
                '}';
    }
}
