# 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree

## Java | 3 Solutions | DFS | BFS

### 1. DFS - Recursive Inorder Traversal

- Recursive inorder traversal is extremely simple: 
	- follow Left->Node->Right direction, i.e., do the recursive call for the left child, 
	- then do all the business with the node (= check if the node is a target one or not), 
	- and then do the recursive call for the right child.

#### Java Code

```
class Solution {
    TreeNode ans, target;

    public void inorder(TreeNode o, TreeNode c) {
        if (o != null) {
            
            inorder(o.left, c.left);
            
            // Save the answer globally
            if (o == target) {
                ans = c;
                return;
            }
            
            inorder(o.right, c.right);    
        }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        // Save the target for global access
        this.target = target;
        
        inorder(original, cloned);
        
        return ans;
    }
}
```

#### Complexity Analysis

- Time complexity: O(N). 
	- Since one has to visit each node, where NN is a number of nodes.
- Space complexity: O(N). 
	- In the degenerative tree case (where the tree is shaped like a linked list), all nodes will be on the run-time stack while the deepest node is being processed. 
	- If the tree is balanced, the space complexity will be nearer to O(logN), but remember that for the purposes of complexity analysis, we mostly consider the worst case.

---

### 2. DFS - Iterative Inorder Traversal.

- Iterative inorder traversal is straightforward: 
	- go left as far as you can, 
	- then one step right. 
	- Repeat till the end of nodes in the tree.
- [Don't use Stack in Java, use ArrayDeque instead.](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

#### Java Code

```
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Deque<TreeNode> stack_o = new ArrayDeque();
        Deque<TreeNode> stack_c = new ArrayDeque();
        TreeNode node_o = original, node_c = cloned;

        while (!stack_o.isEmpty() || node_o != null) {
            while (node_o != null) {
                stack_o.add(node_o);
                stack_c.add(node_c);

                node_o = node_o.left;
                node_c = node_c.left;
            }
            node_o = stack_o.removeLast();
            node_c = stack_c.removeLast();
            if (node_o == target) {
                return node_c;
            }
            node_o = node_o.right;
            node_c = node_c.right;
        }
        return null;
    }
}
```

#### Complexity Analysis

- Time complexity: O(N). 
	- Since one has to visit each node, where NN is a number of nodes.
- Space complexity: O(N). 
	- In the degenerative tree case (where the tree is shaped like a linked list), all nodes will be on the run-time stack while the deepest node is being processed. 
	- If the tree is balanced, the space complexity will be nearer to O(logN), but remember that for the purposes of complexity analysis, we mostly consider the worst case.

---

### 3. BFS - Iterative Traversal

#### Algorithm

- Here we implement standard BFS traversal with the queue:
- Add root into queue.
- While queue is not empty:
	- Pop out a node from queue.
	- If the node is a target, we're done.
	- Add first left and then right child node into queue.
- [Don't use Stack in Java, use ArrayDeque instead.](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

#### Java Code

```
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Deque<TreeNode> queue_o = new ArrayDeque();
        queue_o.offer(original);
        
        Deque<TreeNode> queue_c = new ArrayDeque();
        queue_c.offer(cloned);

        while (!queue_o.isEmpty()) {
            TreeNode node_o = queue_o.poll();
            TreeNode node_c = queue_c.poll();
            
            if (node_o == target) {
                return node_c;   
            }
            
            if (node_o.left != null) {
                queue_o.offer(node_o.left);
                queue_c.offer(node_c.left);
            }
            if (node_o.right != null) {
                queue_o.offer(node_o.right);
                queue_c.offer(node_c.right);
            }
        }
        return null;
    }
}
```

#### Complexity Analysis

- Time complexity: O(N) 
	- since one has to visit each node.
- Space complexity: O(N) to keep the queue. 
	- Let's use the last level to estimate the queue size. 
	- This level could contain up to N/2N/2 tree nodes in the case of [complete binary tree.](https://leetcode.com/problems/count-complete-tree-nodes/)

---

### Definition for a binary tree node
 
#### Java Code

 ```
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 ```
 
 ---
 
 **Credits:** LeetCode Official Solution - https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/solution/
