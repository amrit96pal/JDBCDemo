package com.stackroute.service;

import com.stackroute.controller.User;

public class PopulateUserClass {

    public User populate(String username,String password){
        User user= new User();
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }
}
