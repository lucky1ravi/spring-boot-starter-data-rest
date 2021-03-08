package com.rngi.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "noPassword", types = { Employee.class })
public interface NoPassword {

	Long getId();

	String getCompanyName();

	String getFirstName();

	String getLastName();
	
	Address getAddress();

}