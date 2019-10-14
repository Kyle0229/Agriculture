package com.qf.service;

import com.qf.domain.Admins;

public interface AdminService {
    Admins findByApname(String name);
}
