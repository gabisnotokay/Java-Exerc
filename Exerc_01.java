
package exerc_01;

import javax.swing.JOptionPane;

public class Exerc_01 {


    public static void main(String[] args) 
    {
        double me = 0, na = 0, nb = 0;
        String nm;
        JOptionPane.showMessageDialog(null, "Abaixo, você digitará seu nome. E para saber a média, dois valores\ncorrespodentes as suas notas bimestrais");
        
        nm = JOptionPane.showInputDialog("Por favor, digite o seu nome: ");
        
        na = lernota();
        nb = lernota();
        me = media(na,nb);
        
        JOptionPane.showMessageDialog(null, "" +nm+", sua média é: " +me);        
    }
    
    static double lernota()
    {
        double nota1 = 0;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite sua nota: "));
        
        return nota1;
    }
    
    static double media(double no1, double no2)
    {
        double md;
        
        md = (no1+no2)/2;
        
        return md;
    }
}