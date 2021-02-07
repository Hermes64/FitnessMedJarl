package com.company;

public class Instructor extends Employee {

    private int earnedPerHour = 199;

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr, hours);

    }

    @Override
    public int getHours() {

        return super.getHours();
    }
    @Override
    public int getSalary (){
        return earnedPerHour * getHours();

    }
    @Override
    public String toString() {

        return String.format("%-15s%-18s%-9d%-12d", name, cpr, getHours(), getSalary() );
    }
}


