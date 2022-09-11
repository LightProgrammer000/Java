package Tarefas_1;

// Bibliotecas
import java.util.Scanner;
import java.text.DecimalFormat;

public class EX_07
{
    public static void main(String[] args) 
    {
        // Apresentacao
        System.out.println("# Programa EX_07");

        try
        {
            // Estrutura em escolha
            switch (menu())
            {
                case 1:

                    // Chamada de metodo
                    relatorio_arit(media_aritmetica());
                    break;

                case 2:

                    // Chamada de metodo
                    relatorio_pond(media_ponderada());
                    break;

                case 3:

                    // Saida do programa
                    System.exit(0);
                    break;

                default:
                    erro();
                    break;
            }
        }

        catch (Exception e) 
        {
            //System.err.println(e);            
        }
    }
    
    // Funcao: Menu
    private static int menu()
    {
        // Instanciacao
        Scanner ent = new Scanner(System.in);
        
        // Apresentacao
        System.out.println("---------------------------------");        
        System.out.println("# Menu");
        System.out.println("1. Media Aritmetica");
        System.out.println("2. Media Ponderada");
        System.out.println("3. Sair");
        System.out.println("---------------------------------");        
        System.out.print("* Opc: ");
        
        return ent.nextInt();
    }

    // Funcao: Media artimetica de 2 notas
    private static String media_aritmetica()
    {
        // Variaveis locais
        int i;
        double nota;
        double media_arit;
        
        // Controle
        double soma_arit = 0;

        // Instanciacao
        Scanner ent = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.00"); //limita o número de casas decimais 
        
        // Estrutura de repeticao: Notas
        System.out.println("");
        for( i= 1; i <= 2; i++ ) 
        {
            // Entrada de dados
            System.out.printf("# Nota [%d]: ", i);
            nota = ent.nextDouble();
            
            // Somatorio
            soma_arit += nota;
        }
        
        // Media Aritmetica
        media_arit = soma_arit / (i - 1);
                
        return fmt.format(media_arit);
    }
    
    // Funcao: Media ponderada de 3 notas
    private static String media_ponderada()
    {
        // Variaveis locais
        int i;
        double nota;
        double peso;
        double media_pond;
        
        // Controle
        double soma_nota = 0;
        double soma_peso = 0;
        
        // Instanciacao
        Scanner ent = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.00"); //limita o número de casas decimais 
        
        // Estrutura de repeticao: Notas
        System.out.println("");
        for( i = 1; i <= 3; i++ ) 
        {
            // Entrada de dados
            System.out.printf("# Nota [%d]: ", i);
            nota = ent.nextDouble();
            
            System.out.printf("# Peso [%d]: ", i);
            peso = ent.nextDouble();
            System.out.println("");
                      
            // Somatorio
            soma_nota += nota * peso;
            soma_peso += peso;
        }
        
        // Media Aritmetica
        media_pond = soma_nota / soma_peso;
        
        return fmt.format(media_pond);
    }
    
    // Metodo: Relatorio da media aritmetica
    private static void relatorio_arit(String media_arit)
    {
        System.out.println("\n---------- RELATORIO ----------");
        System.out.println("# Media aritmetica: " + media_arit);
        System.out.println("-------------------------------");
    }
    
    // Metodo: Relatorio da media ponderada
    private static void relatorio_pond(String media_pond)
    {
        System.out.println("\n---------- RELATORIO ----------");
        System.out.println("# Media ponderada: " + media_pond);
        System.out.println("-------------------------------");
    }

    // Metodo: Apresentacao de erro
    private static void erro() 
    {
        System.out.println("\n-----------------");
        System.out.println("# Opcao Invalida");
        System.out.println("-----------------");    
    }
}
