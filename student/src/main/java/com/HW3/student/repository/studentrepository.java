package com.HW3.student.repository;
import com.HW3.student.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface studentrepository extends JpaRepository<student, Long> {

}
