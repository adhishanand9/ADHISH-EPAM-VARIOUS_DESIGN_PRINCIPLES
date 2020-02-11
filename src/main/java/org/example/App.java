package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the operation that you wish to perform using symbols ( + or - or * or / ) and then Enter two numbers:");
        System.out.println(Calc.operation(input.next().charAt(0), input.nextFloat(), input.nextFloat() ));
    }
}
