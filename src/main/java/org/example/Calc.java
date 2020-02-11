package org.example;

public class Calc
{
    public static float operation(char opr, float n1, float n2)
    {
        switch (opr)
        {
            case '+':
                return OperationsCalc.addition(n1, n2);
            case '-':
                return OperationsCalc.subtraction(n1, n2);
            case '*':
                return OperationsCalc.multiplication(n1, n2);
            case '/':
                return OperationsCalc.division(n1, n2);
            default:
                throw new ArithmeticException();
        }
    }
}
