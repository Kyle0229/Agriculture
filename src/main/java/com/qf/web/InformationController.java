package com.qf.web;

import com.qf.domain.Information;
import com.qf.response.ResponseInformation;
import com.qf.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InformationController {
    @Autowired
    private InformationService informationService;
    @RequestMapping("/selectAllI/{page}/{size}")
    public ResponseInformation selectAll(@PathVariable Integer page,@PathVariable Integer size){
        return informationService.selectAllI(page,size);
    }
    @RequestMapping("/saveI")
    public void save(@RequestBody Information information){
        informationService.save(information);
    }
    @RequestMapping("/deleteI/{iid}")
    public String deleteI(@PathVariable Integer iid){
        informationService.delete(iid);
        return "删除成功";
    }
    @RequestMapping("/selectOneI")
    public Information selectOne(@RequestParam("iid") Integer iid){
        return informationService.selectOne(iid);
    }
    @RequestMapping("/updateI")
    public String update(@RequestBody Information information){
        informationService.save(information);
        return "修改成功";
    }
}
