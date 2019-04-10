package com.jcl.service;

public class IUserServiceImpl implements IUserService {

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
}
