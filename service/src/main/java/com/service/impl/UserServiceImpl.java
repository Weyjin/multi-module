package com.service.impl;

import com.entry.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    public User getUser(int id) {
        User user=new User();
        user.setId(1);
        user.setName("张三");
        return null;
    }

    public List<User> getUsers() {

        List<User> users=new ArrayList<User>();
        User user=new User();
        user.setId(1);
        user.setName("张三");
        users.add(user);
        user=new User();
        user.setId(2);
        user.setName("李四");
        users.add(user);
        return users;
    }
}
