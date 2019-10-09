package com.qf.service.impl;

import com.qf.dao.AppointmentRespository;
import com.qf.domain.Appointment;
import com.qf.service.AppointmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Resource
    AppointmentRespository appointmentRespository;
    @Override
    public Integer save(Appointment appointment) {
        appointmentRespository.save(appointment);
        return 1;
    }
}
