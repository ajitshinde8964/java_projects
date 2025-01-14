package com.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.Model.Company;
import com.Service.CompanyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/company")

public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@PostMapping("/save")
	public String postcompany(@RequestBody Company company) {
		companyService.postcompany(company);
		return "This data save successfully";
		
	}
	@GetMapping("/getall")
	public List<Company>getAllcompany(){
		List<Company> allcompany = companyService.getAllcompany();
		return allcompany;	
	}
	
	@DeleteMapping("delete/{Custumerid}")
	public String deleteByid(@PathVariable ("Custumerid")Long id) {
		companyService.deleteByid (id);
		return "this data is deleted successfully";
		
	}
	
	@PutMapping("/put")
	public String updateByid(@RequestBody Company company) {
		companyService.updateByid(company);
		return "Data is updated";
		
	}
	
	
}

