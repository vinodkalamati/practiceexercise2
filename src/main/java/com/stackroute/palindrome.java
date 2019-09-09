package com.stackroute;




public class palindrome {
    public boolean palindrome(String query){
        StringBuffer str=new StringBuffer(query);
        str.reverse();
        String str2=query.toLowerCase().replaceAll(" ","");
        String str1=str.toString().toLowerCase().trim().replaceAll(" ","");
        if(str1.equals(str2)){
            return true;
        }
        else
        {
            return false;
        }

    }
}
