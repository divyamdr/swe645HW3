package com.student.java.com.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.java.com.student.student;
import com.student.java.com.student.studentrepository;
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



