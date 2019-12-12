package com.crm.crm.model;

import org.springframework.data.repository.CrudRepository;

// pass in the model Contact and Long Id
public interface ContactRepository extends CrudRepository<Contact, Long> {
  
}