// Given the pointer/reference to the head of a singly linked list, 
// reverse it and return the pointer/reference to the head of reversed linked list.
public static Linkedlist reverserlist (Linkedlist head){
	   //first elemnet being null or only one node
	if(head==null || head.Next ==null){
		return head;
	}
	   //list_to_do is pointing to second node and reversed is pointing to first node
	Linkedlist list_to_do = head.Next;
	Linkedlist reversed = head;
	reversed.Next = null;
	   
	while(list_to_do != null){
		Linkedlist temp = list_to_do;
		list_to_do= list_to_do.Next;
		temp.Next = reversed;
		reversed.Next = temp;      
	   }
	return reversed;   
   }  
}