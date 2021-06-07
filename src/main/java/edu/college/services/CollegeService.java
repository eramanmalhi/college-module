package edu.college.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.college.entities.College;
import edu.college.repositories.CollegeRepository;

@Service
public class CollegeService {

	@Autowired
	CollegeRepository colRepo;
	public Iterable<College> findAll() {
		return colRepo.findAll();
	}

	public Optional<College> findById(Integer id) {
		return colRepo.findById(id);
	}

	public College save(College c) {
		return colRepo.save(c);
	}

	public void delete(Integer id) {
		colRepo.deleteById(id);
	}
}
