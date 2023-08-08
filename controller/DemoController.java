package com.bridgelabcfp.SpringBootP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabcfp.SpringBootP.entity.ModelDemo;
import com.bridgelabcfp.SpringBootP.service.IService;
import com.bridgelabcfp.SpringBootP.service.ServiceDemo;

@RestController
public class DemoController {

	@Autowired
	IService service; 
	
	@RequestMapping(value="/demo", method = RequestMethod.GET)
	@ResponseBody
	public String print()
	{
		return "Hello World!";
	}
	
	@GetMapping("/login")
	public String login()
	{
		
		return service.print();
	}
	
	@GetMapping("/prakash")
	public String register()
	{ 
		return "Succefully!";
	}
	
	@GetMapping("/dark")
	public String test()
	{
		String res = service.pass();
		return res;
	}
	
	@PostMapping("/post")
	public String addData(@RequestBody  ModelDemo model)
	{
		String responsee = service.addingData(model);
		return responsee;
	}
	
	@PostMapping("/newUser/{salary}")
	public String storingData(@RequestHeader String firstName, @RequestHeader String lastName, @PathVariable int salary)
	{
		String response = service.postData(firstName,lastName, salary);
		return response;
	}
	
	@PostMapping("/send")
	public ModelDemo sendData(@RequestBody ModelDemo model)
	{
		ModelDemo user = service.adduser(model);
		return user;
	}
	
	@GetMapping("/getAll")
	public List<ModelDemo> getAll()
	{
		List<ModelDemo> allData = service.getAllData();
		return allData;
	}
	
	@GetMapping("/getByID/{Id}")
	public ModelDemo getEmp(@PathVariable int Id)
	{
		ModelDemo byId =service.getData(Id);
		return byId;
	}
	
	@DeleteMapping("/deleteByID/{Id}")
	public String deleteEmp(@PathVariable int Id)
	{
		String delete =service.deleteData(Id);
		return delete;
	}
	
	@PutMapping("/updateByID/{Id}")
	public ModelDemo update(@PathVariable int Id, @RequestBody ModelDemo model)
	{
		ModelDemo user = service.update(Id, model);
		return user;
		
	}
	
	
	
}
