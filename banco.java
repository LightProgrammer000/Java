package Tarefas_1;

// Bibliotecas
import java.util.Scanner;
import java.text.DecimalFormat;

public class EX_13 
{
    public static void main(String[] args) 
    {
        try
        {
            exec_program();            
        }

        catch (Exception e) 
        {
            System.out.println(e);
        }
    }

    // Metodo: Execucao do programa principal
    private static void exec_program() 
    {
        // Variaveis: Saque
        int saque;
        int saque_original;
        
        // Variaveis: Quantidade de notas
        int qtd_nota_1 = 100;
        int qtd_nota_5 = 100;
        int qtd_nota_10 = 100;
        int qtd_nota_50 = 0;
        
        // Variaveis: Controle do caixa eletronico
        int limite_saque = 0;
        int somatorio_saque = 0;
        int somatorio_caixa = qtd_nota_1 * 1 + qtd_nota_5 * 5 + qtd_nota_10 * 10 + qtd_nota_50 * 50;

        while (true)
        {
            saque = analise_saque();
            saque_original = saque;
            
            if (saque == 0)
            {
                continue;
            }

            if (saque > somatorio_caixa)
            {
                saque_insuficiente();
            }
            
            else if (saque < 0)
            {
                finalizando_operacao();
                break;
            }
            
            else if (qtd_nota_50 == 0 && qtd_nota_10 == 0 && qtd_nota_5 == 0 && qtd_nota_1 == 0)
            {
                caixa_sem_notas();
                break;
            }

            else
            {
                // Limites de saques
                limite_saque = limite_quantidade_saque(limite_saque);
                
                // Estrutura de repeticao: Calculo das notas
                while (saque > 0)
                {
                    if (saque % 50 == 0 && qtd_nota_50 > 0)
                    {
                        saque -= 50;
                        qtd_nota_50--;
                    }

                    else if (saque % 10 == 0 && qtd_nota_10 > 0)
                    {
                        saque -= 10;
                        qtd_nota_10--;
                    }

                    else if (saque % 5 == 0 && qtd_nota_5 > 0)
                    {
                        saque -= 5;
                        qtd_nota_5--;
                    }

                    else if (saque % 1 == 0 && qtd_nota_1 > 0)
                    {
                        saque -= 1;
                        qtd_nota_1--;
                    }
                }
                
                // Controle do valor dentro do caixa eletronico
                somatorio_caixa = somatorio_caixa(somatorio_caixa, saque_original);
                
                // Somatorio de saques
                somatorio_saque = somatorio_saque(somatorio_saque, saque_original);
                
                // Recibo do caixa
                recibo(somatorio_caixa, saque_original, somatorio_saque, limite_saque, qtd_nota_1, qtd_nota_5, qtd_nota_10, qtd_nota_50);

                // Estrutura de decisao: Limite de saques
                if ( limite_saque == 5 )
                {
                    break;
                }
            }
        }
    }   

    // Funcao: Analise de saque
    private static int analise_saque()
    {
        // Variaveis
        int saque;

        // Instanciacao
        Scanner ent = new Scanner(System.in);

        // Entrada de dados
        System.out.println("\n########## SAQUE ##########");        
        System.out.print("# Saque ['-1' cancelar saque]: ");
        saque = ent.nextInt();
        
        // Estrutura de repeticao: Saques acima de R$ 1000,00
        while (saque > 1000)
        {
            // Mensagem: Erro
            System.out.println("# Somente valores abaixo de R$ 1000,00 a cada saque");

            // Entrada de dados
            System.out.println("\n########## SAQUE ##########");
            System.out.print("# Saque ['-1' cancelar saque]: ");
            saque = ent.nextInt();
        }

        return saque;
    }

