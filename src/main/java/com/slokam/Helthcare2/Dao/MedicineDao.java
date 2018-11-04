package com.slokam.Helthcare2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.Helthcare2.Entity.Medicine;

@Repository
public interface MedicineDao extends JpaRepository<Medicine, Integer> {

}
