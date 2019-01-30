package com.company;

import java.util.Scanner;

public class CustomerPurchase {

    public static void main(String[] args) {
        Scanner Keyboard= new Scanner(System.in);
        System.out.println("Enter customer name");
        String customer_name = Keyboard.nextLine();
        System.out.println("Enter purchase amount");
        double purchase_amount = Keyboard.nextDouble();
        System.out.println("Enter tax code (0,1,2,3,)");
        int tax_code = Keyboard.nextInt();

        double tax_percentage = 0;
        if (tax_code == 0) {
             tax_percentage = 0.00;
        }
        else if (tax_code == 1) {
             tax_percentage = 0.03;
        }
        else if (tax_code == 2) {
             tax_percentage = 0.05;
        }
        else if (tax_code == 3) {
             tax_percentage = 0.07;
        }
        double sales_tax= (tax_percentage/100)* (purchase_amount);
        double total_amount_due= sales_tax + purchase_amount;
        System.out.println("customer_name"+ customer_name);
        System.out.println("tax_percentage"+ tax_percentage);
        System.out.println("purchase_amount"+ purchase_amount);
        System.out.println("sales_tax"+ sales_tax);
        System.out.println("total_amount_due"+ total_amount_due);
        }

    }


