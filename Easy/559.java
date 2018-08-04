/*
559. Maximum Depth of N-ary Tree
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

For example, given a 3-ary tree:

 


 
We should return its max depth, which is 3.

Note:

The depth of the tree is at most 1000.
The total number of nodes is at most 5000.
*/

//Solution in Java
class Solution {
    public int maxDepth(Node root) {
        int counter = 0;
        if(root == null)
            return 0;
        else
        {
            for(Node a : root.children)
            {
                counter = Math.max(counter, maxDepth(a));
            }
            return counter + 1;
        }
    }
}
