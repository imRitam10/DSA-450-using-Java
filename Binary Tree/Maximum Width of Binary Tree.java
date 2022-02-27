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
class Pair {
    TreeNode node; 
    int num; 
    Pair(TreeNode _node, int _num) {
        num = _num;
        node = _node; 
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) 
            return 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>(); 
        q.offer(new Pair(root, 0)); 
        while(!q.isEmpty()){
            int size = q.size();
            int mmin = q.peek().num;    //to make the id starting from zero
            int first = 0,last = 0;
            
            for(int i=0; i<size; i++){
                int cur_id = q.peek().num-mmin;
                TreeNode node = q.peek().node;
                q.poll();
                if(i==0) 
                    first = cur_id;
                if(i==size-1) 
                    last = cur_id;
                if(node.left != null)
                    q.offer(new Pair(node.left, cur_id*2+1));
                if(node.right != null) 
                    q.offer(new Pair(node.right, cur_id*2+2));
            }
            ans = Math.max(ans, last-first+1);
        }
        return ans;
    }
}


// SOL 2 -->

class Solution {
	public int widthOfBinaryTree(TreeNode root) {
		if(root==null || (root.left==null &&root.right==null))
			return 1;

		int maxWidth = 0;
		Map<TreeNode, Integer> map = new HashMap<>(); // <Nodee, Weight>
		map.put(root, 0);
		Queue<TreeNode> q = new LinkedList<>();
		qu.offer(root);
		while(!q.isEmpty()){
			int size = q.size();
			int left = map.get(q.peek());
			while(size-->0){
				TreeNode head = q.poll();
				maxWidth = Math.max(maxWidth , map.get(head) - left+1);
				if(head.left!=null){
					q.offer(head.left);
					map.put(head.left, 2 * map.get(head) );
				}

				if(head.right!=null){

					q.offer(head.right);
					map.put(head.right, 2 * map.get(head) + 1 );
				}
			}
		}
		return maxWidth;
	}
}