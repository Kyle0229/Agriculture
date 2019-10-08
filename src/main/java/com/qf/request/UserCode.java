package com.qf.request;

import com.qf.domain.User;
import lombok.Data;

@Data
public class UserCode {
    private User user;
    private String code;
}
