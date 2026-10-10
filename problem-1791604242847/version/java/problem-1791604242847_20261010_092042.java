// Last updated: 10/10/2026, 9:20:42 AM
1import java.util.*;
2
3class Solution {
4    public double[] calcEquation(List<List<String>> equations, double[] values,
5                                List<List<String>> queries) {
6        Map<String, Map<String, Double>> graph = new HashMap<>();
7
8        for (int i = 0; i < equations.size(); i++) {
9            String a = equations.get(i).get(0);
10            String b = equations.get(i).get(1);
11            double value = values[i];
12
13            graph.putIfAbsent(a, new HashMap<>());
14            graph.putIfAbsent(b, new HashMap<>());
15
16            graph.get(a).put(b, value);
17            graph.get(b).put(a, 1.0 / value);
18        }
19
20        double[] result = new double[queries.size()];
21
22        for (int i = 0; i < queries.size(); i++) {
23            String a = queries.get(i).get(0);
24            String b = queries.get(i).get(1);
25
26            if (!graph.containsKey(a) || !graph.containsKey(b)) {
27                result[i] = -1.0;
28            } else if (a.equals(b)) {
29                result[i] = 1.0;
30            } else {
31                result[i] = dfs(a, b, graph, new HashSet<>());
32            }
33        }
34
35        return result;
36    }
37
38    private double dfs(String start, String end,
39                       Map<String, Map<String, Double>> graph,
40                       Set<String> visited) {
41        if (start.equals(end)) {
42            return 1.0;
43        }
44
45        visited.add(start);
46
47        for (Map.Entry<String, Double> entry : graph.get(start).entrySet()) {
48            String next = entry.getKey();
49
50            if (!visited.contains(next)) {
51                double result = dfs(next, end, graph, visited);
52
53                if (result != -1.0) {
54                    return entry.getValue() * result;
55                }
56            }
57        }
58
59        return -1.0;
60    }
61}