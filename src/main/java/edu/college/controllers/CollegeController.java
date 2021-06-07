package edu.college.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.college.entities.College;
import edu.college.services.CollegeService;


@RestController
@RequestMapping("/college-info")
public class CollegeController {

	@Autowired
	CollegeService colService;
	
	@GetMapping(path="/colleges")
	public @ResponseBody Iterable<College> findAll()
	{
		return colService.findAll();
	}
	@GetMapping("/colleges/{id}")
	public Optional<College> findById(@PathVariable("id")  Integer id)
	{
		return colService.findById(id);
	}
	
	@PostMapping("/colleges")
	public College save(@RequestBody College s)
	{
		return colService.save(s);
	}
	@PutMapping("/colleges/{id}")
	public Optional<College> update(@PathVariable("id") Integer id, @RequestBody College c)
	{
		Optional<College> col=colService.findById(id);
		col.ifPresent(
				cl -> {
					cl.setCollegeId(id);
					cl.setCollegeAddress(c.getCollegeAddress());
					cl.setCollegeEmail(c.getCollegeEmail());
					cl.setCollegeName(c.getCollegeName());
					colService.save(cl);
				}
				);
		return colService.findById(id);
	}
	@DeleteMapping("/colleges/{id}")
	public String delete(@PathVariable("id") Integer id)
	{
		colService.delete(id);
		return "RECORD DELETED FOR: "+id;
	}
}
