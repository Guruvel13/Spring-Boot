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
        employees.add(employee);
        return employee;
    }

    public Employee getEmployeeById(int empId) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                return emp;
            }
        }
        return null;
    }

    public String deleteEmployee(int empId) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                employees.remove(emp);
                return "Employee Deleted Successfully!!";
            }
        }
        return "Employee With Id: " + empId + " Not Found!";
    }

    public Employee updateEmployee(int empId, Employee updatedEmployee) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                emp.setName(updatedEmployee.getName());
                emp.setJob(updatedEmployee.getJob());
                return emp;
            }
        }
        return null;
    }
}
