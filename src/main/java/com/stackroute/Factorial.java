package com.stackroute;

public class Factorial {

    int number;

    public int factorial(int number){

        int n=1;
        for(int i=1;i<=number;i++){

            if(i>=13){
                System.out.printf("The factorial of 13 is out of range");
                return 0;
            }
            n=n*i;
            System.out.println("The factorial of"+i+"is"+n);

        }
        return  n;
    }
    public long factorialLong(long number){

        long n=1;
        for(int i=1;i<=number;i++){

            if(i>=21){
                System.out.printf("The factorial of 21 is out of range");
                return 0;
            }
            n=n*i;
            System.out.println("The factorial of"+i+"is"+n);

        }
        return  n;
    }

}

