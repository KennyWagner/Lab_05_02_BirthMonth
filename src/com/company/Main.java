package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    // int month
        //Output “Please enter your birth month (1-12)
        //Input month
        //if (month >= 1 && month <= 12)
            //Output “Your birthday month is: “ + month
        //else
            //Output “You entered an incorrect month value: “ + month
        //end if

        int month = 13;
        if (month >=1 && month <=12)
        {
            System.out.println("Your birth Month is: " + month + ".");
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + month + ".");
        }
    }
}
