package com.qf.domain;

import lombok.Data;

import java.util.Date;
@Data
public class Order {
    Integer oid;
    String oname;
    Float oaprice;
    Integer cacount;
    String uaddress;
    Date ocreatetime;
}
