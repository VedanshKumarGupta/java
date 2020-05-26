/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;


public class jan312020 {
    void m1()
     { 
         System.out.println("instance method");

     }
    static void m2()
    { 
        System.out.println("static");
    }
    
    public static void main(String[] args) {
        jan312020 obj = new jan312020(); 
        obj.m1();
        m2();
        
    }
   
}
