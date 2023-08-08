package com.bridgelabcfp.SpringBootP.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabcfp.SpringBootP.entity.ModelDemo;
import com.bridgelabcfp.SpringBootP.repository.RepositoryDemo;

@Service
public class ServiceDemo implements IService{

	@Autowired
	private RepositoryDemo repo;
	
	@Override
	public String print() {
		
		return "Welocome to bg";
	}

	@Override
	public String pass() {
		String response = "My name is prakash";
		return response;
	}

	@Override
	public String addingData(ModelDemo model) {
		String details = "My name is :"+model.getFirstName()+" "+model.getLastName();
		return details;
	}

	@Override
	public String postData(String firstName, String lastName, int salary) {
		String val = "My updated name is :"+firstName+" "+lastName;
		return val;
	}

	@Override
	public ModelDemo adduser(ModelDemo model) {
		ModelDemo user = new ModelDemo(model);
		repo.save(user);
		return user;
	}

	@Override
	public List<ModelDemo> getAllData() {
		return repo.findAll();
	
	}

	@Override
	public ModelDemo getData(int id) {
		Optional<ModelDemo> user = repo.findById(id);
		return user.get();
	}

	@Override
	public String deleteData(int id) {
		repo.deleteById(id);
		return "Deleted Sucessfully!";
	}

	@Override
	public ModelDemo update(int id, ModelDemo model) {
		ModelDemo user =  repo.findById(id).get();
		user.setFirstName(model.getFirstName());
		user.setLastName(model.getLastName());
		user.setSalary(model.getSalary());
		repo.save(user);
		
		return user;
	}

	
	

	
}