    // Metodo: Recibo do caixa eletronico
    private static void recibo(int somatorio_caixa, int saque_original, int somatorio_saque, int limite_saque, int qtd_nota_1, int qtd_nota_5, int qtd_nota_10, int qtd_nota_50)
    {
        // Instanciacao
        DecimalFormat fmt = new DecimalFormat("R$ ###,###,###,##0.00");
        
        if (qtd_nota_1 == 0)
        {
            // Relatorio
            System.out.printf("\n-------------------- RECIBO [%d] --------------------\n", limite_saque);
            System.out.print("# Saque: " + fmt.format(saque_original) + "\n");
            System.out.print("# Somatorio de saque: " + fmt.format(somatorio_saque) + "\n");
            System.out.print("# Valor do caixa: " + fmt.format(somatorio_caixa) + "\n");
            System.out.print("# Quantidade de saques: " + limite_saque + "\n");
            //System.out.print("# Notas de 1 disponiveis: " + qtd_nota_1 + "\n");
            System.out.print("# Notas de 5 disponiveis: " + qtd_nota_5 + "\n");
            System.out.print("# Notas de 10 disponiveis: " + qtd_nota_10 + "\n");
            System.out.print("# Notas de 50 disponiveis: " + qtd_nota_50 + "\n");
            System.out.println("------------------------------------------------");              
        }
        
        else if (qtd_nota_5 == 0)
        {
            // Relatorio
            System.out.printf("\n-------------------- RECIBO [%d] --------------------\n", limite_saque);
            System.out.print("# Saque: " + fmt.format(saque_original) + "\n");
            System.out.print("# Somatorio de saque: " + fmt.format(somatorio_saque) + "\n");
            System.out.print("# Valor do caixa: " + fmt.format(somatorio_caixa) + "\n");
            System.out.print("# Quantidade de saques: " + limite_saque + "\n");
            System.out.print("# Notas de 1 disponiveis: " + qtd_nota_1 + "\n");
            //System.out.print("# Notas de 5 disponiveis: " + qtd_nota_5 + "\n");
            System.out.print("# Notas de 10 disponiveis: " + qtd_nota_10 + "\n");
            System.out.print("# Notas de 50 disponiveis: " + qtd_nota_50 + "\n");
            System.out.println("------------------------------------------------");              
        }
        
        else if (qtd_nota_10 == 0)
        {
            // Relatorio
            System.out.printf("\n-------------------- RECIBO [%d] --------------------\n", limite_saque);
            System.out.print("# Saque: " + fmt.format(saque_original) + "\n");
            System.out.print("# Somatorio de saque: " + fmt.format(somatorio_saque) + "\n");
            System.out.print("# Valor do caixa: " + fmt.format(somatorio_caixa) + "\n");
            System.out.print("# Quantidade de saques: " + limite_saque + "\n");
            System.out.print("# Notas de 1 disponiveis: " + qtd_nota_1 + "\n");
            System.out.print("# Notas de 5 disponiveis: " + qtd_nota_5 + "\n");
            //System.out.print("# Notas de 10 disponiveis: " + qtd_nota_10 + "\n");
            System.out.print("# Notas de 50 disponiveis: " + qtd_nota_50 + "\n");
            System.out.println("------------------------------------------------");              
        }
        
        else if (qtd_nota_50 == 0)
        {
            // Relatorio
            System.out.printf("\n-------------------- RECIBO [%d] --------------------\n", limite_saque);
            System.out.print("# Saque: " + fmt.format(saque_original) + "\n");
            System.out.print("# Somatorio de saque: " + fmt.format(somatorio_saque) + "\n");
            System.out.print("# Valor do caixa: " + fmt.format(somatorio_caixa) + "\n");
            System.out.print("# Quantidade de saques: " + limite_saque + "\n");
            System.out.print("# Notas de 1 disponiveis: " + qtd_nota_1 + "\n");
            System.out.print("# Notas de 5 disponiveis: " + qtd_nota_5 + "\n");
            System.out.print("# Notas de 10 disponiveis: " + qtd_nota_10 + "\n");
            //System.out.print("# Notas de 50 disponiveis: " + qtd_nota_50 + "\n");
            System.out.println("------------------------------------------------");              
        }

        else
        {
            // Relatorio
            System.out.printf("\n-------------------- RECIBO [%d] --------------------\n", limite_saque);
            System.out.print("# Saque: " + fmt.format(saque_original) + "\n");
            System.out.print("# Somatorio de saque: " + fmt.format(somatorio_saque) + "\n");
            System.out.print("# Valor do caixa: " + fmt.format(somatorio_caixa) + "\n");
            System.out.print("# Quantidade de saques: " + limite_saque + "\n");
            System.out.print("# Notas de 1 disponiveis: " + qtd_nota_1 + "\n");
            System.out.print("# Notas de 5 disponiveis: " + qtd_nota_5 + "\n");
            System.out.print("# Notas de 10 disponiveis: " + qtd_nota_10 + "\n");
            System.out.print("# Notas de 50 disponiveis: " + qtd_nota_50 + "\n");
            System.out.println("------------------------------------------------");  
        }
    }

    ///////////////////////////////// CONTROLE /////////////////////////////////

    private static int limite_quantidade_saque(int limite_saque) 
    {
        return ++limite_saque;
    }

    private static int somatorio_saque(int somatorio_saque, int saque_original) 
    {
        somatorio_saque += saque_original;

        return somatorio_saque;
    }

    private static int somatorio_caixa(int somatorio_caixa, int saque_original) 
    {
        somatorio_caixa -= saque_original;
        
        return somatorio_caixa;
    }

    ////////////////////////////////// ERROS ///////////////////////////////////

    private static void finalizando_operacao() 
    {
        System.out.println("\n--------------------------------");
        System.out.println("# Finalizando operacao no caixa");
        System.out.println("--------------------------------");
    }
    
    private static void saque_insuficiente() 
    {
        System.out.println("\n-----------------------------");
        System.out.println("# Saque insuficiente no caixa");
        System.out.println("-----------------------------");
    }

    private static void caixa_sem_notas() 
    {
        System.out.println("\n-----------------------------");
        System.out.println("# Caixa sem notas suficientes");
        System.out.println("-----------------------------");
    }
}
