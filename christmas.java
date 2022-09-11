// Pacote
package Tarefas_1;

public class EX_12 
{
    public static void main(String[] args) 
    {
        System.out.println("# Programa EX_12");

        try 
        {
            // Execucao do programa
            exec_program();
        } 

        catch (Exception e)
        {
            //System.err.println(e);        
        }
    }

    // Metodo: Programa principal
    private static void exec_program() 
    {
        // Variaveis: Lista numerica
        String lista_num [] = {"first","second","third","fourth",
                               "fifth","sixth","seventh","eighth",
                               "ninth","tenth","eleventh","twelfth"};

        // Variaveis: Lista de estrofes
        String lista [] = {"a partridge in a pear tree.",
                           "two turtle doves,",
                           "three french hens,",
                           "four calling birds,",
                           "five gold rings,",
                           "six geese a-laying,",
                           "seven swans a-swimming,",
                           "eight maids a-milking,",
                           "nine ladies waiting,",
                           "ten lords a-leaping,",
                           "eleven pipers piping,",
                           "twelve drummers drumming,"};

        // Apresentacao: Estrofe [1]
        System.out.println("\nOn the " + lista_num[0] + " day of Christmas, my love gave to me \n" + lista[0]);

        // Estrutura de repeticao
        for (int i = 1; i < lista.length ; i++) 
        {
            System.out.println("\nOn the " + lista_num[i] + " day of Christmas, my love gave to me ");

            // Estrutura de repeticao
            for (int j = i; j >= 0 ; j--)
            {
                // Estrutura de decisao
                if (j == 0)
                {
                    System.out.println("and " + lista[j]);
                }

                else
                {
                    System.out.print(lista[j] + "\n");                
                }
            }
        }
    }
}
