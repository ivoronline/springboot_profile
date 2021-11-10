package com.ivoronline.springboot_profile.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //===================================================================
  // HELLO
  //===================================================================
  @RequestMapping("Greet")
  String greet() {
    return "Greetings from Controller without Profile";
  }

}



