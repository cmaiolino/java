import javax.swing.*;

class Programa03
{
	public static void main (String args[])
	{
		int n1, n2, mod;
		double raiz1, raiz2;
		String msg = "";

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2:"));

		mod = n1 % n2;
		raiz1 = Math.sqrt(n1);
		raiz2 = Math.sqrt(n2);

		msg = msg + "remainder: " + mod + "\n";
		msg = msg + "Square n1: " + raiz1 + "\n";
		msg = msg + "Square n2; " + raiz2 + "\n";

		JOptionPane.showMessageDialog(null, msg);

		System.exit(0);
	}
}
