package com.company;

public class Administration extends Employee {

    private int holidays;

    public Administration(String name, String cpr, int hours, int salary, int holidays) {
        super(name, cpr, hours, salary);
        this.holidays = holidays;
    }



    public int getHolidays() {
        return holidays;
    }

    @Override
    public int getSalary() {

        return 33000;
    }

    @Override
    public String toString() {

        return String.format("%-15s%-18s%-9d%-12d%-10d", name, cpr, getHours(), getSalary(), holidays );
    }
}
