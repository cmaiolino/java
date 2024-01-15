import javax.swing.*;

class ExLoop {
	public static void main(String args[])
	{
		int a = 0, b = 0, soma = 1;
		char op = 0;
		String msg = "", msgEntr = "1 para adicao - 2 para somatoria\n\n";
		a = Integer.parseInt(JOptionPane.showInputDialog("Numero 1:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Numero 2:"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

		switch(op) {
			case '1': {
				if ( a > 0 && b > 0) {
					soma = a * b;
					msg = msg + "Produto: " + soma + "\n\n";
				}
				break;
			}
			case '2': {
				for (int i = 1; i <= b; i++) {
					soma = soma * a;
				}
				msg = msg + "Produtoria: " + soma + "\n\n";
				break;
			}
			default: JOptionPane.showMessageDialog(null, "Opcao invalida\n");
		}

		if (op >= '1' && op <= '2') {
			JOptionPane.showMessageDialog(null, msg);
		}
		System.exit(0);
	}
}
