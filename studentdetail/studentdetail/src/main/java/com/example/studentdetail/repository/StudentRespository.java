package com.example.studentdetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentdetail.entity.Details;

public interface StudentRespository extends JpaRepository <Details ,Integer>{

	@SuppressWarnings("unchecked")
	Details save(Details d);

}
