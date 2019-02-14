import java.util.Arrays;

class Main 
{ 

    // start and end are optional - some sorting algorithms use them, but you can ignore them
  void sort(double arr[], long start, long end) 
    { 
    double temp = 0;
    double temp2 = 0;
      // sort the array here
      // If drew gets on discord ask how to impliment a random sorter and how to actually get this to print
    if(arr[0] > arr[1]){
      temp = arr[0];
      temp2 = arr[1];
      arr[1] = temp;
      arr[0] = temp2;
         if(arr[1] > arr[2]){
      temp = arr[1];
      temp2 = arr[2];
      arr[2] = temp;
      arr[1] = temp2;
          if(arr[2] > arr[3]){
      temp = arr[2];
      temp2 = arr[3];
      arr[3] = temp;
      arr[2] = temp2;
           if(arr[3] > arr[4]){
      temp = arr[3];
      temp2 = arr[4];
      arr[4] = temp;
      arr[3] = temp2;
           if(arr[4] > arr[5]){
      temp = arr[4];
      temp2 = arr[5];
      arr[5] = temp;
      arr[4] = temp2;
           if(arr[5] > arr[6]){
      temp = arr[5];
      temp2 = arr[6];
      arr[5] = temp;
      arr[6] = temp2;
      
          } 
         } 
        } 
       } 
      } 
    System.out.println(Arrays.toString(arr));
    }
   
    
    } 

  
    // Test program 
    public static void main(String args[]) 
    { 
        double arr[] = {10.0, 7.1, 8.6, 9.9, 1.8, 5.0}; 
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
    } 
} 
