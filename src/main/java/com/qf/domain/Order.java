package com.qf.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
public class Order {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer oid;
    Integer uid;
    String oname;
    Float oaprice;
    Integer cacount;
    String uaddress;
    Date ocreatetime;
    Float catotalprice;
}
