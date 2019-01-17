package com.stackroute.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {


    @RequestMapping("/")
    public String gotofirst(Model map){
        return "index";
    }

    @RequestMapping("populate")
    public ModelAndView populateUser(@RequestParam("username") String UserName, @RequestParam("password") String Password){
        User user= new User();
        user.setPassword(Password);
        user.setUsername(UserName);
        ModelAndView mv= new ModelAndView();
        mv.setViewName("show");
        mv.addObject("obj",user);
        return mv;
    }
}
