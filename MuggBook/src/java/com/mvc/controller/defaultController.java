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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class defaultController {
    
    @RequestMapping(value="/", method= RequestMethod.GET)
    public ModelAndView helloWorld(){
        
        ModelAndView mav = new ModelAndView("index");       
        return mav;
    }
}
