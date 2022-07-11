/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
 // Approach 1 --->

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null) return ans;
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            int tempVal = 0;
            
            while(size --> 0){
                TreeNode temp = q.poll();
                tempVal = temp.val;
                
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
            }
            ans.add(tempVal);
        }
        return ans;
    }
}

// Approach 2 -->

/*
    
    We can also transverse DFS but with right node first along with an ans vector.
    Which represent the last visited value on the respective level.
    We will recursively update the last value on the particular level as we travel.

*/


class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans, 0);
        return ans;
    }
    
     public void dfs(TreeNode root, List ans, int i){
         if(root == null) return ;
         if(i == ans.size())
            ans.add(root.val);
        
         // Right first DFS
        dfs(root.right, ans, i+1);
        dfs(root.left, ans, i+1);
     }
}


