public class UnionSet {
    public int count;
    private int[] parents;

    public UnionSet(int count) {
        this.count = count;
        this.parents = new int[count];

        for (int i = 0; i < count; i++) {
            this.parents[i] = i;
        }
    }

    public int find(int i) {
        int tmp = i;
        while(parents[i] != i) {
            tmp = parents[i];
            parents[i] = parents[parents[i]];
            i = tmp;
        }

        return tmp;
    }

    public void union(int i, int j) {
        int root1 = find(i);
        int root2 = find(j);

        if (root1 == root2) return;

        parents[root1] = root2;
        count --;
    }
}
