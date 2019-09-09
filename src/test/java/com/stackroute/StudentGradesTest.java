package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class StudentGradesTest
{
    private static StudentGrades studentgrades = new StudentGrades();

    @BeforeClass
    public static  void setup(){
        studentgrades = new StudentGrades();
    }
    @AfterClass
    public static void teardown(){
        studentgrades = null;
    }
    /**
     * Rigorous Test :-)
     */

    @Test
    public void TestGrades(){

        assertArrayEquals("StudentGrades():calculating Avg,Min and Max",new int[]{63,50,80},studentgrades.AvgMinMax(3,new int[]{50,80,60}));
        assertArrayEquals("StudentGrades():calculating Avg,Min and Max",new int[] {71,34,98},studentgrades.AvgMinMax(5,new int[]{76,98,34,57,90}));
        assertNull("array is null",studentgrades.AvgMinMax(4,new int[]{105,76,89,56}));
        assertNull("number of students should be equal to number of grades",studentgrades.AvgMinMax(3,new int[]{23,45}));

    }

}




