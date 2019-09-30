package com.qf.domain;

import lombok.Data;

@Data
public class Code {
    Integer id;
    String email;
    String code;
    Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
                ", email='" + email + '\'' +
                ", code='" + code + '\'' +
                ", status=" + status +
                '}';
    }
}
