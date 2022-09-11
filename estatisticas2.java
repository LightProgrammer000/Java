package Tarefas_1;

// Bibliotecas
import java.util.Scanner;
import java.text.DecimalFormat;

public class EX_06 
{
    public static void main(String[] args) 
    {
        // Apresentacao
        System.out.println("# Programa EX_06");

        try
        {
            // Variaveis
            double not_fin = 0;
            int qtd_aluno = 5;

            // Controle: Notas
            double soma_nota_E = 0;
            int qtd_conc_E = 0;

            double soma_nota_D = 0;
            int qtd_conc_D = 0;

            double soma_nota_C = 0;
            int qtd_conc_C = 0;

            double soma_nota_B = 0;
            int qtd_conc_B = 0;

            double soma_nota_A = 0;
            int qtd_conc_A = 0;

            // Instanciacao
            Scanner ent = new Scanner(System.in);

            // Estrutura de repeticao: Notas
            for (int i = 1; i <= qtd_aluno; i ++) 
            {
                System.out.printf("\n# Aluno [%d] \n# Nota final: ", i);
                not_fin = ent.nextDouble();

                // Conceito E
                if (not_fin >= 0.0 && not_fin <= 2.9)
                {
                    qtd_conc_E++;
                    soma_nota_E = soma_nota(not_fin, soma_nota_E);
                }

                // Conceito D
                else if (not_fin >= 3.0 && not_fin <= 4.9)
                {
                    qtd_conc_D++;
                    soma_nota_D = soma_nota(not_fin, soma_nota_D);
                }

                // Conceito C
                else if (not_fin >= 5.0 && not_fin <= 6.9)
                {
                    qtd_conc_C++;
                    soma_nota_C = soma_nota(not_fin, soma_nota_C);
                }

                // Conceito B
                else if (not_fin >= 7.0 && not_fin <= 8.9)
                {
                    qtd_conc_B++;
                    soma_nota_B = soma_nota(not_fin, soma_nota_B);
                }

                // Conceito A
                else if (not_fin >= 9.0 && not_fin <= 10.0)
                {
                    qtd_conc_A++;
                    soma_nota_A = soma_nota(not_fin, soma_nota_A);
                }
            }

            // Impressao de relatorio
            relatorio(not_fin, qtd_conc_E, qtd_conc_D, qtd_conc_C, qtd_conc_B, qtd_conc_A, soma_nota_E, soma_nota_D, soma_nota_C, soma_nota_B, soma_nota_A);
        } 

        catch (Exception e) 
        {
            //System.err.println(e);
        }
    }

    // Funcao: Somatorio de nota
    private static double soma_nota(double not_fin, double soma_nota)
    {
        soma_nota += not_fin;

        return soma_nota;
    }

    // Metodo: Relatorio
    private static void relatorio(double not_fin, int qtd_conc_E, int qtd_conc_D, int qtd_conc_C, int qtd_conc_B, int qtd_conc_A, double soma_nota_E, double soma_nota_D, double soma_nota_C, double soma_nota_B, double soma_nota_A)
    {
        // Calculos
        double media_E = soma_nota_E / qtd_conc_E;
        double media_D = soma_nota_D / qtd_conc_D;
        double media_C = soma_nota_C / qtd_conc_C;
        double media_B = soma_nota_B / qtd_conc_B;
        double media_A = soma_nota_A / qtd_conc_A;

        // Instanciacao
        DecimalFormat fmt = new DecimalFormat("0.00"); //limita o número de casas decimais 

        // Apresentacao
        System.out.println("\n##### RELATORIO #####");

        // Estrutura de decisao
        if (media_E > 0)
        {
            System.out.println("\n* Conceito E");
            System.out.println("# Media das notas: " + fmt.format(media_E));
            System.out.println("# Quantidade de alunos: " + qtd_conc_E);
        }

        if (media_D > 0)
        {
            System.out.println("\n* Conceito D");
            System.out.println("# Media das notas: " + fmt.format(media_D));
            System.out.println("# Quantidade de alunos: " + qtd_conc_D);      
        }

        if (media_C > 0)
        {
            System.out.println("\n* Conceito C");
            System.out.println("# Media das notas: " + fmt.format(media_C));
            System.out.println("# Quantidade de alunos: " + qtd_conc_C);
        }

        if (media_B > 0)
        {
            System.out.println("\n* Conceito B");
            System.out.println("# Media das notas: " + fmt.format(media_B));
            System.out.println("# Quantidade de alunos: " + qtd_conc_B);
        }

        if (media_A > 0)
        {
            System.out.println("\n* Conceito A");
            System.out.println("# Media das notas: " + fmt.format(media_A));
            System.out.println("# Quantidade de alunos: " + qtd_conc_A);
        }

        System.out.println("##############################################");
    }
}
