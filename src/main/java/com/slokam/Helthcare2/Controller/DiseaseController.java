package com.slokam.Helthcare2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Helthcare2.Dao.DiseaseDao;
import com.slokam.Helthcare2.Entity.Disease;


@RestController
public class DiseaseController {
	@Autowired
private DiseaseDao dao;
	@RequestMapping("saveDisease")
	public void saveDisease(@RequestBody Disease d){
		dao.save(d);
	}
	@RequestMapping("saveAllDiseases")
	public void saveAllDisease(@RequestBody List<Disease> diseases){
		dao.saveAll(diseases);
	}
}
