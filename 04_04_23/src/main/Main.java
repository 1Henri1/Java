
package main;

import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        
        
        String x = JOptionPane.showInputDialog(null,"digite seu nome");
        String y = JOptionPane.showInputDialog(null,"digite a nota do primeiro bimestre");
        double nota1 = Double.parseDouble(y);
        String z = JOptionPane.showInputDialog(null,"digite a nota do segundo bimestre");
        double nota2 = Double.parseDouble(z);
        String a = JOptionPane.showInputDialog(null,"digite a nota do terceiro bimestre");
        double nota3 = Double.parseDouble(a);
        double b  = (nota1 + nota2 + nota3)/3;
       
        
        JOptionPane.showMessageDialog(null, "o aluno "+ x + "\n teve como média: " + String.format("%.2f",b) );
    }
    
        
}
