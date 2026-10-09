// Last updated: 10/9/2026, 2:56:00 PM
1import java.util.*;
2
3class RandomizedSet {
4    private ArrayList<Integer> list;
5    private HashMap<Integer, Integer> map;
6    private Random random;
7
8    public RandomizedSet() {
9        list = new ArrayList<>();
10        map = new HashMap<>();
11        random = new Random();
12    }
13
14    public boolean insert(int val) {
15        if (map.containsKey(val)) {
16            return false;
17        }
18
19        map.put(val, list.size());
20        list.add(val);
21        return true;
22    }
23
24    public boolean remove(int val) {
25        if (!map.containsKey(val)) {
26            return false;
27        }
28
29        int index = map.get(val);
30        int last = list.get(list.size() - 1);
31
32        list.set(index, last);
33        map.put(last, index);
34
35        list.remove(list.size() - 1);
36        map.remove(val);
37
38        return true;
39    }
40
41    public int getRandom() {
42        return list.get(random.nextInt(list.size()));
43    }
44}
45
46/**
47 * Your RandomizedSet object will be instantiated and called as such:
48 * RandomizedSet obj = new RandomizedSet();
49 * boolean param_1 = obj.insert(val);
50 * boolean param_2 = obj.remove(val);
51 * int param_3 = obj.getRandom();
52 */