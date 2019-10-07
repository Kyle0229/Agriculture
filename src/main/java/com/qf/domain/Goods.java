package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Goods {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer gid;
    String gname;
    Float oaprice;
    String pic;
    String info;
    Integer cid;
    Integer caid;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCaid() {
        return caid;
    }

    public void setCaid(Integer caid) {
        this.caid = caid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Float getOaprice() {
        return oaprice;
    }

    public void setOaprice(Float oaprice) {
        this.oaprice = oaprice;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", oaprice=" + oaprice +
                ", info='" + info + '\'' +
                '}';
    }
}
