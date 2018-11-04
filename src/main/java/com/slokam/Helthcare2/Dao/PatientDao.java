package com.slokam.Helthcare2.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.Helthcare2.Entity.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {

	@Query("select p.name,d.name,di.name from Medication m join m.medicne me join m.complaint c join"
			+ " c.disease di join c.visiting v join v.appointment a "
			+ "join v.doctor d join a.patient p where me.name=?1")
	public List<Object[]> getPatientByMedicine(String medicineName);
	
	@Query("select p.name,d.name,di.name from Medication m join m.medicne me join m.complaint c join"
			+ " c.disease di join c.visiting v join v.appointment a "
			+ "join v.doctor d join a.patient p where c.description=?1")
	
	public List<Object[]> getdetailsByComplaint(String compName);
	
	@Query("select p.name from Complaint c join c.disease di join c.visiting v join "
			+ "v.appointment a join a.patient p where di.name=?1")
	public List<String> getPatientByDisease(String diseaseName);
	
	@Query("select p.name from Visiting v join v.doctor d join v.appointment a join a.patient p where d.name=?1")
	public List<String> getPatientByDoctor(String doctName);
	
	@Query("select d.name from Visiting v join v.doctor d join v.appointment a join a.patient p where p.name=?1")
	public List<String> getDoctorByPatient(String patName);
	
	@Query("select p.name from Appointment a join a.patient p where a.dateTime between ?1 and ?2")
	public List<String> getPatientByAppointment(Date appDate,Date appDate2);
}
