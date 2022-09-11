//Pacote
package Tarefas_1;

// Biblioteca
import java.util.Scanner;

public class EX_10 
{
    public static void main(String[] args) 
    {
        // Apresentacao
        System.out.println("# Programa EX_10");

        try
        {
            // Programa
            exec_program();
        } 
        
        catch (Exception e) 
        {
            //System.err.println(e);
        }
    }
    
    // Metodo: Execucao do programa principal
    private static void exec_program()
    {
        // Variavel
        int num;
        
        // Instanciacao
        Scanner ent = new Scanner(System.in);

        System.out.println("");
        while (true) 
        {
            // Entrada de dados
            System.out.print("# Numero ['-1' para terminar programa]: ");
            num = ent.nextInt();
            
            if (num == -1)
            {
                break;
            }
            
            else if (num < 0)
            {
                continue;
            }
            
            else
            {
                System.out.printf("* Resultado: [%s] \n\n", verificador_primo(num));
            }
        }
    }
 
    // Funcao: Verificador de numero primo
    private static String verificador_primo(int num)
    {
        // Variaveis
        int i = 1;
        int cont_zero = 0;

        // Estrutura de repeticao
        while(i <= num)
        {
            // Estrutura de decisao: Resto da divisao = 0
            if (num % i == 0)
            {
                cont_zero ++;// Contagem de 'zeros'                                              
            }
            
            else if(cont_zero > 2)
            {
                // Quebra de loop
                break;
            }

            // Incrementador
            i++;
        }

        // Estrutura de decisao: Analise das contagem de 'zeros'
        if (cont_zero == 2)
        {
            return "Primo";            
        }

        else if (cont_zero == 1)
        {
            return "Divisor universal";
        }

        else
        {
            return "Nao primo";            
        }
    }
}
