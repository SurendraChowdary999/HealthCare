package com.slokam.Helthcare2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.Helthcare2.Entity.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long>{

}
