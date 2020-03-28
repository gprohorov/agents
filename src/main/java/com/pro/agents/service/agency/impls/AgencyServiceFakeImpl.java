package com.pro.agents.service.agency.impls;

import com.pro.agents.model.Agency;
import com.pro.agents.model.AgencyStatus;
import com.pro.agents.model.Agent;
import com.pro.agents.service.agency.interfaces.IAgencyService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class AgencyServiceFakeImpl implements IAgencyService {


    @Override
    public Agency create(Agency agency) {
        return null;
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
        return this.getAll().stream()
                .filter(agent -> agent.getId() == id)
                .findFirst().get();
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
        return this.agents;
    }


    private List<Agency> agents = Arrays.asList(

            new Agency(1, "JoinUp", Agent.COMPANY, "address", "1111111",
                    " Иван Иваныч", AgencyStatus.PRIMARY, 10,
                    "desc", LocalDateTime.now(), LocalDateTime.now()),

            new Agency(2, "CAM", Agent.COMPANY, "address", "22222222",
                    "Gtnh Gtnhjdbx", AgencyStatus.PRIMARY, 10,
                    "desc", LocalDateTime.now(), LocalDateTime.now())

    );
}
