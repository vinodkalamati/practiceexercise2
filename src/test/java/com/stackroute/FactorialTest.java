package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private static Factorial factorial=new Factorial();

    @BeforeClass
    public static void setup(){
        factorial=new Factorial();
    }
    @AfterClass
    public static void teardown(){
        factorial=null;
    }

    @Test
    public void factorial_test(){
        assertEquals("Factorial():factorial of a number till long_max",2432902008176640000L,factorial.factorialLong(20));
        assertEquals("Factorial():factorial of a number till int_max",479001600,factorial.factorial(12));
        assertNotEquals("Factorial():factorial of a number till int_max",6227020800L,factorial.factorial(13));
        assertNotEquals("Factorial():factorial of a number till int_max",5.1090942e+19
                ,factorial.factorialLong(21));
        assertNotNull("Factorial():factorial of a number",factorial.factorial(15));

    }
}
