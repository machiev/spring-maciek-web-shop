package com.machiev.controller;


import com.machiev.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void login() {
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("newUser") User name) {

        ModelAndView model = new ModelAndView();
        model.setViewName("redirect:/");
        model.addObject("user", name);

        return model;
    }
}
