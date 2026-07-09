// Last updated: 7/9/2026, 3:09:44 PM
class Solution {
    public boolean validPath(int n, int[][] e, int s, int d) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        int m=e.length;
        for(int i=0;i<m;i++){
            int sv=e[i][0];
            int ev=e[i][1];
            adj.get(sv).add(ev);
            adj.get(ev).add(sv);
        }
        boolean[] vis=new boolean[n];
        dfs(adj, vis,s);
        if(vis[s]==true && vis[d]==true) return true;
        return false;
    }
    void dfs(List<List<Integer>> adj, boolean[] vis, int s){
        vis[s]=true;
        int m=adj.get(s).size();
        for(int i=0;i<m;i++){
            int x=adj.get(s).get(i);
            if(vis[x]==false) dfs(adj, vis, x);
        }
    }
}