class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(-123));
    }
    public int reverse(int x) {
        int reverse = 0;
        while(x !=0)
        {
            int digit = x%10;
            // overflow

            if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7))
            return 0;

            // underflow check

            if(reverse <Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && digit < -8))
            return 0;
            reverse = reverse * 10 + digit;
            x = x/10;
            
        }
        return reverse;
    }
}