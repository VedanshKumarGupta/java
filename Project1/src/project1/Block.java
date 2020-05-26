package project1;

public class Block {
     static int m2()
    {//static block
        return (10);
    }
    void m1(int a,int b)
    { //instance block
        System.out.println(a+","+ b);
    }
    Block()
    {
        System.out.println("constructor");
    }
    { //instance block
        System.out.println("instance 1");
    } 
     
    { //instance block
        System.out.println("instance 2");
    }
    static
    {
        System.out.println("static");
    }
    public static void main(String[] args) {
        Block obj = new Block();
        obj.m1(50,1000);
        int b =m2();
        System.out.println(b);
    }
}