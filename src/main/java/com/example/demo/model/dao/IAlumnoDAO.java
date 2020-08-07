package com.example.demo.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.Alumno;

@Repository
public interface IAlumnoDAO  extends JpaRepository<Alumno, Long>{
	

}
