package jcl.service;

import jcl.dao.IUserDao;
import jcl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
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
}
