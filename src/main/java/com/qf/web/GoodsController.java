package com.qf.web;

import com.alibaba.fastjson.JSON;
import com.qf.domain.Goods;
import com.qf.response.ResponseGoods;
import com.qf.service.GoodsService;
import com.qf.utils.UploadUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Resource
    private UploadUtils uploadUtils;

    private Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @RequestMapping("/upload")
    public String test(MultipartFile file){

        logger.debug("传入的文件参数：{}", JSON.toJSONString(file, true));
        if (Objects.isNull(file) || file.isEmpty()) {
            logger.error("文件为空");
            return "文件为空，请重新上传";
        }else {
            String path = uploadUtils.upload(file);
            return path;
        }
    }

    @RequestMapping("/selectAll/{page}/{size}")
    public ResponseGoods selectAll(@PathVariable Integer page,@PathVariable Integer size){
   /*     ResponseGoods responseGoods=goodsService.selectAll(page,size);
        List list = responseGoods.getList();
        System.out.println(list);*/
        return goodsService.selectAll(page,size);
    }
    @RequestMapping("/selectAllBySid/{page}/{size}")
    public ResponseGoods selectAllBySid(@PathVariable Integer page, @PathVariable Integer size, HttpSession session){
   /*     ResponseGoods responseGoods=goodsService.selectAll(page,size);
        List list = responseGoods.getList();
        System.out.println(list);*/
        return goodsService.selectAllBySid(page,size,session);
    }
    @RequestMapping("/selectAllByCid")
    public List<Goods> selectAllByCid(@RequestParam("id")Integer cid){

        return goodsService.selectAllByCid(cid);
    }
    @RequestMapping("/save")
    public void save(@RequestBody Goods goods){
        goodsService.save(goods);
    }
    @RequestMapping("/delete/{gid}")
    public String delete(@PathVariable Integer gid) {
        goodsService.delete(gid);
        return "删除成功";
    }
    @RequestMapping("/selectGoodsOne")
    public Goods selectGoodsOne (@RequestParam("gid") Integer gid){
        return goodsService.selectOne(gid);
    }
    @RequestMapping("/update")
    public String update(@RequestBody Goods goods){
        goodsService.save(goods);
        return "修改成功";
    }
}
