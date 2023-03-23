
package exerc_03;

import javax.swing.JOptionPane;

public class Exerc_03 {

    public static void main(String[] args) 
    {
        
        double h = 0, ps = 0;
        String SX;
        
        JOptionPane.showMessageDialog(null, "Aqui, você saberá seu peso ideal.");
        
        SX = JOptionPane.showInputDialog("Por favor, digite seu sexo. F para feminimo e M para masculino.");
        h = Double.parseDouble(JOptionPane.showInputDialog("Agora, digite a sua altura."));//Não consegui fazer com que receba em double  
        
        ps = pesoideal(SX,h);
        
        JOptionPane.showMessageDialog(null, "Seu peso ideal é de: " +ps); 
    }
    
    static double pesoideal(String SX, double h)
    {
        double ps = 0;
        
        if (SX.equals ("M") || (SX.equals ("m") )) {
            
            ps = (72.7*h)-58;
        }
      
        else if(SX.equals ("F") || (SX.equals ("f") )) {
            
            ps = (62.1*h)-44.7;
        }
        
        return ps;
         
    }
    
}
