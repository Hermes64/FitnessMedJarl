package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Administration Claus = new Administration("Cornelius", "251264-1144", 37, 33000, 5);
        Administration Mustapha = new Administration("Mustapha", "141158-5542", 37, 33000, 5);
        Administration Bernadette = new Administration("Bernard", "030900-8924", 37, 33000, 5);

        Instructor Asger = new Instructor("Asger", "151045-2244", 10);
        Instructor Jarl = new Instructor("Jarl", "050969-4861", 100);

        Member Mercurio = new Member("Mercuri", "251264-4455", true);
        Member Mumuni = new Member("Mumuni", "120894-4455", false);


        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        ArrayList<Member> memberArrayList = new ArrayList<>();

        employeeArrayList.add(Claus);
        employeeArrayList.add(Mustapha);
        employeeArrayList.add(Bernadette);

        employeeArrayList.add(Asger);
        employeeArrayList.add(Jarl);

        memberArrayList.add(Mercurio);
        memberArrayList.add(Mumuni);


        System.out.println("Fitness Employees:");
        System.out.println("Name           Cpr               Hours    Salary      Vacation");
        System.out.println("***************************************************************");
        for (Person employee : employeeArrayList){
            System.out.println(employee);
        }
        System.out.println("===============================================================");
        System.out.println();

        System.out.println("Fitness Members:");
        System.out.println("Name           Cpr               MemberShip           Fee");
        System.out.println("***************************************************************");
        for (Person member : memberArrayList){
            System.out.println(member);
        }
        System.out.println("===============================================================");
        System.out.println();

        System.out.println("Employees and Members name and cpr");
        System.out.println("Name           Cpr");
        System.out.println("***************************************************************");

        List<Person> personList = new ArrayList<>();
        personList.addAll(employeeArrayList);
        personList.addAll(memberArrayList);
        for (Person person : personList){

            System.out.printf("%-15s%-15s\n", person.name, person.cpr);

        }
        System.out.println("===============================================================");
        System.out.println();
    }
}
