​
#### Complexity Analysis
​
- Time complexity: O(N).
- Since one has to visit each node, where NN is a number of nodes.
- Space complexity: O(N).
- In the degenerative tree case (where the tree is shaped like a linked list), all nodes will be on the run-time stack while the deepest node is being processed.
- If the tree is balanced, the space complexity will be nearer to O(logN), but remember that for the purposes of complexity analysis, we mostly consider the worst case.
​
---
​
### 3. BFS - Iterative Traversal
​
#### Algorithm
​
- Here we implement standard BFS traversal with the queue:
- Add root into queue.
- While queue is not empty:
- Pop out a node from queue.
- If the node is a target, we're done.
- Add first left and then right child node into queue.
- [Don't use Stack in Java, use ArrayDeque instead.](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)
​
#### Java Code
​
```
class Solution {
public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
Deque<TreeNode> queue_o = new ArrayDeque();
queue_o.offer(original);
Deque<TreeNode> queue_c = new ArrayDeque();
queue_c.offer(cloned);
​
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