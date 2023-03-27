package com.java.binaryAddition;
public class BinaryAddition {
    public static void main(String[] args){
        int a, b,c = 0;
        a = 110101;
        b = 11100;
        int temp = 0;
        int dozens = 1;
        while(a!=0||b!=0){
            c = c+((a%10+b%10+temp)%2)*dozens;
            temp = (a%10+b%10+temp)/2;
            a/=10;
            b/=10;
            dozens*=10;
        }
        if(temp!=0){
            c+=temp*dozens;
        }
        System.out.println(c);
    }
}
