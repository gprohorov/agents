package com.pro.agents.repository.person;

import com.pro.agents.model.Person;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Repository("fake")
public class PersonRepositoryFakeImpl implements IPersonRepository {

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
        return this.getAll().stream()
                .filter(person -> person.getId().equals(id)).findFirst().get();
    }

    @Override
    public Person delete(String id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return this.list;
    }


    private List<Person> list = Arrays.asList(
            new Person("1", "Ivanov", "1111", " Odessa", " Arnautskaye str.5", true, LocalDate.now().minusYears(44)),
            new Person("2", "Petrov", "2222", " Lviv", " Bandery str.5", true, LocalDate.now().minusYears(40))

    );


}
