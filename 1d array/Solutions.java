class Solutions {
    public int secondLargestElement(int[] nums) {
      
      int largest = Integer.MIN_VALUE;
      int secondLargestElement = Integer.MIN_VALUE ;
      for(int num : nums)
      {
        if(num > largest)
        {
           
            secondLargestElement = largest ;
             largest = num ;
        }
     
        
      else if(num > secondLargestElement && num != largest)
      {
        secondLargestElement = num ;
      }

    
    }
    return secondLargestElement;
}

public static void main(String[] args)
{
    Solutions s = new Solutions() ;
    
     int[] nums = {7, 7, 2, 2, 10, 10, 10};
      System.out.println(s . secondLargestElement(nums)) ;
}
}