package REVISÃO;

import javax.swing.JOptionPane;

public class Vetores_1
{
    public static void main ( String args [] )
    {
        // ATRIBUTOS //
        int x; // Índice da Matriz
        int i; // Índice do Valor
        int vet [] = new int [5]; // Vetor
              
        String ac = ""; // Acumulador
        int b = 0; // Controlador de erro
        
        // Percorrendo a sequência a ser digitada
        for( x = 0; x < 5; x ++ )
        {
            vet[x] = Integer.parseInt( JOptionPane.showInputDialog ( null, " Digite o " + ( x + 1 ) + " º Valor ") );
           
            if ( x != 0 )
            {
                // Conferindo 1 a 1 entre o valor digitado e a posição que se encontra: Vet[2] = Vet[0] e Vet[1]; 
                for ( i = 0; i < x ; i ++ )
                {
                    if ( vet[x] == vet[i] )
                    {
                        b = 1; // Ganha "1", caso o valor se repita
                        
                        JOptionPane.showMessageDialog( null, " NÚMERO REPETIDO, DIGITE NOVAMENTE ");
                        x--;
                        
                        break; // Quebra o laço, saindo imediatamente do "for"
                    }
                    
                    else
                    {
                        b = 0; // Ganha um "0" se o valor não se repetir
                    }
                }
                // Somando o "1" ao "i"; i = i + 1;
            }
            
            if ( b == 0 )
            {
                ac += "\n" + vet[x]; // Só passa ao "ac", que não tem erro;
            }
            
            // Somando o "1" ao "x"; x = x + 1; 
        }
            
        JOptionPane.showMessageDialog( null, ac );
    }
}
