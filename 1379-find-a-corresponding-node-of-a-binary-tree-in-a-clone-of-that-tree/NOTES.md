# 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
​
## Java | 3 Solutions | DFS | BFS
​
### 1. DFS - Recursive Inorder Traversal
​
- Recursive inorder traversal is extremely simple:
- follow Left->Node->Right direction, i.e., do the recursive call for the left child,
- then do all the business with the node (= check if the node is a target one or not),
- and then do the recursive call for the right child.
​
#### Java Code
​
```
class Solution {
TreeNode ans, target;
​
public void inorder(TreeNode o, TreeNode c) {
if (o != null) {
inorder(o.left, c.left);
// Save the answer globally
if (o == target) {
ans = c;
return;