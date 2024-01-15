import javax.swing.*;


class test_swing

{

       public static void main(String args[])

       {  

               int num1, num2;

               double div, pow;

               String msg = ""; 


       num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));

       num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));


       div = (int)num1 / (int)num2;

       pow = Math.pow(num1, num2);


       msg = msg + " Resultado das operacoes: \n";

       msg = msg + "Quociente: " + div + "\n";

       msg = msg + "Potencia de " + num1 + " elevado a " + num2 + ": " + pow + "\n";

       msg = msg + "\n";


       JOptionPane.showMessageDialog(null, msg);


       System.exit(0);


       }  

}



