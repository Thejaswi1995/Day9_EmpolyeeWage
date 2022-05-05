package com.bridgelabz_employeewage;
import java.util.Random;

public class Main {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static int empHrs = 0;

    private static void wageComputation() {
        Random random = new Random();
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present ");
            empHrs = 8;
        } else if (empCheck == IS_PART_TIME) {
            System.out.println("Employee is Present Part Time ");
            empHrs = 4;

        } else {
            System.out.println("Employee is Absent ");
        }

        int empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is : " + empWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        wageComputation();
    }
}

