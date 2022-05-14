class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        // Creation of Adjacency list for the given directed graph
		Map<Integer, List<int[]>> graph = new HashMap<>();
		for (int[] time : times) {
			int source = time[0], target = time[1], weight = time[2];
			if (!graph.containsKey(source)) {
				graph.put(source, new LinkedList<int[]>());
			}
			graph.get(source).add(new int[] { target, weight });
		}

		// Creation of min heap
		Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		// ((a, b) -> a[1] - b[1]) - Lambda expression sorts weights in ascending order

		// Creation of a Hashset to keep track of visited nodes
		Set<Integer> visited = new HashSet<>();

		// Adding the first element (starting node of the graph)
		minHeap.add(new int[] { k, 0 });

		int result = 0;

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

		return visited.size() == n ? result : -1;
    }
}