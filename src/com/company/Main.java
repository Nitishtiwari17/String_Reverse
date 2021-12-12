package com.company;

public class Main {

    public static void main(String[] args) {
        String str1="Good",str2="morning";
        str1=str1 + str2;
        System.out.println("String before the Swapping:" +str1);
        str2=str1.substring(0,(str1.length()-str2.length()));
        str1=str1.substring(str2.length());
        System.out.print("String after Swapping:"+str1+" "+str2);
	// write your code here
    }
}
