package com.pro.agents.service.agency.impls;

import com.pro.agents.model.Agency;
import com.pro.agents.repository.agency.AgencyRepository;
import com.pro.agents.service.agency.interfaces.IAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyServiceImpl implements IAgencyService {

    private final AgencyRepository repository;

    @Autowired
    public AgencyServiceImpl(@Qualifier("fake-agency") AgencyRepository repository) {
        this.repository = repository;
    }

    @Override
    public Agency create(Agency agency) {
        return null;
    }
    @Override
    public Agency update(Agency agency) {
        return null;
    }

    public Agency get(int id) {
        return this.getAll().stream()
                .filter(agent -> agent.getId() == id)
                .findFirst().get();
    }

    public Agency delete(int id) {
        return null;
    }

    @Override
    public List<Agency> getAll() {
        return this.repository.getAll();
    }


}
