package com.qf.service;
import com.qf.domain.Information;

import java.util.List;

public interface InformationService {
    List<Information> selectAll();
    void save(Information information);
    void delete(Integer iid);
    Information selectOne(Integer iid);
}

