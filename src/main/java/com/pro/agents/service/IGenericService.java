package com.pro.agents.service;

import java.util.List;

public interface IGenericService<T> {
    T create(T t);
    T update(T t);
    T get(String id);
    T delete(String id);
    List<T> getAll();

}
