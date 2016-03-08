// We are given a linked list of integers and we have to remove all the duplicate
// nodes from it by keeping only the first occurrence of each duplicate

public static Linkedlist remove_duplicates(Linkedlist head){
	   if(head == null){
		   return head;
	   }
	   //creating a hashset
	   HashSet<Integer> values = new HashSet<> ();
	   Linkedlist current = head;
	   while(current.Next != null){
		 //data not found add to hashset
		 if (!values.contains(current.data)){
			//adding the data in the hashset
			  values.add(current.data);
			}
		  else{
			  //duplicates values found
			  current.Next = current.Next.Next;
		  }
	   }
   return head;
   }
