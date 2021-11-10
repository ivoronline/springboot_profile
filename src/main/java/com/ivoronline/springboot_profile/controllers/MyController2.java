package com.ivoronline.springboot_profile.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("Profile2")
public class MyController2 {

  //===================================================================
  // HELLO
  //===================================================================
  @RequestMapping("Hello")
  String hello() {
    return "Hello from Controller 2 in Profile 2";
  }

}



