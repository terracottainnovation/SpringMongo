/**
 * 
 */
package com.terracottainnovation.application.repositories;

import java.util.List;

import com.terracottainnovation.application.entity.Person;
import org.springframework.data.repository.Repository;



/**
 * 
 * @author ram
 *
 */

public interface PersonRepository extends Repository<Person, Integer>{

	public void delete (Person person);
	public List<Person> findAll();
	public Person save(Person person);

	//	public List<Person> findByName(String name);
	
}
