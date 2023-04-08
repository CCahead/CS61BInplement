package Lec14.DisjointSet;

public class QuickUnionDS implements DisjointSets{
    private int[] parent;
    public QuickUnionDS(int N){
        parent=new int[N];
        for(int i=0;i<=N-1;i++){
            parent[i]=-1;//Initialize N trees
        }
    }
    public boolean isConnected(int p,int q){
        return find(p)==find(q);
    }
    public void connect(int p,int q){
        int r1=find(p);
        int r2=find(q);
        parent[r1]=r2;
    }
    public int find(int p){
        int r=p;
        while(parent[r]>=0){
            r=parent[r];
        }
        return r;
    }
}
