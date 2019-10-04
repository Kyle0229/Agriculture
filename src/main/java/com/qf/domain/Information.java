package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer iid;
    Integer cid;
    Integer iname;
    String inews;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getIname() {
        return iname;
    }

    public void setIname(Integer iname) {
        this.iname = iname;
    }

    public String getInews() {
        return inews;
    }

    public void setInews(String inews) {
        this.inews = inews;
    }

    @Override
    public String toString() {
        return "Information{" +
                "iid=" + iid +
                ", iname=" + iname +
                ", inews='" + inews + '\'' +
                ", cid=" + cid +
                '}';
    }
}
