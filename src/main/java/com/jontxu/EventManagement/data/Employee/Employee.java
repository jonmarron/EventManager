package com.jontxu.EventManagement.data;

public abstract class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
