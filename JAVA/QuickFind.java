public class QuickFind{
    private int id[];

    QuickFind(int N){
        this.id = new int[N];
        for (int i = 0; i<N; i++){
            this.id[i]=i;
        }
    }

    Boolean connected(int p, int q){
        return this.id[p] == this.id[q];
    }

    void union(int p, int q){
        int pid = this.id[p];
        int qid = this.id[q];

        for (int i = 0; i < this.id.length; i++){
            if (this.id[i] == pid){
                this.id[i] = qid;
            }
        }
    }


    public static void main (String args[]){
        QuickFind qf = new QuickFind(10);
        System.out.println(qf.connected(1,2));
        qf.union(1,2);
        System.out.println(qf.connected(1,2));
    }
}