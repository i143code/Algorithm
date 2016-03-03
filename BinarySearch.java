//Ashish Ranjan

import java.util.*;
//		 At every step, consider the array between low and high indices
//		 Calculate the mid index.
//		 If element at the mid index is the key, return mid.
//		 If element at mid is greater than the key, then reduce the array size such that high becomes mid - 1. Index at low remains the same.
//		 If element at mid is less than the key, then reduce the array size such that low becomes mid + 1. Index at high remains the same.
//		 When low is greater than high, key doesn't exist. Return -1.
class BinarySearch{
	
	public static void main(String[] args){
		int array[];
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter size of  array:\n");
		 num = input.nextInt();
		// the size of the array 
		 array = new int[num];
		 System.out.println("Please enter "+ num +"the numbers:\n");
		 //write a for loop to store the values in array 
		 
		 for (int i=0;i<num ;i++){		 
			 array[i]=input.nextInt();
//			 System.out.println( array[i]);		 
		 }
         
		 // low:first array, high:last array
		 int high, low ,middle,key;
		 //entering the item you looking for : KEY
		 System.out.println("Please enter the Key you looking for:\n");
		 key= input.nextInt();
		 //the first element in the array 
		 low=0;
		 high= num-1;
		 middle=(high-low)/2;
		 
		 while(low <= high)
		{
			 
			if(array[middle]<key){
				low= middle+1;
			}
			else if(array[middle]==key){ 
				 System.out.println("The element found to be at "+middle+"\n"); 
				 break;
			}
			else{
				 high = middle-1;
			}
			 middle=(high+low)/2;
		}
		 
		 if (low > high ){
	          System.out.println(key + " is not found.\n");
	   } 	
	}	
	
}