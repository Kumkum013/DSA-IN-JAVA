package basic;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int n =37;
        int count=0;
        for(int i = 1; i<=n;i++)
        {
            if(n%i ==0)
            {
                count++;
            }
        }
        if(count ==2)
        {
            System.out.println("prime number");
        }

        else{
            System.out.println("Not prime number");
        }
    }
    
}
