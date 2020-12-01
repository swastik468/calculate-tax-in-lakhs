package com.company;
import java.util.Scanner;
public class CWH_19_PS_ {
    public static void main(String[] args){
//        Question1
//        int a = 10;
//        if (a=11)

//        Question 2
//        byte  m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter your marks in Maths");
//        m3 = sc.nextByte();
//
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("your overall percentage is "+avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("congratulations you have been promoted ");
//        }
//        else {
//            System.out.println("Sorry you have not been promoted. Please try again!!!");
//        }
//          Question 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if (income<=2.5){
            tax = tax+0;
        }
        else if (income>2.5f && income <= 5f){
            tax = tax+0.05f * (income- 2.5f);
        }
        else if (income>5f && income <=10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
                tax = tax+0.05f * (5.0f- 2.5f);
                tax = tax+0.2f * (10.0f - 5f);
                tax = tax+0.3f * (income - 10.0f);

        }
        System.out.println("The total tax paid by the employee is: "+tax);
    }
}
