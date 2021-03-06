package com.qf.service;

import com.qf.domain.Goods;
import com.qf.response.ResponseGoods;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface GoodsService {
    ResponseGoods selectAll(Integer page, Integer size);
    void save(Goods goods);
    void delete(Integer gid);
    Goods selectOne(Integer gid);
    List<Goods> selectAllByCid(Integer cid);
    ResponseGoods selectAllBySid(Integer page, Integer size, HttpSession session);
}
