package com.example.insurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InsuranceControler {

    @RequestMapping("/hello") 
    @ResponseBody
  
    // Method 
    public String hello() 
    { 
        return "Hello you are in Insurance Controler"; 
    } 
}
