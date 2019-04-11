package jcl.dao;

import jcl.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
    @Override
    public void add(User user) {
        System.out.println("dao添加用户"+user);
    }
}
