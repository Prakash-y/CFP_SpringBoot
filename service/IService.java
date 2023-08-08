package com.bridgelabcfp.SpringBootP.service;

import java.util.List;

import com.bridgelabcfp.SpringBootP.entity.ModelDemo;

public interface IService {

	String print();

	String pass();

	String addingData(ModelDemo model);

	String postData(String firstName, String lastName, int salary);

	ModelDemo adduser(ModelDemo model);

	List<ModelDemo> getAllData();

	ModelDemo getData(int id);

	String deleteData(int id);

	ModelDemo update(int id, ModelDemo model);

	

	

}
