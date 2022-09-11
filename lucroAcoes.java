package Tarefas_1;

// Bibliotecas
import java.util.Scanner;

public class EX_02 
{
    public static void main(String[] args)
    {
        System.out.println("# Programa EX_02");

        try
        {
            // Variaveis
            String letra;
            double prec_comp;
            double prec_vend;

            // Controle
            int qtd_inf = 0;
            int qtd_sup = 0;

            // Instanciacao
            Scanner ent = new Scanner(System.in);

            // Estrutura de repeticao
            while (true)
            {
                System.out.print("\n- Tipo de acao (quaisquer letras, exceto 'f' ou 'F'): ");
                letra = ent.next();

                // Estrutura de decisao
                if ("f".equals(letra) || "F".equals(letra))
                {
                    break;
                }

                else
                {
                    System.out.print("- Preco de compra: "); 
                    prec_comp = ent.nextDouble();

                    System.out.print("- Preco de venda: "); 
                    prec_vend = ent.nextDouble();

                    if (analise_lucro(prec_comp, prec_vend) < 200)
                    {
                        qtd_inf = qtd_acoes_lucro_inf(qtd_inf);
                    }

                    else if (analise_lucro(prec_comp, prec_vend) > 1000)
                    {
                        qtd_sup = qtd_acoes_lucro_sup(qtd_sup);
                    }
                }
            }

            // Metodo: Impressao de relatorio
            imp(qtd_inf, qtd_sup);
        }

        catch (Exception e)
        {
            //System.out.println(e);
        }
    }
    
    private static double analise_lucro(double prec_comp, double prec_vend)
    {
        return prec_vend - prec_comp;
    }
    
    private static int qtd_acoes_lucro_inf(int qtd_inf)
    {
        return ++qtd_inf;
    }
    
    private static int qtd_acoes_lucro_sup(int qtd_sup)
    {
        return ++qtd_sup;        
    }
    
    private static void imp(int qtd_inf, int qtd_sup)
    {
        System.out.println("\n### RELATORIO ###");
        System.out.println("# Acoes abaixo de R$ 200: " + qtd_inf);
        System.out.println("# Acoes acima de R$ 1500: " + qtd_sup);
        System.out.println("############################");
    }   
}
