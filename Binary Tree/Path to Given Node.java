
public class Solution {
    public ArrayList<Integer> solve(TreeNode A, int B){
        ArrayList<Integer> arr = new ArrayList<>();
        if(A == null) return arr;
        inorder(A, arr, B);
        return arr;
    }

    private boolean inorder(TreeNode root, ArrayList<Integer> arr, int node){
        if(root == null)
			return false;
        
		arr.add(root.val);
        
		if(root.val == node) 
			return true;
        if(inorder(root.left, arr, node) || inorder(root.right, arr, node)) 
			return true;

        arr.remove(arr.size() - 1);
        return false;
    }
}
