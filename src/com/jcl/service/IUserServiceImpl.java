package com.jcl.service;

import com.jcl.dao.IUserDao;
import com.jcl.model.User;
import org.springframework.stereotype.Component;

@Component
public class IUserServiceImpl implements IUserService {

    private IUserDao userDao;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void add() {
        //快捷方式Sout
        System.out.println("创建用户"+name);
    }

    @Override
    public void add(User user) {
        System.out.println("service添加用户"+user);
        //调用dao
        userDao.add(user);
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
