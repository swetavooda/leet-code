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
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        int lc=0,rc=0;
        int sum=0;
        TreeNode lp=root;
        TreeNode rp=root;
        while(lp!=null)
            {
                lp=lp.left;
                lc++;
            }
        while(rp!=null)
            {
                rp=rp.right;
                rc++;
            }
        
        if(lc==rc)
        {
            return (1<<lc)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);

    }
}    
 