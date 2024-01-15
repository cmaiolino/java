import javax.swing.*;

class loop_while
{
	public static void main(String args[])
	{
		int Tabuada;
		char op = 0;
		String msg = "", msgEntr = "1: For - 2: While - 3: do_while\n";

		Tabuada = Integer.parseInt(JOptionPane.showInputDialog("Numero inteiro:"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

		switch(op) {
			case '1': {
				msg = msg + "Tabuada do " + Tabuada + " pelo for: \n\n";
				for (int i=1; i<=10; i++) {
					msg = msg + Tabuada + " x " + i + " = " +
						    Tabuada*i + "\n";
				}
				break;
			}
			case '2': {
				msg = msg + "Tabuada do " + Tabuada + " pelo while: \n\n";
				int i = 1;
				while (i <= 10) {
					msg = msg + Tabuada + " x " + i + " = " +
						    Tabuada*i + "\n";
					i++;
				}
				break;
			}
			case '3':
				msg = msg + "Tabuada do " + Tabuada + " pelo while: \n\n";
				int i = 1;
				do {
					msg = msg + Tabuada + " x " + i + " = " +
						    Tabuada*i + "\n";
					i++;
				}while(i <= 10);
				break;
			default:
		}

		if (op >= '1' && op <= '3') {
			JOptionPane.showMessageDialog(null, msg);
		}

		System.exit(0);
	}
}
