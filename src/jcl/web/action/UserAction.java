package jcl.web.action;

import jcl.model.User;
import jcl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction {

    @Autowired
    private IUserService userService;

    public void save(User user){
        System.out.println("action save");
        userService.add(user);
    }
}
