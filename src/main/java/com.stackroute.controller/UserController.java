package com.stackroute.controller;
import com.stackroote.dao.InsetData;
import com.stackroute.service.PopulateUserClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    PopulateUserClass populateUserClass= new PopulateUserClass();
    InsetData insetData=new InsetData();

    @RequestMapping("/")
    public String gotofirst(Model map){
        return "index";
    }

    @RequestMapping("/populate")
    public ModelAndView populateUser(@RequestParam("username") String UserName, @RequestParam("password") String Password){
        User user=populateUserClass.populate(UserName,Password);
        insetData.insertData(user.getUsername(),user.getPassword());
        ModelAndView mv= new ModelAndView();
        mv.setViewName("show");
        mv.addObject("obj",user.getUsername());
        return mv;
    }
}
