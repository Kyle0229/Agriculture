package com.qf.service.impl;

import com.qf.dao.GoodsRespository;
import com.qf.domain.Goods;
import com.qf.service.GoodsService;
import com.qf.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRespository goodsRespository;
    @Autowired
    private UploadUtils uploadUtils;
    @Override
    public List<Goods> selectAll() {
        return goodsRespository.findAll();
    }

    @Override
    public void save(MultipartFile file, Goods goods) {
        String path="";
        if (file!=null&&file.getOriginalFilename()!=""){
            path=uploadUtils.upload(file);
        }
        goods.setPic(path);
        goodsRespository.save(goods);
    }

    @Override
    public void delete(Integer gid) {
         goodsRespository.deleteById(gid);
    }

    @Override
    public Goods selectOne(Integer gid) {
        Optional<Goods> byId = goodsRespository.findById(gid);
            Goods goods=byId.get();
        return goods;
    }

}
