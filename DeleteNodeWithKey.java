public static Linkedlist delete_with_key(int key, Linkedlist head ){
  
  Linkedlist previous = null;
  Linkedlist current =head;
  
   while(current != null){
    //if the key looking for was found
    if(current.data == key){
      break;
    }
    previous = current ;
    current= current.Next;
    
    //if its the first node
    if(current == head){
      return current.Next;
    }
    
    //if not found
    if(current == null){
      return head;
    }
 
    }
//for all other cases 
     previous.Next = current.Next;
     return head; 
  
}