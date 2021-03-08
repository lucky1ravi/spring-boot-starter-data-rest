package com.rngi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rngi.model.Address;

@RepositoryRestResource(exported = true, path = "address")
public interface AddressRepository extends JpaRepository<Address, Long>{

}
