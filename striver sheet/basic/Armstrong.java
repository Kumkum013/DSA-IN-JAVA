package basic;

public class Armstrong {
    public static void main (String[] args) {
       int num = 153;
       int original = num;
       // count the number of digits
       int count =0;
       int temp=num;
       while(temp > 0)
        {
            count++;
            temp=temp / 10;

        } 

        // calculate the sum of digits raised to the power of count
        int sum = 0;
        temp = num;
        while (temp > 0)
        {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit,count);
            temp = temp/10;
        }

        // check armstrong
        if(sum==original)
        {
            System.out.println("Armstrong Number");
        }

        else{
            System.out.println("Not an armstrong Number");
        }
    }
}
        


