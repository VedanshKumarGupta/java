
package Strings;

import java.util.Scanner;

public class Program10
{
    public static void main(String[] args)
    {
        String str = "AMAR SINGH";
        String name,lp,lp1;
       
        lp1 = str.substring(0,2);//last char is 1 minimum
        lp = str.substring(3);
        System.out.println(lp1 + "   " + lp);
    }
  
}
