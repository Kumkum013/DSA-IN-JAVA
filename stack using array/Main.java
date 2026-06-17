public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        boolean result = stack.isEmpty();
        System.out.println(result);
        boolean result2 = stack.isfull();
        System.out.println(result2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        int result3 = stack.pop();
        System.out.println(result3);
        int result4 = stack.peek();
        System.out.println(result4);
        stack.deleteStack();
        
    }
}

class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of : " + size);
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }
     public boolean isfull() 
     {
        if (topOfStack == arr.length - 1)
         {
            // System.out.println("The stack is full");
           return true;

        }
        else {
            return false;
        }
    }
     public void push(int value)
     {
        if (isfull()) {
            System.out.println("The stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is inserted in the stack");
        }


}
 public int  pop()
 {
    if(isEmpty())
    {
        System.out.println("The stack is empty");
        return -1;
    }
    else
    {
        int topStack = arr[topOfStack];
        topStack--;
        return topStack;

    }
 }
 public int peek()
 {
    if(isEmpty())
    {
        System.out.println("The stack is empty");
        return -1;
    }
    else
    {
        return arr[topOfStack];
    }
 }
public void deleteStack()
 {
    arr = null;
    System.out.println("The stack is deleted successfully");
 }
}
