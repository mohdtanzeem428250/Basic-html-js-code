public class Finally_block_in_java 
{
    public static int greet()
    {
        try
        {
            int a=1000000,b=0;
            int c;
            c=a/b;
            return c;
        }   
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("This is the finally block");
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        int k=greet();
        System.out.println(k);
    }    
}
