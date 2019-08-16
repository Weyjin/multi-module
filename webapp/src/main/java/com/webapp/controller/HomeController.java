package com.webapp.controller;


import com.entry.User;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    private IUserService userService;


    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView view=new ModelAndView();
        view.setViewName("home/index");
        return view;
    }

    @RequestMapping("getUsers")
    @ResponseBody
    public List<User> getUsers(){
       List<User> users= userService.getUsers();
        return users;
    }
}
