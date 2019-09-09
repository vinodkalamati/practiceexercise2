package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class palindrometest
{
    private static palindrome palindrome = new palindrome();

    @BeforeClass
    public static  void setup(){
        palindrome =new palindrome();
    }
    @AfterClass
    public static void teardown(){
        palindrome = null;
    }




    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPalindrome()
    {
        assertEquals("testPalindrome(),checking for palindrome",true,palindrome.palindrome("A nut for a jar of tuna"));
        assertNotEquals("testPalindrome(),checking for palindrome",true,palindrome.palindrome("hindi"));
        assertEquals("testPalindrome(),checking for palindrome",true,palindrome.palindrome("malayalam"));
        assertNotNull("return only boolean",palindrome.palindrome("null"));
    }

}