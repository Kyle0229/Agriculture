package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Goods {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "gid")
    Integer id;
    @Column(name = "gname")
    String name;
    @Column(name = "oaprice")
    Float price;
    @Column(name = "info")
    String info;

//  info  public Integer getGid() {
//        return gid;
//    }
//
//    public void setGid(Integer gid) {
//        this.gid = gid;
//    }
//
//    public String getGname() {
//        return gname;
//    }
//
//    public void setGname(String gname) {
//        this.gname = gname;
//    }
//
//    public Float getOaprice() {
//        return oaprice;
//    }
//
//    public void setOaprice(Float oaprice) {
//        this.oaprice = oaprice;
//    }
//
//    public String getInfo() {
//        return info;
//    }
//
//    public void setInfo(String info) {
//        this.info = info;
//    }
//
//    @Override
//    public String toString() {
//        return "Goods{" +
//                "gid=" + gid +
//                ", gname='" + gname + '\'' +
//                ", oaprice=" + oaprice +
//                ", info='" + info + '\'' +
//                '}';
//    }
}
