import java.util.EmptyStackException;
public class Stack{
    public class StackNode{
        public StackNode above;
        public StackNode below;
        public int value;
        public StackNode(int value)
        {
            this.value = value;
        }
    }
    private int capacity;
    public StackNode top;
     public StackNode bottom;
    public int size =0;
    public Stack(int capacity)
    {
        this.capacity = capacity;
    }
    public boolean isFull()
    {
        return capacity == size ;

   
 }
 public void join(StackNode above,StackNode below)
 {if(below != null) below.above = above;
    if(above != null) above.below = below;

 }
 public boolean push(int v)
 {
     if(size >= capacity)
     {
         return false;
     }
     StackNode newNode = new StackNode(v);
     if(size == 0)
     {
         bottom = newNode;
     }
     else
     {
         join(newNode, top);
     }
     top = newNode;
     size++;
     return true;
}
public int pop()
{if(top == null){
    throw  new EmptyStackException() ;

}
else{
    int result = top.value;
    top = top.below;
    size--;
    return result;
}

}

}