package com.company;

public class Employee {
    public double baseSalary;
    public float hourlyRate;
    public byte extraHour;

    public double getBaseSalary(){
        return baseSalary + hourlyRate * extraHour;
    }
}
