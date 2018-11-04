package com.slokam.Helthcare2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Helthcare2.Dao.DoctorDao;
import com.slokam.Helthcare2.Entity.Doctor;


@RestController
public class DoctorController {
	@Autowired
private DoctorDao dao;
	@RequestMapping("saveDoctor")
	public void saveDoctor(@RequestBody Doctor d){
		dao.save(d);
	}
	@RequestMapping("saveAllDoctor")
	public void saveAllDoctor(@RequestBody List<Doctor> d){
		dao.saveAll(d);
	}
}
