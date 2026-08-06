class Solution {
    public int findCenter(int[][] edges) {
        int[] degree=new int[edges.length+2];
        for(int[] edge:edges){
            degree[edge[0]]++;
            degree[edge[1]]++;
        }
        int n=edges.length+1;
        for(int i=1;i<=n;i++){
            if(degree[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}