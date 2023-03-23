
package exerc_02;

import javax.swing.JOptionPane;

public class Exerc_02 {

    public static void main(String[] args) 
    {
        
        int a = 0, b = 0;
        
        JOptionPane.showMessageDialog(null, "Aqui, você saberá a diferença de dois números digitados.");
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o primeiro número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        
        diferenca(a,b);
       
    }
    
    static void diferenca(int n1, int n2)
    {
        int diferenca=0;
        
        if (n1>n2)
        {
         diferenca = n1 - n2;
        }
        
        else
        {
         diferenca = n2 - n1;
        }
        
        JOptionPane.showMessageDialog(null,"A diferença entre os números digitados é de: " +diferenca);
         
    }
    
}

