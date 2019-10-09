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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", userEmail='" + userEmail + '\'' +
                ", code='" + code + '\'' +
                ", createTime=" + createTime +
                ", status=" + status +
                '}';
    }
}
