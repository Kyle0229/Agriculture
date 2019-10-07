package com.qf.web;

import com.qf.domain.Goods;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/selectAll")
    public List<Goods> selectAll(){
        return goodsService.selectAll();
    }
    @RequestMapping("/save")
    public void save(@RequestBody Goods goods){
         goodsService.save(goods);
    }
    @RequestMapping("/delete")
    public String delete(@RequestBody Goods goods) {
        Integer gid = goods.getGid();
        goodsService.delete(gid);
        return "删除成功";
    }
    @RequestMapping("/selectOne")
    public Goods selectOne (@RequestBody Goods goods){
        Integer gid=goods.getGid();
        return goodsService.selectOne(gid);
    }
    @RequestMapping("/update")
    public String update(@RequestBody Goods goods){
        goodsService.save(goods);
        return "修改成功";
    }
}
