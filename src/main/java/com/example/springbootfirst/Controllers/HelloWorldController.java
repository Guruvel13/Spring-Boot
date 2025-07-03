package com.example.springbootfirst.Controllers;

import com.example.springbootfirst.Modules.Employee;
import com.example.springbootfirst.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController  {
    @Autowired
    HelloWorldService hws;

    @GetMapping("/")
    public List<Employee> getMethod(){
        return hws.Employee();
    }

    @PostMapping("/")
    public String postMethod(){
        return hws.Employees().toString();
    }

    @PutMapping("/")
    public String putMethod(){
        return hws.Emp().toString();
    }

    @DeleteMapping("/")
    public String deleteMethod(){
        return hws.deleteMethod();
    }

}
