package com.example.springbootfirst.Services;

import com.example.springbootfirst.Modules.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {

    private final List<Employee> employees = Collections.synchronizedList(new ArrayList<>());

    public List<Employee> getAllEmployees() {
        return employees;
    }


    public Employee createEmployee(Employee employee) {
        boolean res = employees.add(employee);
        if (res) {
            return employee;
        } else {
            return null;
        }
    }

    public Employee getEmployeeById(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                return employees.get(i);
            }
        }
        return null;
    }

    public String deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                employees.remove(i);
                return "Employee Deleted Successfully!!";
            }
        }
        return "Employee With Id: "+id+" Not Found!";
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                employees.get(i).setName(updatedEmployee.getName());
                employees.get(i).setRole(updatedEmployee.getRole());
                return employees.get(i);
            }
        }
        return null;
    }
}
