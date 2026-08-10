

public class SumOfN {
    static int sum(int n)
    {
        // base condition
        if(n==0)
        {
            return 0;
        }

        // recursive call
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
    
}
