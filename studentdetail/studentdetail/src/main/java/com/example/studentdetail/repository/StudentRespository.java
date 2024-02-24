package com.example.studentdetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentdetail.entity.details;

public interface StudentRespository extends JpaRepository <details ,Integer>{

	details save(details d);

}
