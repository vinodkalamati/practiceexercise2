package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest{
    private static  Member details=new Member("Harry",30,2500.3f);

    @BeforeClass
    public static  void setup(){
        details =new Member("Harry",30,2500.3f);
    }
    @AfterClass
    public static void teardown(){
        details = null;
    }

    @Test
    public void testfunctions(){

        assertEquals("getters and setters","Harry",details.GetName());
        assertEquals("member details",30,details.GetAge());
        assertNotEquals("details",0,details.GetSalary());
    }

}

