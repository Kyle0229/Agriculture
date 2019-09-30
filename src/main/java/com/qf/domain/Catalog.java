package com.qf.domain;

import lombok.Data;

@Data
public class Catalog {
    Integer cid;
    String caname;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCaname() {
        return caname;
    }

    public void setCaname(String caname) {
        this.caname = caname;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "cid=" + cid +
                ", caname='" + caname + '\'' +
                '}';
    }
}
