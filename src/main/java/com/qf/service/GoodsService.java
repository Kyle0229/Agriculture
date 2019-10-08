package com.qf.service;

import com.qf.domain.Goods;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface GoodsService {
    List<Goods> selectAll();
    void save(MultipartFile file, Goods goods);
    void delete(Integer gid);
    Goods selectOne(Integer gid);
    List<Goods> selectAllByCid(Integer cid);
}
