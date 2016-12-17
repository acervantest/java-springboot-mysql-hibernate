package com.template.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.template.bean.Person;

@Repository
@Transactional
public class PersonRepository {

	@Autowired
	  private SessionFactory _sessionFactory;
	  
	  private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List<Person> getAll() {
	    return getSession().createQuery("from Person").list();
	  }

	public Person getById(Long id) {
		return (Person) getSession().get(Person.class, id);
	}

	public void persist(Person person) {
		getSession().save(person);
	}
	
	public Person update(Person person){
		getSession().update(person);
		return person;
	}
}
