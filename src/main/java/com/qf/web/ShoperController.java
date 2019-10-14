package com.qf.web;

import com.alibaba.fastjson.JSON;
import com.qf.domain.Shoper;
import com.qf.domain.User;
import com.qf.response.ResponseShoper;
import com.qf.service.ShoperService;
import com.qf.utils.UploadUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Objects;

@RestController
public class ShoperController {
    @Resource
    UploadUtils uploadUtils;
    @Autowired
    private ShoperService shoperService;
    @RequestMapping("/selectAllS/{page}/{size}")
    public ResponseShoper selectAll(@PathVariable Integer page, @PathVariable Integer size){
        return shoperService.selectAllS(page,size);
    }
    @RequestMapping("/saveS")
    public void saveU(@RequestBody Shoper shoper){
        shoperService.saveS(shoper);
    }
    @RequestMapping("/saveSMd5")
    public void save(@RequestBody Shoper shoper){
        shoperService.save(shoper);
    }
    @RequestMapping("/deleteS/{Sid}")
    public String deleteS(@PathVariable Integer Sid){
        shoperService.deleteS(Sid);
        return "删除成功";
    }
    @RequestMapping("/selectOneS")
    public Shoper selectOne(@RequestParam("sid") Integer sid){
        return shoperService.selectOneS(sid);
    }
    @RequestMapping("/updateS")
    public String updateS(@RequestBody Shoper shoper){
        shoperService.saveS(shoper);
        return "修改成功";
    }
    private Logger logger = LoggerFactory.getLogger(GoodsController.class);

}
