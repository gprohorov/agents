package com.pro.agents.repository.person;

import com.pro.agents.model.Person;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;



@Repository("fakeperson")
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
                .filter(person -> person.getId().equals(id)).findFirst().orElse(null);
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
            new Person("1", "Smirnov", "1111", " Odessa", " Arnautskaya str.5/7", true, LocalDate.now().minusYears(44),"Учасник АТО"),
            new Person("2", "Moroz", "44444", " Riev", " Hreshatik str.7/11", true, LocalDate.now().minusYears(44), "Гепатит"),
            new Person("3", "Petrov", "2222", " Lviv", " Bandery str.114/78", true, LocalDate.now().minusYears(40))

    );


}
