package com.pro.agents.repository;

import java.util.List;

public interface IGenericRepository<T> {

    T create(T t);
    T update(T t);
    T get(String id);
    T delete(String id);
    List<T> getAll();

}
