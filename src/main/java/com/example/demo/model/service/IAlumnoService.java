package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.entity.Alumno;

public interface IAlumnoService {
	List<Alumno> getALumnos();
	Alumno findAlumnoById(Long id);
	Alumno saveALumno(Alumno alumno);
	void delete(Long id);
	
}
