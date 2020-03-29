package com.garcia.javaspring.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping(method = RequestMethod.GET, path = {"/main", "ola"})
   public String ola() {
       return "Olá Spring Boot 23 3";
   }

}
