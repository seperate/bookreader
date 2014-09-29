package com.eyup.book.reader.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.eyup.book.reader.model.Person;

@Transactional
public class PersonDaoImpl {

		@PersistenceContext(unitName = "jpaData")
		private EntityManager em;
		
		public Long save (Person person){
			em.persist(person);
			return person.getId();
		}
		
		public List <Person>getAll(){
			return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
		}
		
}
