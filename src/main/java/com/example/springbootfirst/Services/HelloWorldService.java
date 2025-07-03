package com.example.springbootfirst.Services;

import com.example.springbootfirst.Modules.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class HelloWorldService {
    List <Employee> emp = new ArrayList<>(
            Arrays.asList(new Employee(1,"Guru","Trainer"),
                    new Employee(2,"Vel","Faculty")
            )
    );
    public List<Employee> Employee(){
        return emp;
    }

    public List<Employee> Employees(){
        return emp;
    }

    public List<Employee> Emp(){
        return emp;
    }

    public String deleteMethod(){
        return "Delete Method";
    }
}
