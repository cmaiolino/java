class Contas
{
	public static void main(String args[])
	{
		int n1, n2;
		int mod, div;
		double raiz, pow;
		String msg = "";

		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);

		mod = n1 % n2;
		div = (int)n1 / (int)n2;
		raiz = Math.sqrt(n1);
		pow = Math.pow(n1, n2);

		// Saida
		
		msg = "n1 = " + n1 + " n2 = " + n2 + "\n";
		msg = msg + "mod n1 % n2 = " + mod + "\n";
		msg = msg + "quociente: " + div + "\n";
		msg = msg + "sqr: " + raiz + "\n";
		msg = msg + "Power: " + pow + "\n";

		System.out.println(msg);
		System.exit(0);
	}
}
