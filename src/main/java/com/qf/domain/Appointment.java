package com.qf.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Appointment {
    Integer aid;
    String uaddress;
    Date ocreatetime;

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
