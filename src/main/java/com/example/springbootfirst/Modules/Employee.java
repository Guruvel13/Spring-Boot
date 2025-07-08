package com.example.springbootfirst.Modules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;
    private String role;

    @Override
    public String toString() {
        return "id:" + this.id + "\n" + "name:" + this.name + "\n" + "role:" + this.role;
    }
}
