package com.mycompany.services;

import java.util.List;

/**
 * Created by mohamedsultan on 06/04/2017.
 */
public interface CRUDService<T> {
     List<?> listAll();

     T getById(Integer id);

     T saveOrUpdate(T domainObject);

     void delete(Integer id);
 }