/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

/**
 *
 * @author Elritmico
 */


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Enumeration;
import java.security.SecureRandom;


@Controller
public class defaultController {
    
    @RequestMapping(value="/", method= RequestMethod.GET)
    public ModelAndView helloWorld(){
        
        ModelAndView mav = new ModelAndView("index");       
        return mav;
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView login(@RequestParam("email")String email, @RequestParam("pwd")String password){
        
        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("msg","email is " + email +" password is " + password);
        return model;
    }
    
    @RequestMapping(value="/signup", method=RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request){
        
        Enumeration enumeration = request.getParameterNames();
        String[] values = new String[7];
        int count = 0;
        while(enumeration.hasMoreElements()){
            values[count] = (String)request.getParameter((String)enumeration.nextElement());
            count++;
        }
        
        /********************/
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[24];
        random.nextBytes(salt);
        /*******************/
        
        ModelAndView mav = new ModelAndView("HelloPage");
        mav.addObject("msg", values);
        
        return mav;
    }
}
