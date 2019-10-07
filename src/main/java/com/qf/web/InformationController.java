package com.qf.web;

import com.qf.domain.Information;
import com.qf.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InformationController {
    @Autowired
    private InformationService informationService;
    @RequestMapping("/selectAllI")
    public List<Information> selectAll(){
        return informationService.selectAll();
    }
    @RequestMapping("/saveI")
    public void save(@RequestBody Information information){
        informationService.save(information);
    }
    @RequestMapping("/deleteI")
    public String deleteI(@RequestBody Information information){
        Integer iid=information.getIid();
        informationService.delete(iid);
        return "删除成功";
    }
    @RequestMapping("/selectOneI")
    public Information selectOne(@RequestBody Information information){
        Integer iid=information.getIid();
        return informationService.selectOne(iid);
    }
    @RequestMapping("/updateI")
    public String update(@RequestBody Information information){
        informationService.save(information);
        return "修改成功";
    }
}
