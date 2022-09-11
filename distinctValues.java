package REVISÃO;

import javax.swing.JOptionPane;


public class Vetores_2
{
    static int TAM = 5;
    
    public static void main(String[] args) 
    {
        // Variáveis
        int i, j; // Controle de Fluxo
        String ac = ""; // Acumlador
        boolean alerta = true; // Flag
        int [] n = new int[TAM]; // Vetor
        
        // Estrutura de Repetição: Entrada de Valores
        for ( i = 0; i < TAM; i ++ )
        {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: " + (i + 1), "Numeros", JOptionPane.INFORMATION_MESSAGE));
            
            // Estrutura de Repetição:  
            for ( j = 0; j < i; j++ )
            {
                if( n[i] == n[j] )
                {
                    n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: " + (i + 1), "Numeros", JOptionPane.INFORMATION_MESSAGE));
                    i--;
                    
                    alerta = false;
                    break;
                }
                
                else
                {
                    alerta = true;
                }
            }
            
            if (alerta == true)
            {
                ac += n[i] + "\n";
            }
   
        }
                        
        JOptionPane.showMessageDialog(null, ac);
    }
}
