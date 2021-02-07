package com.company;

public class Person {

    protected String name ;
    protected String cpr ;

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

      public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
    public String toString() {

        return String.format("%-15s%-18s", name, cpr);
    }

}
