/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author DOLLA
 */
public class jan31 {
    int a=10;
     void m1()
     { 
         System.out.println("instance method");

     }
    jan31()
    {
        System.out.println("default");
    }
    jan31(int a)
    {
        System.out.println("parameterized"+a);
    }
    jan31(int a,int b)
    {
        System.out.println("p2  "+ (a+b));
    }
    public static void main(String[] args) {
        jan31 obj1 = new jan31();
        jan31 obj2 = new jan31(5);
        jan31 obj3 = new jan31(5,10);
        obj1.m1();
        System.out.println(obj1.a);
    }
}
