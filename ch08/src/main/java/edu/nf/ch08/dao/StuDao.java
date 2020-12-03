package edu.nf.ch08.dao;

import edu.nf.ch08.entity.Users;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/12/2
 */
public interface StuDao {
    /**
     * 查询
     * @return
     */
    List<Users> listStu();
}
