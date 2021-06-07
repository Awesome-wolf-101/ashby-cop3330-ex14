/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        System.out.println("What is the order amount?");
        Scanner sc = new Scanner(System.in);
        String Amount = sc.nextLine();
        System.out.println("What is the state? ");
        String State = sc.nextLine();

        double AmountDouble = Double.parseDouble(Amount);
        double TaxRate = 0.0;
        String OutPutString = "";
        if(State.equals("WI"))
        {
            TaxRate = .055;
            double Tax = AmountDouble * TaxRate;
            OutPutString += "The Subtotal is $" + Math.round(AmountDouble * 100.0) / 100.0 + ".";
            OutPutString += "\nThe tax is $" + Math.round(Tax * 100.0) / 100.0 + ".";
        }

        double Tax = AmountDouble * TaxRate;
        double Total  = AmountDouble + Tax;
        double ActualTotal = Math.round(Total * 100.0) / 100.0;




        OutPutString += "\nThe total is $" + ActualTotal + ".";

        System.out.println(OutPutString);





    }
}
