class Solution{
    public int countNodes(TreeNode root){
        
        if(root == null)
            return 0;
        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);
        
         //If left and right are equal it means that the tree is complete and hence go for 2^h -1.
        if(leftHeight == rightHeight) return ((2<<(leftHeight)) -1);
            
        //else recursively calculate the number of nodes in left and right and add 1 for root.
        else return countNodes(root.left)+ countNodes(root.right)+1;
    }
    private int getLeftHeight(TreeNode root){
        int count = 0 ;
        while(root.left != null){
            count++;
            root = root.left;
        }
        return count;
    }
    private int getRightHeight(TreeNode root){
        int count = 0; 
        while(root.right != null){
            count++;
            root = root.right;
        }
        return count;
    }
}