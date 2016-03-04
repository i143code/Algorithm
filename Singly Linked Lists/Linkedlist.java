public class Linkedlist {
   private Node header;
   private Node lastnode;
   private int size;
   
   //header and last node pointing towards dummy node
   public Linkedlist(){
	   header = new Node(null);
	   lastnode = header;
   }
	
   public void prepend(Integer data){
	   Node n =new Node(data);
	   //if the size is empty
	   if(size==0){
		   header.Next =n;
		   lastnode=n;
		   size++;
	   
	   }
	   else
	   { 
		   //if the size is not empty
		   //created a temp pointer
		   Node temp = header.Next;
		   header.Next=n;
		   n.Next=temp;
		   size++;	   
		   
	   }  
   }
	
}