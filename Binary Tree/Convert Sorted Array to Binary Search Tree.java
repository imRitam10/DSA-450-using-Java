class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length ;
        if(n == 0)
            return null;
        
        TreeNode head = bst(nums, 0, n - 1);
        return head;
    }
    private TreeNode bst(int[] nums, int low, int high){
        if(low > high)
            return null;
        int mid = low + (high-low)/2; 
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bst(nums, low, mid -1);
        node.right = bst(nums, mid + 1 , high);
        
        return node;
    }
}
