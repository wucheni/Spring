package edu.nf.ch09.service.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @date 2020/12/3
 */
//@Component
//可以使用@Repository注解来标识dao层
@Repository("userService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //注入Dao
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("执行UserServiceImpl");
        userDao.save();
    }
}
