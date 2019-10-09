package com.qf.web;

import com.qf.dao.ShoperRespository;
import com.qf.domain.Appointment;
import com.qf.domain.Shoper;
import com.qf.domain.User;
import com.qf.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class AppointmentController {
    @Autowired
    AppointmentService appointmentServiceImpl;
    @Resource
    ShoperRespository shoperRespository;
    @RequestMapping("/saveAppointment")
    public Shoper saveAppointment(@RequestBody Appointment appointment , HttpSession session){
        User user = (User)session.getAttribute("user");
        appointment.setUid(user.getUid());
        Integer res =appointmentServiceImpl.save(appointment);
        Shoper shoper = shoperRespository.findById(appointment.getSid()).get();
        return shoper;
    }
}
