/*
 * Quick Union algorithm
 *
 * Slightly better than quickfind
 *
 * treats each element in the array as a node in a tree and trees may be
 * connected together or not. Essentially each element might be its own tree.
 *
 * Find: Check if p and q have the same root
 *
 * Union. Merge components containing p and q, set the id of p's root to the id
 * of q's root.
 *
 * Still too slow though. Trees can get too tall, where the worst case is a tree
 * where one element points to a single one until the end of the tree,
 * essentially creating an array.
 */

public class QuickUnionUF {
	private int[] id;

	/* Constructor */
	public QuickUnionUF(int N) {
		id = new int[N];

		for (int i = 0; i < N; i++)
			id[i] = i;
	}

	/* Return root of 'i' */
	private int root(int i) {
		while (i != id[i])
			i = id[i];
		return i;
	}

	/* Are the objects connected */
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	/* Connect two objects */
	public void union(int p, int q) {
		int proot = root(p);
		id[proot] = root(q);
	}
}
