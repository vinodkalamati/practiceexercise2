package com.stackroute;

import java.util.Arrays;

public class StudentGrades {



    public int[] AvgMinMax(int NumberOfStudents,int[] grades){

        float Avg;
        int Min;
        int Max;
        float sum=0;
        int AvgMinMax[];
        if(NumberOfStudents!=grades.length){
            return null;
        }
        for(int i=0;i<grades.length;i++){
            sum=sum+grades[i];
        }
        Avg=(float)(sum/grades.length);
        Arrays.sort(grades);
        Min=grades[0];
        Max=grades[grades.length-1];
        if(Max>100){return null;}
        int Grading[]={(int)Avg,Min,Max};
        return Grading;
    }
}
