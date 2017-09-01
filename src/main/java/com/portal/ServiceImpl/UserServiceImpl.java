package com.portal.ServiceImpl;

import com.portal.dao.UserDao;
import com.portal.model.User;
import com.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mehmet Ali Sahinogullari on 1.09.2017.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {

        return userDao.login(user);
    }
}
