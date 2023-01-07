package com.tnuwan.springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

  // @RequestMapping(value = "/", method = RequestMethod.GET)
 @GetMapping("/")
  public String helloWorld(){
      return "hello buddy *123";
  }


}
