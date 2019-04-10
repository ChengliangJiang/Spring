package com.jcl.test;


import com.jcl.service.IUserService;
import com.jcl.service.IUserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    /**
     * 以前测试方法创建和调用
     */
    @Test
    public void demo1(){
        IUserService UserService=new IUserServiceImpl();
        UserService.add();
    }
    //现在使用spring的IOC容器获取
    @Test
    public void demo2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        IUserService userService= (IUserService)applicationContext.getBean("userService");
        userService.add();
    }
}
