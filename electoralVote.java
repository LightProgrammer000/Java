package Tarefas_1;

import java.util.Scanner;

public class EX_08 
{
    public static void main(String[] args) 
    {
        // Apresentacao
        System.out.println("# Programa EX_08");
        
        try
        {
            // Variaveis
            int qtd_1 = 0;
            int qtd_2 = 0;
            int qtd_3 = 0;
            int qtd_4 = 0;
            int qtd_5 = 0;
            int qtd_6 = 0;

            // Controle
            int qtd_tot_vot = 0;

            // Estrutura de repeticao
            while(true) 
            {
                switch(menu())
                {
                    // Relatorio
                    case 0:
                        relatorio(qtd_1, qtd_2, qtd_3, qtd_4, qtd_5, qtd_6, qtd_tot_vot);
                        System.exit(0);
                        break;

                    // Candidato 1
                    case 1:
                        qtd_1 ++;
                        break;

                    // Candidato 2
                    case 2:
                        qtd_2 ++;
                        break;

                    // Candidato 3
                    case 3:
                        qtd_3 ++;
                        break;

                    // Candidato 4
                    case 4:
                        qtd_4 ++;
                        break;    

                    // Voto nulo
                    case 5:
                        qtd_5 ++;
                        break;

                    // Voto em branco
                    case 6:
                        qtd_6 ++;
                        break;

                    default:
                        break;
                }

                // Contagem de votos
                qtd_tot_vot ++;
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
        // Variavel
        int opc;

        // Instanciacao
        Scanner ent = new Scanner(System.in);

        // Apresentacao
        System.out.println("\n---------- Menu ----------");
        System.out.println("* [1] Candidato - 1 ");
        System.out.println("* [2] Candidato - 2 ");
        System.out.println("* [3] Candidato - 3 ");
        System.out.println("* [4] Candidato - 4 ");
        System.out.println("* [5] Voto nulo");
        System.out.println("* [6] Voto em branco");
        System.out.println("* [0] Finalizar conjunto de votos");
        System.out.println("---------------------------------");
        System.out.print("* Opc: ");
        opc = ent.nextInt();

        while ( !(opc >= 0 && opc <= 6) ) 
        {
            // Apresentacao
            System.out.println("\n Nenhum voto computado !!!");
            System.out.println("\n---------- Menu ----------");
            System.out.println("* [1] Candidato - 1 ");
            System.out.println("* [2] Candidato - 2 ");
            System.out.println("* [3] Candidato - 3 ");
            System.out.println("* [4] Candidato - 4 ");
            System.out.println("* [5] Voto nulo");
            System.out.println("* [6] Voto em branco");
            System.out.println("* [0] Finalizar conjunto de votos");
            System.out.println("---------------------------------");
            System.out.print("* Opc: ");
            opc = ent.nextInt();       
        }

        return opc;
    }

    // Metodo: Relatorio
    private static void relatorio(int qtd_1, int qtd_2, int qtd_3, int qtd_4, int qtd_5, int qtd_6, int qtd_tot_vot)
    {
        // Estrutura de decisao
        if (qtd_tot_vot > 0)
        {
            System.out.println("\n---------- RELATORIO ----------");
            System.out.println("# Votos (candidatos 1): " + qtd_1);
            System.out.println("# Votos (candidatos 2): " + qtd_2);
            System.out.println("# Votos (candidatos 3): " + qtd_3);
            System.out.println("# Votos (candidatos 4): " + qtd_4);
            System.out.println("# Votos nulos: " + qtd_5);
            System.out.println("# Votos em branco: " + qtd_6);  
            System.out.println("# Total de votos: " + qtd_tot_vot);
            System.out.println("# Total de votos validos: " + (qtd_tot_vot - (qtd_5 + qtd_6)));
            System.out.println("# Percentual de votos nulos: " + qtd_5 * 100 / qtd_tot_vot + "%");
            System.out.println("# Percentual de votos brancos: " + qtd_6 * 100 / qtd_tot_vot + "%");
            System.out.println("----------------------------------");
        }

        else
        {
            System.out.println("\n---------- RELATORIO ----------");
            System.out.println("# Total de votos: " + qtd_tot_vot);
            System.out.println("----------------------------------");
        }
    }
}
