package com.qf.service.impl;

import com.qf.dao.InformationRespository;
import com.qf.domain.Information;
import com.qf.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    private InformationRespository informationRespository;
    @Override
    public List<Information> selectAll() {
        return informationRespository.findAll();
    }

    @Override
    public void save(Information information) {
        informationRespository.save(information);
    }

    @Override
    public void delete(Integer iid) {
        informationRespository.deleteById(iid);
    }

    @Override
    public Information selectOne(Integer iid) {

        Optional<Information> byId = informationRespository.findById(iid);
        Information information=byId.get();
        return information;
    }
}
