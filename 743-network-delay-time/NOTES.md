​
// Creation of a Hashset to keep track of visited nodes
Set<Integer> visited = new HashSet<>();
​
// Adding the first element (starting node of the graph)
minHeap.add(new int[] { k, 0 });
​
int result = 0;
​
// Breadth-first search - Dijkstra's algorithm
while (!minHeap.isEmpty()) {
int[] top = minHeap.poll();
int source = top[0], srcWeight = top[1];
if (visited.contains(source)) {
// to avoid cycles in graph
continue;
}
result = srcWeight;
visited.add(source);
if (!graph.containsKey(source)) {
// if current node does not point to anything
continue;
}
for (int[] edge : graph.get(source)) {
int target = edge[0], trgWeight = edge[1];
minHeap.add(new int[] { target, srcWeight + trgWeight });
}
}
​
return visited.size() == n ? result : -1;
}
}
```
​
---
​
**Credits:**
​
1. NeetCode Solution Video (for Logic Explanation) - https://www.youtube.com/watch?v=EaphyqKU4PQ
2. Eric Programming Solution Video (for Java Code) - https://www.youtube.com/watch?v=NHLValhbnVE&t