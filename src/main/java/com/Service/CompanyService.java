package com.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Company;
import com.Repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	CompanyRepository companyRepository;

	public void postcompany(Company company) {
		companyRepository.save(company);
		
	}

	public List<Company>getAllcompany() {
		List<Company> all = companyRepository.findAll();
		return all;
		
	}

	public void deleteByid(Long id) {
		companyRepository.deleteById(id);
		
	}

	public Company  updateByid(Company company) {
		Long id = company.getId();                                     // ctrl 1
		Optional<Company> dbdata = companyRepository.findById(id);     // ctrl 1
		Company compdata = dbdata.get();                               // ctrl 1
		compdata.setId(company.getId());
		compdata.setCompanyName(company.getCompanyName());
		compdata.setEmployee(company.getEmployee());
		Company dbresponse = companyRepository.save(compdata);
		
		return dbresponse;
		
	}

	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	

	
}
