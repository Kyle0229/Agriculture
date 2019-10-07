package com.qf.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Cart {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer caid;
    String caname;
    Float oaprice;
    Integer cacount;
    Float catotalprice;

    public Integer getCaid() {
        return caid;
    }

    public void setCaid(Integer caid) {
        this.caid = caid;
    }

    public String getCaname() {
        return caname;
    }

    public void setCaname(String caname) {
        this.caname = caname;
    }

    public Float getOaprice() {
        return oaprice;
    }

    public void setOaprice(Float oaprice) {
        this.oaprice = oaprice;
    }

    public Integer getCacount() {
        return cacount;
    }

    public void setCacount(Integer cacount) {
        this.cacount = cacount;
    }

    public Float getCatotalprice() {
        return catotalprice;
    }

    public void setCatotalprice(Float catotalprice) {
        this.catotalprice = catotalprice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "caid=" + caid +
                ", caname='" + caname + '\'' +
                ", oaprice=" + oaprice +
                ", cacount=" + cacount +
                ", catotalprice=" + catotalprice +
                '}';
    }
}
