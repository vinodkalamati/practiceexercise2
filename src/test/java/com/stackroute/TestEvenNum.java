package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class TestEvenNum
{
    /**
     * Rigorous Test :-)
     */
    private static EvenNumTest Even=new EvenNumTest();

    @BeforeClass
    public static  void setup()
    {
        Even=new EvenNumTest();
    }
    @AfterClass
    public static void teardown(){
        Even = null;
    }
    @Test
    public void TestEven()
    {
        assertEquals("EvenNumTest():Please correct your logic",true,Even.isEven(86));
        assertNotEquals("EvenNumTest():Please correct your logic",true,Even.isEven(99));
        assertNotNull("EvenNumTest():Please correct your logic",Even.isEven(0));
    }
}
