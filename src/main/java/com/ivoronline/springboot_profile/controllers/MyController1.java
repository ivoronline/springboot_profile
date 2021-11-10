package com.ivoronline.springboot_profile.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("Profile1")
public class MyController1 {

  //===================================================================
  // HELLO
  //===================================================================
  @RequestMapping("Hello")
  String hello() {
    return "Hello from Controller 1 in Profile 1";
  }

}



