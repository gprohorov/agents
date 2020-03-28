package com.pro.agents.repository.person;

import com.pro.agents.model.Person;
import com.pro.agents.repository.IGenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends IGenericRepository<Person> {}
