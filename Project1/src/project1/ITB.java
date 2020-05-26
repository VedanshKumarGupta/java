
package project1;

public class ITB {
    int a;
    ITB(int b)
    {
        a=b;
    }
    void m1()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
     ITB obj = new ITB(10);
     obj.m1();
    }
}
