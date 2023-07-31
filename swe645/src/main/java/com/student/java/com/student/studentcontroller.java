package com.student.java.com.student;
import java.util.List;

import com.student.java.com.student.studentservice;
import com.student.java.com.student.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api")

public class studentcontroller {
    @Autowired
    studentservice stuService;
	@CrossOrigin(origins = "http://localhost:8080")
	
	@PostMapping("/addstudent")
	public student addstudent(@RequestBody student stu) {
	    return stuService.createstudent(stu);
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/students")
	public List<student> readstudent() {
	    return stuService.getstudents();
	}

}

