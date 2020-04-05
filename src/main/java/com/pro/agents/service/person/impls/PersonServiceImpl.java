package com.pro.agents.service.person.impls;

import com.pro.agents.model.Person;
import com.pro.agents.repository.person.IPersonRepository;
import com.pro.agents.service.person.interfaces.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {


    private final IPersonRepository repository;

    @Autowired
    public PersonServiceImpl(@Qualifier("fakeperson") IPersonRepository repository) {
        this.repository = repository;
    }


    @Override
    public Person create(Person person) {
        return null;
    }

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public Person get(String id) {
        return this.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public Person delete(String id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return repository.getAll();
    }
}
