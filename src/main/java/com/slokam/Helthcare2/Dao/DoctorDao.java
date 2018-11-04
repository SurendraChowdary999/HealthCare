package com.slokam.Helthcare2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.Helthcare2.Entity.Doctor;

@Repository
public interface DoctorDao  extends JpaRepository<Doctor, Integer>{

}
