// Pacote
package Extra;

// Bibliotecas
import java.util.ArrayList;
import java.util.Scanner;

public class EX_02 
{
    public static void main(String[] args) 
    {
        // Variaveis
        ArrayList lista = new ArrayList(); // Lista
        double vetor [] = new double[3]; // Vetor
        
        // Instanciacao
        Scanner ent = new Scanner(System.in);
        
        // Estrutura de repeticao: Populando vetor
        for (int i = 0; i < 3; i++) 
        {
            System.out.printf("# Numero [%d]: ", i+1);
            vetor[i] = ent.nextDouble();
        }
        
        // Chamada de metodo: Atribuindo funcao
        double[] vetor_lista = ordem_crescente(vetor);
        
        // Estrutura de repeticao: Populando lista
        for (int i = 0; i < vetor_lista.length; i++) 
        {
            // Adicionando valores na lista a partir do vetor
            lista.add(vetor[i]);
        }

        // Chamada de metodo: Imp_lista
        imp_lista(lista);

    }
    
    // Funcao: Bubble Sort (ordem crescente)
    static double[] ordem_crescente(double vetor[])
    {
        // Variavel
        double aux;
        
        // Estrutura de repeticao: i
        for (int i = 0; i < vetor.length; i++)
        {
            // Estrutura de repeticao: j
            for (int j = 0; j < i; j++) 
            {
                // Estrutura de decisao
                if (vetor[i] < vetor[j])
                {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            } 
        }
        
       // Retorno do vetor
       return vetor;
    }
    
    static void imp_lista(ArrayList lista)
    {
        System.out.println("\n------ RELATORIO ------");
        
        lista.stream().forEach((w) ->     
                System.out.println("# " + w));
        
        System.out.println("-----------------------");
    }
}
