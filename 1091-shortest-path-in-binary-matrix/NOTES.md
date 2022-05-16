{ 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };
​
while (!q.isEmpty()) {
int size = q.size();
while (size-- > 0) {
int[] point = q.poll();
​
if (point[0] == m - 1 && point[1] == n - 1)
return point[2]; // Final min count to reach target
​
for (int[] d : dir) {
int r = point[0] + d[0];
int c = point[1] + d[1];
​
if (r >= 0 && c >= 0 && r < m && c < n && grid[r][c] == 0) {
q.add(new int[] { r, c, point[2] + 1 });
grid[r][c] = 1; // mark current grid position as visited
}
}
}
}
​
return -1;
}
}
```
​
---
​
**Credits:** Solution video made by Algorithms Made Easy - https://www.youtube.com/watch?v=CABaqOkWbgQ