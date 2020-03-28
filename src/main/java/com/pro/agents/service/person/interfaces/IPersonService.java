package com.pro.agents.service.person.interfaces;

import com.pro.agents.model.Agency;
import com.pro.agents.model.Person;

import java.util.List;

public interface IPersonService {

    public Person create(Person person);

    public Person update(Person person);

    public Person get(String id);

    public Person delete(String id);

    public List<Person> getAll();

}
