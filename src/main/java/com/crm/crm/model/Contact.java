package com.crm.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Contact {
  // changed private to public for testing
  // because postman get-request on /api/contacts did not show contact created in DemoLoader
  public @Id @GeneratedValue Long Id;
  // changed private to public for testing
  public String firstName; 
  // changed private to public for testing
  public String lastName;
  // changed private to public for testing
  public String email;
  
  // changed private to public for testing
  public Contact() {}

  public Contact(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }
}