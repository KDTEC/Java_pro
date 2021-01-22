package list_java;
import java.util.*;
public class MinMax {
	
	static int finddiff(Integer[] arr,int n) {
		int diff = Integer.MAX_VALUE; 
	      
        // Find the min diff by comparing difference 
        // of all possible pairs in given array 
        for (int i=0; i<n-1; i++) 
            for (int j=i+1; j<n; j++) 
                if (Math.abs((arr[i] - arr[j]) )< diff) 
                    diff = Math.abs((arr[i] - arr[j])); 
      
        // Return min diff     
        return diff;
		
	}
	
	static int finddiffmax(Integer[] arr,int arr_size) {
		int max_diff = arr[1] - arr[0]; 
		  int i, j; 
		  for (i = 0; i < arr_size; i++) 
		  { 
		    for (j = i+1; j < arr_size; j++) 
		    {         
		      if (arr[j] - arr[i] > max_diff)    
		         max_diff = arr[j] - arr[i]; 
		    }     
		  }           
		  return max_diff; 
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.print("Enter Elements: ");
		while(sc.hasNextInt()) {
			arr.add(sc.nextInt());
		}
		System.out.println(arr);
		System.out.println("Minimum difference is: "+finddiff(arr.toArray(new Integer[arr.size()]),arr.size()));
		System.out.println("Maximum difference is: "+finddiffmax(arr.toArray(new Integer[arr.size()]),arr.size()));

	}

}
