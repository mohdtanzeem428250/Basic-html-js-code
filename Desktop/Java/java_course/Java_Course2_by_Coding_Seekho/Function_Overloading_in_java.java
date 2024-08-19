class super1
{
    int x;
    int y;
    public void fun1(int x,int y)
    {
        System.out.println("Hello");
        System.out.println(x);
        System.out.println(y);
    }
    public void fun1(int a)
    {
        System.out.println(a);
    }
    public void fun1()
    {
        System.out.println("bye bye");
    }
}
public class Function_Overloading_in_java 
{
    public static void main(String[] args) 
    {
        super1 s1=new super1();
        s1.fun1();
        s1.fun1(10); 
        s1.fun1(10,20); 
    }   
}