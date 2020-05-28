/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;
 
public class Program23
{
      public static void main(String args[])
      {
          String name;
          int roll, math, phy, eng;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          name=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          roll=SC.nextInt();
          System.out.println("Name: "+name + "\nRoll Number:" + roll );
      }
}