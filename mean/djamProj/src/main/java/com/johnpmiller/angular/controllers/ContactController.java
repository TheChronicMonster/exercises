package com.johnpmiller.angular.controllers;

import com.johnpmiller.angular.models.Contact;
import com.johnpmiller.angular.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@Autowired
	ContactRepository contactRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/contacts")
	public Iterable<Contact> contact() {
		return contactRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/contacts")
	public Contact save(@RequestBody Contact contact) {
		contactRepository.save(contact);

		return contact;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/contacts/{id}")
	public Contact show(@PathVariable String id) {
		return contactRepository.findOne(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/contacts/{id}")
	public Contact update(@PathVariable String id, @RequestBody Contact contact) {
		Contact c = contactRepository.findOne(id);
		if (contact.getName() != null)
			c.setName(contact.getName());
		if (contact.getCity() != null)
			c.setAddress(contact.getAddress());
		if (contact.getPhone() != null)
			c.setPhone(contact.getPhone());
		if (contact.getEmail() != null)
			c.setEmail(contact.getEmail());
		contactRepository.save(c);
		return contact;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/contacts/{id}")
	public String delete(@PathVariable String id) {
		Contact contact = contactRepository.findOne(id);
		contactRepository.delete(contact);

		return "";
	}
}
