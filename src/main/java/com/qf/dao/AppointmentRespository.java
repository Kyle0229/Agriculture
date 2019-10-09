package com.qf.dao;

import com.qf.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRespository extends JpaRepository<Appointment,Integer> {
}
