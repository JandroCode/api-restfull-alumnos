package com.example.demo.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.IAlumnoDAO;
import com.example.demo.model.entity.Alumno;
import com.example.demo.model.service.IAlumnoService;

@Service
public class AlumnoServiceImpl  implements IAlumnoService{
	
	@Autowired
	private IAlumnoDAO alumnoDao;

	@Override
	public List<Alumno> getALumnos() {
		return alumnoDao.findAll() ;
	}

	@Override
	public Alumno findAlumnoById(Long id) {
		return alumnoDao.findById(id).orElse(null);
	}

	@Override
	public Alumno saveALumno(Alumno alumno) {
		return alumnoDao.save(alumno);
	}

	@Override
	public void delete(Long id) {
		alumnoDao.deleteById(id);
		
	}

	

	
}
