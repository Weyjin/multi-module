package com.service;

import com.entry.User;

import java.util.List;

public interface IUserService {


    User getUser(int id);
    List<User> getUsers();
}
