package com.qf.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Catalog {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
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
