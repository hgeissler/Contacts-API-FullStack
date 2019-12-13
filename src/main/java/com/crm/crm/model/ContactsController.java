package com.crm.crm.model;

import java.net.URISyntaxException;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Do the actual api mapping and pass the address that is trying to get access the server
@RestController
@RequestMapping("/api")
// Allow CORS to work
@CrossOrigin(origins = "http://localhost:3000")
class ContactsController {
  private ContactRepository contactRepository;

  public ContactsController(ContactRepository contactRepository) {
    this.contactRepository = contactRepository;
  }

  // Return all contacts from database contact repository
  @GetMapping("/contacts")
  Collection<Contact> contacts() {
    return (Collection<Contact>) contactRepository.findAll();
  }

  // Create new Contacts
  @PostMapping("/contacts")
  ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) throws URISyntaxException {
    Contact result = contactRepository.save(contact);
    return ResponseEntity.ok().body(result);
  }
}