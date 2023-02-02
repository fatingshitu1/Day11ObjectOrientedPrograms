package com.bridgelabz.objectorientedprograms;
import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to Day 11 Object Oriented Programs");
        int accountBalance = 5000;

        public void debit () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the amount ");
            int debitAmount = sc.nextInt();
            if (debitAmount < accountBalance) {
                System.out.println("Debit Amount");
            } else {
                System.out.println("Debit amount exceeded account balance.");
            }
        }
    }
}
