public static boolean check_two_binarytreeIdentical(BinaryTreeNode tree1, BinaryTreeNode tree2,){

if(tree1==null && tree2==null){
  
	return true;
}

if(tree1 != null && tree2 !=null){

	return( (tree1.data == tree2.data) &&  check_two_binarytreeIdentical(tree1.left , tree2.left) && check_two_binarytreeIdentical(tree1.right,tree2.right)     )



return true;
}


return false;

}
