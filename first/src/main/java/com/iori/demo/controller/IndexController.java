package com.iori.demo.controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

import java.util.Map;
//@SpringBootApplication
//@RequestMapping("/Demo")

//@RestController
@Controller
public class IndexController {
    @GetMapping("index2")
    //@RequestMapping("/index1")
    public String ddd(Model model)//Map<String,Object> map) //value="name1",defaultValue = "SpringBoot") String name)
    {
       // map.put("id",1001);
        //map.put("name","user1");
      //  model.addAttribute("id","abc");
        model.addAttribute("name", "anson1");
       //return "index.html";
        return  "thehello1";
       //  return String.format("test demo string is: %s!","aabbccdefg");
    }
}
