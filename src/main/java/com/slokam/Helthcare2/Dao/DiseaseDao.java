package com.slokam.Helthcare2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.Helthcare2.Entity.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease, Integer>{

}
