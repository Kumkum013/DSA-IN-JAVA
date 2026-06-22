



public class CircularQueue
{
   int[] arr;
   int beginningOfQueue;
   int topOfQueue;
   int size; 
   public  CircularQueue(int size)
   {
    this.arr = new int[size];
    this.size = size;
    this.topOfQueue =-1;
    this.beginningOfQueue  = -1;  
System.out.println("the CQ is created with size of" + size); 
} 
public boolean isEmpty()
{
    if(topOfQueue == -1)
    {
        return true;
    }
    else
    {
        return false ;
    }
}
public boolean isFull()
{
     if(topOfQueue + 1 == beginningOfQueue )
     {
        return true ;
     }
     else if(beginningOfQueue == 0 && topOfQueue+1 == size)
     {
        return true;
     }
     else{
        return false ;
     }
    
}
public void enQueue(int value)
{
    if(isFull())
    {
        System.out.println("the circular queue is full");
    }
    else if(isEmpty())
    {
        beginningOfQueue = 0;
        topOfQueue++ ;
        arr[topOfQueue] = value;
        System.out.println("successfully inserted" +value +"in the queue");

    }
    else{
if (topOfQueue + 1 == size)
{
    topOfQueue = 0;

}
else {
    topOfQueue ++ ;
}
arr[topOfQueue]=value;

 System.out.println("successfully inserted" +value +"in the queue");
    }
}
public int dequeue()
{if (isEmpty())
{
    System.out.println("the cq is empty");
    return -1 ;
}
else {
    int result = arr[beginningOfQueue];
    arr[beginningOfQueue] = 0;
    if(beginningOfQueue == topOfQueue)
    {
        beginningOfQueue = topOfQueue = -1 ;

    }
    else if(beginningOfQueue + 1 == size)
    {
        beginningOfQueue = 0;
    }

else {
  beginningOfQueue++ ;
}
return result;
  
}
}
public int peek()
{
    if (isEmpty())
    {
        System.out.println("the cq is empty");
        return -1 ;
    }
    else{
        return arr[beginningOfQueue];
    }
}
public void delete()
{
    arr = null;
    System.out.println("the cq is successfully deleted");
}
public static void main(String[] args) {
    CircularQueue q = new CircularQueue(3);
      boolean result =  q.isEmpty();
      System.out.println(result);
         boolean result1 =  q.isEmpty();
    System.out.println(result1);
    q.enQueue(10);
    q.enQueue(20);
    q.enQueue(40);
    System.out.print (q.dequeue());
    // System.out.println("the cq is successfully deleted");
System.out.print (q.peek());
 q.delete();
}

}