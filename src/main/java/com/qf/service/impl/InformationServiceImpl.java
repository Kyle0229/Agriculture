package com.qf.service.impl;

import com.qf.dao.InformationRespository;
import com.qf.domain.Information;
import com.qf.domain.User;
import com.qf.response.ResponseInformation;
import com.qf.response.ResponseUser;
import com.qf.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    private InformationRespository informationRespository;
    @Override
    public ResponseInformation selectAllI(Integer page, Integer size) {
        Pageable pages=PageRequest.of(page-1,size);
        Page<Information> all=informationRespository.findAll(pages);
        ResponseInformation res=new ResponseInformation();
        res.setList(all.getContent());
        res.setTotal(all.getTotalElements());
        return res;
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
