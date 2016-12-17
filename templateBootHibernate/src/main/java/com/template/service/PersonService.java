package com.template.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.template.bean.Person;
import com.template.repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> getAllPeople(){
		return personRepository.getAll();
	}

	public Person getById(String id) {
		//It´s necessary to cast id String to its Long value
		return personRepository.getById(Long.valueOf(id));
	}

	public void persist(Person person) {
		personRepository.persist(person);
	}
	
	public Person update(Person person){
//		Person pedit = personRepository.getById(person.getId());
//		
//		pedit.setName(person.getName());
//		pedit.set
		return personRepository.update(person);
	}
	
}
