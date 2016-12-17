package com.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.template.bean.Person;
import com.template.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonCtrl {

private PersonService personService;
	
	@Autowired
	public PersonCtrl(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(value="/save", method = RequestMethod.POST)
	public void handlePerson(@RequestBody Person person){
		personService.persist(person);
	}
	
	@RequestMapping(value="/{id}", method =RequestMethod.GET)
	public Person getById(@PathVariable String id){
		return personService.getById(id);
	}
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public Iterable<Person> getAll(){
		return personService.getAllPeople();
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public Person updatePerson(@RequestBody Person person){
		return personService.update(person);
	}
}
