package com.stackroute;

import java.util.Scanner;

public class Power0f4Checker {

    public boolean power4(int number){
        int num=number;
        int n=4;
        for(int i=0;i<=(num/4);i++) {
            if (n == number) {
                return true;
            }
            n=n*4;
        }
        return false;

    }
}
