
public class Print1ToN {
static void printNumber(int i,int n)
{
    // base condition

    if(i>n)
    {
        return;
    }
    System.out.println(i);

    printNumber(i+1, n);   
}
public static void main(String[] args) {
    int n=5;
    printNumber(1, n);
}
    
}
