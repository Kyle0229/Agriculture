package com.qf.domain;

import lombok.Data;

@Data
public class Information {
    Integer iid;
    Integer iname;
    String inews;

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
                '}';
    }
}
