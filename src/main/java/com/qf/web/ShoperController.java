package com.qf.web;

import com.qf.domain.Shoper;
import com.qf.response.ResponseShoper;
import com.qf.service.ShoperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShoperController {
    @Autowired
    private ShoperService shoperService;
    @RequestMapping("/selectAllS/{page}/{size}")
    public ResponseShoper selectAll(@PathVariable Integer page, @PathVariable Integer size){
        return shoperService.selectAllS(page,size);
    }
    @RequestMapping("/saveS")
    public void save(@RequestBody Shoper shoper){
        shoperService.saveS(shoper);
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
}
