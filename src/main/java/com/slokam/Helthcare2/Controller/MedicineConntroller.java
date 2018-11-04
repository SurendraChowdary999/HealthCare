package com.slokam.Helthcare2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Helthcare2.Dao.MedicineDao;
import com.slokam.Helthcare2.Entity.Medicine;


@RestController
public class MedicineConntroller {
	@Autowired
private MedicineDao dao;
	@RequestMapping("saveMedicine")
	public void saveMedicine(@RequestBody Medicine m){
		dao.save(m);
	}
	@RequestMapping("saveAllMedicine")
	public void saveAllMedicine(@RequestBody List<Medicine> m){
		dao.saveAll(m);
	}
}
