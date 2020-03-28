package com.pro.agents.service.agency.interfaces;

import com.pro.agents.model.Agency;
import com.pro.agents.repository.IGenericRepository;

import java.util.List;

public interface IAgencyService {

    public Agency create(Agency agency);

    public Agency update(Agency agency);

    public Agency get(int id);

    public Agency delete(int id);

    public List<Agency> getAll();

}
