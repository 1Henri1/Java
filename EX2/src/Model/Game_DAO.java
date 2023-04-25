package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class Game_DAO {
    
    public static void game(){
    
        int ale[] = new int [10];
        
        int num[] = new int [10];

        int cont = 0;
        
        String tale = "";
        
        Random gera = new Random();
        
        for(int c = 0; c<10; c++){
            ale[c] = gera.nextInt(2);
            tale = tale + ale[c] + " | ";
        }
        
        tale = tale + "\n\n";
        
         for(int c = 0; c<10; c++){
            String x = JOptionPane.showInputDialog(null, "Digite 0 ou 1\n" + (c+1));
            num[c] = Integer.parseInt(x);
            tale = tale + num[c] + " | ";
        }
         
         for(int c = 0; c<10; c++){
            if (ale[c] == num[c]){
                cont++;
            } 
        }
         tale = tale + "\n\nO número de acertos foi: " + cont;
        JOptionPane.showMessageDialog(null, tale);
        
        
}
    
}
