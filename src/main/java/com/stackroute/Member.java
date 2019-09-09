package com.stackroute;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

class Member_variable{
    public static void main(String args[]){

        Member members=new Member("Harry",30,2500.3f);
        System.out.println(members.GetAge());
        System.out.println(members.GetSalary());
        System.out.println(members.GetName());

    }
}



public class Member{
    String Name;
    int age;
    float salary;
    public Member(String Name,int age,float salary){
        this.Name=Name;
        this.age=age;
        this.salary=salary;
    }
    public void SetName(String name) {
        this.Name=name;
    }
    public String GetName(){
        return this.Name;
    }
    public void SetAge(int Age) {
        this.age=Age;
    }
    public int GetAge(){
        return this.age;
    }
    public void SetSalary(int salary) {
        this.salary=salary;
    }
    public float GetSalary(){
        return this.salary;
    }

}



