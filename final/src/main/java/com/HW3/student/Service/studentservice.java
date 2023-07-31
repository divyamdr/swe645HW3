package com.HW3.student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HW3.student.model.student;
import com.HW3.student.repository.studentrepository;
import java.util.List;

@Service
public class studentservice {

	@Autowired
	studentrepository sturespository;
	// CREATE 
	public student createstudent(student s) {
	    return sturespository.save(s);
	}

	// READ
	public List<student> getstudents() {
	    return sturespository.findAll();
	}

	

}



