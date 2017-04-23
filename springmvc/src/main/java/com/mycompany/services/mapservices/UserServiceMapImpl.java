package com.mycompany.services.mapservices;

import com.mycompany.domain.DomainObject;
import com.mycompany.domain.User;
import com.mycompany.services.UserService;

import java.util.List;

/**
 * Created by mohamedsultan on 06/04/2017.
 */
public class UserServiceMapImpl extends AbstractMapService implements UserService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public User getById(Integer id) {
        return (User) super.getById(id);
    }

    @Override
    public User saveOrUpdate(User domainObject) {
        return (User) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    @Override
    protected void loadDomainObjects() {

    }
}
