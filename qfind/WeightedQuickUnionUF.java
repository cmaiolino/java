/*
 * Weighted Quick Union algorithm
 *
 * Adds weight to the quick union.
 *
 * Find: Check if p and q have the same root
 *
 * Union. Merge trees, but the merge is done depending on the size of each tree.
 * The smaller one will be merged into the larger one.
 *
 * The downside is we need to keep a new extra array to keep track of the
 * number of elements on each node.
 *
 */

public class WeightedQuickUnionUF {
	private int[] id;
	private int[] sz;

	/* Constructor */
	public WeightedQuickUnionUF(int N) {
		id = new int[N];
		sz = new int[N];

		for (int i = 0; i < N; i++)
			id[i] = i;

		/* Every node starts with a single item, itself */
		for (int i = 0; i < N; i++)
			sz[i] = 1;
	}

	/* Return root of 'i' */
	private int root(int i) {
		while (i != id[i]) {
			/* Compress paths, by pointing the current node to the
			 * root of its parent */
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}

	/* Are the objects connected */
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	/* Connect two objects */
	public void union(int p, int q) {
		int proot = root(p);
		int qroot = root(q);

		if (sz[proot] < sz[qroot]) {
			id[proot] = qroot;
			sz[proot] += sz[qroot];
		} else {
			id[qroot] = proot;
			sz[qroot] += sz[proot];
		}
	}
}
