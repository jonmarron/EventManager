package com.jontxu.EventManagement.data.Employee;

public class Organiser extends Employee {
    private final boolean isChiefOrganiser;
    public Organiser(String name, boolean isChiefOrganiser) {
        super(name);
        this.isChiefOrganiser = isChiefOrganiser;
    }

    public boolean isChiefOrganiser() {
        return isChiefOrganiser;
    }
}
