package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Usertest {

    private static User details=new User();

    @BeforeClass
    public static  void setup(){
       details =new User();
    }
    @AfterClass
    public static void teardown(){
        details = null;
    }
    @Test
    public void testuser(){
        assertEquals("isValidage():age should be in between 18 to 60",true,details.isValidage(20));
        assertNotEquals("isValidage():age should be in between 18 to 60",true,details.isValidage(80));
        assertEquals("getfullname():firstname+lastname","harrison Wells",details.getFullname());
        assertNotNull("getsalary():default salary",details.getSalary());

    }
}
