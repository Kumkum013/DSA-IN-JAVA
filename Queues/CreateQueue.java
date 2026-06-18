

public class CreateQueue{
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    public CreateQueue(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The queue is successfully created with size of: "+size);
    }
    public boolean isFull()
    {
        if(topOfQueue == arr.length-1)
        {
            return true ;
        }
        else{
            return false ;
        }
    }

    public boolean isEmpty()
    {
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length))
        {
            return true;
        }
        
       else{
        return false ;
       }
    

        
    }
    public void enQueue(int value )
    {
        if(isFull())
        {System.out.println("the queue is full");

        }
            else if(isEmpty())
            {
                beginningOfQueue = 0 ;
                topOfQueue++;
                arr[topOfQueue] = value ;
                System.out.println("Successfully inserted "+ value + "in the queue");
            }
            else
    {
        topOfQueue++;
        arr[topOfQueue] = value;
        System.out.println("Successfully inserted " + value + " in the queue");

    }
}
    public static void main(String[] args)
    {
        CreateQueue q = new CreateQueue(5);
        boolean result = q.isEmpty();
        System.out.println(result);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        
    }
}