
package exerc_05;

import javax.swing.JOptionPane;

public class Exerc_05 {

    public static void main(String[] args) 
    {
        double a = 0, b = 0, hp = 0;
        
        JOptionPane.showMessageDialog(null, "Abaixo, você digitará dois valores para saber a hipotenusa de um triângulo.");
                      
        a = calcular();
        b = calcular();
        hp = hipotenusa(a,b);
        
        JOptionPane.showMessageDialog(null, "A hiporenusa do triângulo é de: " +hp); 
    }
    
    static double calcular()
    {
        double valora = 0;
        
        valora = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite um valor: "));
        
        return valora;
    }
    
    static double hipotenusa(double bs, double al)
    {
        double hp;
        
        hp = (bs*bs)+(al*al);
        
        return hp;
    }

}
