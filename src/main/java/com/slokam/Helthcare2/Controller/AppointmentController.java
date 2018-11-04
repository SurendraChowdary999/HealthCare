package com.slokam.Helthcare2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Helthcare2.Dao.AppointmentDao;
import com.slokam.Helthcare2.Entity.Appointment;

@RestController
public class AppointmentController {
	@Autowired
private AppointmentDao appointmentDao;
	@RequestMapping("saveAppointment")
	public void saveAppointment(@RequestBody Appointment appointment){
		appointmentDao.save(appointment);
	}
	@RequestMapping("saveallAppointment")
	public void saveAllAppointment(@RequestBody List<Appointment> appointments){
		appointmentDao.saveAll(appointments);
	}
}
