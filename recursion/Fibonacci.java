public class Fibonacci {
   public int factlorial(int n)
    {
        if(n<1)
        {
            return -1;
        }
        else
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            // return n*factlorial(n-1);

            // in other way
            return factlorial(n-1) + factlorial(n-2);
        }
    }
    public static void main(String[] args)
    {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.factlorial(5));
    }
}