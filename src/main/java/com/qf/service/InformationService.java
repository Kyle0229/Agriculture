package com.qf.service;
import com.qf.domain.Information;
import com.qf.response.ResponseInformation;

import java.util.List;

public interface InformationService {
    ResponseInformation selectAllI(Integer page, Integer size);
    void save(Information information);
    void delete(Integer iid);
    Information selectOne(Integer iid);
}

