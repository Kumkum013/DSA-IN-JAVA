package recursion;

// package declaration added to match directory 'recursion'
public class PrintName {
    static void printName(int i,int n)
    {
        if(i>n)
        {
            return;

        }
        System.out.println("kumkum");
        //recursive call

        printName(i+1, n);
        
    }
    public static void main(String[] args) {
        int n=5;
        printName(1, n);
    }
}
