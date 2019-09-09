package com.stackroute;

public class User {

    private String firstname="harrison";
    private String lastname="Wells";
    private  int age=40;
    private long salary=100000;

    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setAge(int age){
        if(age>0 && age<100){
            this.age=age;
        }
        else
        {
            System.out.println("Ensure age cannot be less than 0 or greater than 100");
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public long getSalary(){
        return this.salary;
    }
    public String getFullname(){
        return(this.firstname+" "+this.lastname);
    }
    public boolean isValidage(int age){
        if (age>=18 && age<=60){
            return true;
        }
        else{
            return false;
        }
    }
}
