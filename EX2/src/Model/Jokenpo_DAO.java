
package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class Jokenpo_DAO {
    
    public static void joken(){
    
        int machi = 0, jog = 0, contv = 0, contp = 0;
        Random gera = new Random();
       
        String salva = "", resp = "";
        for(int c=0; c<3; c++){
        machi =  gera.nextInt(3)+1;
        if (machi == 1){
            salva = "pedra";
        }else if (machi == 2 ){
            salva = "papel";
        }else{
            salva = "tesoura";
        }
        resp  = resp + "a maquina escolheu: " + salva + "\n\n";
        String x = JOptionPane.showInputDialog(null,"digite:\n1-pedra\n2-papel\n3-tesoura");
        jog = Integer.parseInt(x);
        if (jog == 1){
            salva = "pedra";
        }else if (jog == 2 ){
            salva = "papel";
        }else{
            salva = "tesoura";
        }
        resp  = resp + "Você escolheu: " + salva + "\n\n";
        
        if(machi == 1 && jog == 1 || machi == 2 && jog ==2 || machi == 3 && jog ==3){
        resp = resp + "empate";
    } else if(machi == 1 && jog == 2 || machi == 2 && jog == 3 || machi ==3 && jog ==1){
        resp = resp + "Você ganhou";
        contv++;
    }else{
        resp = resp + "Você perdeu";
        contp++;
    }
        JOptionPane.showMessageDialog(null, resp);
        resp = "";
        }
        
        JOptionPane.showMessageDialog(null, "Você ganhou: " + contv + "\nVocê perdeu: " + contp);  
        
        
}
}
