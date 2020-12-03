package edu.nf.ch09.dao.impl;

import edu.nf.ch09.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2020/12/3
 */
//@Component
//可以使用@Service注解来标识业务层
@Service
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("insert into user_info");
    }
}
