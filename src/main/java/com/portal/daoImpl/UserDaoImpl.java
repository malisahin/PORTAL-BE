package com.portal.daoImpl;

import com.portal.dao.UserDao;
import com.portal.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by Mehmet Ali Sahinogullari on 1.09.2017.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public User login(User user) {
        String selectQuery = "select k FROM USER k where k.userCode='admin'" + user.getUserCode();
        Query query = em.createQuery("select k FROM User k");
        return (User) query.getResultList().get(query.getFirstResult());

    }
}
