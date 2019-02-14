import java.util.Arrays;

class Main2 
{ 
  
  // start and end are optional - some sorting algorithms use them, but you can ignore them
  void sort(double arr[], long start, long end) 
  { 
    double temp = 0;
    double temp2 = 0;
    int arrlen = arr.length;
    // sort the array here
    // If drew gets on discord ask how to impliment a random sorter and how to actually get this to print
    for(int i = 0; i < arr.length; i++){
      int A = 0;
      int B = 1;
      if(arr[A] > arr[B]){
        temp = arr[A];
        temp2 = arr[B];
        arr[A] = temp;
        arr[B] = temp2;
        A++;
        B++;
      }
      
      System.out.println(Arrays.toString(arr));
    }
  }
  
  
  
  
  
  // Test program 
  public static void main(String args[]) 
  { 
    double arr[] = {10.0, 7.1, 8.6, 9.9, 1.8, 5.0}; 
    int arrlen = arr.length;
    System.out.println("original array: "); 
    System.out.println(Arrays.toString(arr));
    
    // create a sorted version to test.
    double sortedArr[] = arr.clone();
    Arrays.sort(sortedArr);
    System.out.println("sorted array: "); 
    System.out.println(Arrays.toString(sortedArr));
    
    
    Main sorter = new Main(); // create a sorter object
    sorter.sort(arr, 0, arr.length); // call the sort function
    
    System.out.println("your sorted array: "); 
    System.out.println(Arrays.toString(arr));
    System.out.println(arrlen);
  } 
} 