import java.util.Arrays;

class Main 
{ 

    // start and end are optional - some sorting algorithms use them, but you can ignore them
    void sort(double arr[], long start, long end) 
    { 
      // sort the array here
    } 

  
    // Test program 
    public static void main(String args[]) 
    { 
        double arr[] = {10.0, 7.1, 8.6, 9.9, 1.8, 5.0}; 
        System.out.println("original array"); 
        System.out.println(Arrays.toString(arr));
        
        Main sorter = new Main(); // create a sorter object
        sorter.sort(arr, 0, arr.length); // call the sort function
  
        System.out.println("sorted array"); 
        System.out.println(Arrays.toString(arr));
    } 
} 
