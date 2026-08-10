

public class CheckPalindrome {

static boolean isPalindrome(String s, int i,int j)
{
    // base condition

    if(i>=j)
    {
        return true;
    }

    // characters are different
    if(s.charAt(i) != s.charAt(j))
    {
        return false;
    }

    //recursive call
    return isPalindrome(s, i+1, j-1);
}   
public static void main(String[] args) {
    String s ="madam";
    System.out.println(isPalindrome(s,0,s.length() - 1 ));
} 
}
