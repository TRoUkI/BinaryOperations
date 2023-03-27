package com.java.binaryMultiplication;

public class BinaryMultiplication {
    public static void main(String args[]){
        int a, b, c = 0;
        a = 10;
        b = 11;
        int dozens = 1;
        c=a;
        while(a!=0&&b!=0){
            if(b%2!=0) {
                c = add(c, a * (b % 2) * dozens);
            }
            dozens *=10;
            b/=10;
        }
        System.out.println(c);
    }
    public static int add(int a, int b){
        int c = 0;
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
        return c;
    }
}
