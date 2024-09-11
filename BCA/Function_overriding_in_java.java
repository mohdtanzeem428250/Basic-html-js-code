class demo
{
    void f1()
    {
        System.out.println("Parent function:");
    }
}
class demo1 extends demo
{
    void f1()
    {
        System.out.println("Child function:");
    }
}
public class Function_overriding_in_java 
{
    public static void main(String[] args) 
    {
        demo1 d1=new demo1();
        d1.f1();
    }    
}
