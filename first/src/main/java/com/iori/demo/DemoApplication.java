package com.iori.demo;

//import com.iori.demo.controller.DemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import org.springframework.context.annotation.Import;


//@RequestMapping("/html")
@SpringBootApplication
@RestController
//@Controller
//@Import({DemoController.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    //@RequestMapping("/thehello1")
  @GetMapping("hello1")
  public String thehello1123(@RequestParam(value="name1",defaultValue = "SpringBoot1") String name)
    {

       return String.format("web hellossss %s!",name);
    }


}


