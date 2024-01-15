/*
 * Quick Find algorithm
 *
 * Very slow as it uses N^2 time as it needs to access the whole array twice.
 *
 * If we have a 10^9 union commands on 10^9 objects, we'll need 10^18 operations
 * to actually finish the algorithm.
 * 30+ years of computer time.
 *
 * Quadratic algorithms don't scale with technology.
 */

public class QuickFindUF {
	private int[] id;

	/* Constructor */
	public QuickFindUF(int N) {
		id = new int[N];

		for (int i = 0; i < N; i++)
			id[i] = i;
	}

	/* Are the objects connected */
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

	/* Connect two objects */
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];

		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid)
				id[i] = qid;
		}
	}
}
