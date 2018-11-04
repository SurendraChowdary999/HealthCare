package com.slokam.Helthcare2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Helthcare2.Dao.ComplaintDao;
import com.slokam.Helthcare2.Entity.Complaint;
import com.slokam.Helthcare2.Entity.Medication;

@RestController
public class ComplaintController {
	@Autowired
private ComplaintDao compalintDao;
	@RequestMapping("saveComplaint")
	public void saveComplaint(@RequestBody Complaint complaint){
		List<Medication> mlist=complaint.getMedicationList();
		for (Medication me : mlist) {
			me.setComplaint(complaint);
		}
		compalintDao.save(complaint);
	}
}
