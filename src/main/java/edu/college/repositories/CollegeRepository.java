package edu.college.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.college.entities.College;
@Repository
public interface CollegeRepository extends CrudRepository<College, Integer>{

}
