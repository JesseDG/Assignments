package com.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("/greet")
public class HelloController{
    
    @RequestMapping("/welcome/{countryName}/{userName}")
    public ModelAndView helloWorld(@PathVariable("userName") String name,@PathVariable("countryName") String country){
        
        ModelAndView mav = new ModelAndView("HelloPage");
        mav.addObject("msg",name + " what is up?! from " + country);
        
        return mav;
    }
    
    @RequestMapping("/hi/{countryName}/{userName}")
    public ModelAndView hiWorld(@PathVariable Map<String,String> pathVars){
                
        String name = pathVars.get("userName");
        String country = pathVars.get("countryName");
        
        ModelAndView mav = new ModelAndView("HelloPage");
        mav.addObject("msg",name + " what is up?! from " + country);
        
        return mav;
    }
}