package com.qf.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data

public class Code {

    private Integer id;
    private String userEmail;
    private String code;
    @Column(name = "createtime")
   // @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    private Integer status;  //状态码，1 有效，0 失效
}
