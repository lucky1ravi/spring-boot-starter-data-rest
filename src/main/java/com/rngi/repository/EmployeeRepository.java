package com.rngi.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.rngi.model.Employee;
import com.rngi.model.NoPassword;

@RepositoryRestResource(exported = true, path = "employee", excerptProjection = NoPassword.class)
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	List<Employee> findByFirstName(String firstName);
	
	
	@RestResource(path = "lastName")
	List<Employee> findByLastName(String lastName, Pageable p);
}
