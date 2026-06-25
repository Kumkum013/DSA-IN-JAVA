public class StackNode
{
    public StackNode above;
    public StackNode below;
    public int value;
    public StackNode(int value)
    {
        this.value = value;
    }
    public class Stack
    {
        private int capacity;
        public StackNode top;
        public StackNode bottom;
        public int size = 0;
        public Stack(int capacity)
        {
            this.capacity = capacity;
        }
        
        public boolean push(int v)
        {
            if (size >= capacity)
            {
                return false;
            }
            size++;
            StackNode newNode = new StackNode(v);
            if (size == 1) bottom = newNode;
            join(newNode, top);
            top = newNode;
            return true;
        }
    }
    
    public void join(StackNode above,StackNode below)
    {
        if(below != null) below.above = above;
        if(above != null) above.below = below;
    }
}
