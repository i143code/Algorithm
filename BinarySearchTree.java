import java.util.*;

class BinarTree{
	//root node 
	Node root;
	
public insert(int id ){
	
	
	Node newnode = new Node(id);
	
	////if its the first node
	if(root ==null){
		
		root = newnode;
		return;
	}
	else{
		
		Node current = root;
		Node parent = null;
		
		while(true){
			parent = current;
			//data is less than node
			 if(id< current.data){
				
				current = current.leftchild;
				if(current ==null){
					parent.left = newnode;
				}
				//data greater than right node
				else{
					current = current.rightchild;
					//its right child
					if(current ==null){
						parent.right = newnode;
					}	
				}
			}		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
public static void main(String args[]){
	

//implement different method
	
	
	
	
	
}
}
//create a Node
class Node{
	
	int data;
	Node leftchild;
	Node rightchild;
	//constructor
	public Node(int data){
	this.data = data;
	}	
	
}

