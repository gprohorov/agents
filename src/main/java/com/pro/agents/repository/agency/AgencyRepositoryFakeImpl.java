package com.pro.agents.repository.agency;

import com.pro.agents.model.Agency;
import com.pro.agents.model.AgencyStatus;
import com.pro.agents.model.Agent;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Repository("fake-agency")
public class AgencyRepositoryFakeImpl implements AgencyRepository {

    @Override
    public Agency create(Agency agency) {
        int id = this.agencies.stream().mapToInt(Agency::getId).max().orElse(0);
        agency.setId(id++);
        this.agencies.add(agency);
        return agency;
    }

    @Override
    public Agency update(Agency agency) {
        return null;
    }

    @Override
    public Agency get(String id) {
        return null;
    }

    public Agency get(int id) {
        return this.getAll().stream().filter(agency -> agency.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public Agency delete(String id) {
        return null;
    }


    public Agency delete(int id) {
        return null;
    }

    @Override
    public List<Agency> getAll() {
        return this.agencies;
    }


    private List<Agency> agencies = Arrays.asList(

            new Agency(1, "JoinUp", Agent.COMPANY, "Киев, Хрещатик, 27, оф.12", "+38 (044) 303-99-99",
                    " Иван Иваныч Иванов", AgencyStatus.PRIMARY, 10,
                    "", LocalDateTime.now(), LocalDateTime.now()),

            new Agency(2, "Море Туров", Agent.COMPANY, "вулиця Харківська, 11, Дніпро́, Дніпропетровська область, 49000", "+38 (044) 303-99-99",
                    " Ольга Кравчук", AgencyStatus.PRIMARY, 10,
                    "", LocalDateTime.now(), LocalDateTime.now()),

            new Agency(3, "AnexTour", Agent.COMPANY, "Одесса, Шевченко, 41, 4", "067 104 7432",
                    " Петро Петрович Петренко", AgencyStatus.PRIMARY, 10,
                    "", LocalDateTime.now(), LocalDateTime.now())


    );



}
