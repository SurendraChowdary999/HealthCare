package com.slokam.Helthcare2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Helthcare2.Dao.VisitingDao;
import com.slokam.Helthcare2.Entity.Visiting;


@RestController
public class VisitingController {
	@Autowired
private  VisitingDao visitingDao;
	@RequestMapping("saveVisiting")
	public void saveVisiting(@RequestBody Visiting vis){
		visitingDao.save(vis);
	}
	@RequestMapping("saveAllVisiting")
	public void saveAllVisiting(@RequestBody List<Visiting> vislist){
		visitingDao.saveAll(vislist);
	}
}
