package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class PowerOf4CheckerTest
{

   private static Power0f4Checker power=new Power0f4Checker();
    @BeforeClass
    public static void setup(){
        power=new Power0f4Checker();
    }

    @AfterClass
    public static void teardown(){
        power=null;
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPowerOf4()
    {
        assertEquals("PowerOfChecker():please consider all cases",true,power.power4(64));
        assertNotEquals("PowerOfChecker():please consider all cases",true,power.power4(65));
        assertNotNull("PowerOfChecker():please consider all cases",power.power4(64));
    }
}
