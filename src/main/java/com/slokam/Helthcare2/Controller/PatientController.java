package com.slokam.Helthcare2.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Helthcare2.Dao.PatientDao;
import com.slokam.Helthcare2.Entity.Patient;


@RestController
@RequestMapping("patient")
public class PatientController {
	@Autowired
private PatientDao dao;
	@PostMapping
	public void savePatient(@RequestBody Patient p){
		dao.save(p);
	}
	@PostMapping("/all")
	public void saveAllPatient(@RequestBody List<Patient> p){
		dao.saveAll(p);
	}
 @GetMapping("/byMedicine/{name}")
 public List<Object[]> getPatientByMedicine(@PathVariable("name") String medicineName){
	 return dao.getPatientByMedicine( medicineName);
 }
 @GetMapping("/byComplaint/{name}")
	public List<Object[]> getdetailsByComplaint(@PathVariable("name") String compName){
		return dao.getdetailsByComplaint(compName);
	}
	@GetMapping("/byDisName/{name}")
	public List<String> getPatientByDisease(@PathVariable("name") String disName){
		return dao.getPatientByDisease(disName);
	}
	
	@GetMapping("/byDoctor/{name}")
	public List<String> getPatientByDoctor(@PathVariable("name") String doctName){
		return dao.getPatientByDoctor(doctName);
	}
	@GetMapping("/byPatient/{name}")
	public List<String> getDoctorByPatient(@PathVariable("name") String patName){
		return dao.getDoctorByPatient(patName);
	}

	@GetMapping("/byappointment/{sdate}/{edate}")
	public List<String> getPatientByAppointment(@PathVariable("sdate") @DateTimeFormat(pattern="yyyy-mm-dd")Date sdate,
			@DateTimeFormat(pattern="yyyy-MM-dd")@PathVariable("edate") Date edate){
		return dao.getPatientByAppointment(sdate, edate);
		
	}
}
