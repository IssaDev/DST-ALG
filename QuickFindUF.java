public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for(int i =0; i<N; i++){
            id[i] = i;
        }
    }
    // we use a data structure where connected share the same id
    // makes union slower
    /*public boolean isConnected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i =0; i< id.length; i++){
            if(id[i] == pid )id[i] = qid;
        }
    }*/

    //we use a tree structure
    public int findRoot(int p){
        int pRoot = id[p];
        if(p != id[pRoot]){
            findRoot(id[pRoot]);
        }
        return pRoot;
    }
    public boolean isConnected(int p, int q){
        return findRoot(p) == findRoot(q);
    }
    public void union (int p, int q){
        int pRoot = findRoot(p);
        int qRoot = findRoot(q);
        id[pRoot] = qRoot;
    }
}
