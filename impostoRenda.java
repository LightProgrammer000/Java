package Tarefas_1;

// Bibliotecas
import java.text.DecimalFormat;
import java.util.Scanner;

public class EX_04 
{
    public static void main(String[] args) 
    {
        System.out.println("# Programa EX_04");

        try
        {
            // Variaveis
            double salario;
            double sal_liq;
            double soma_sal = 0;
            double tot_imposto = 0;

            // Instanciacao
            Scanner ent = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("R$ ,##0.00");

            // Estrutura de repeticao
            for( int i = 1; i <= 58; i++)
            {
                // Entrada de dados
                System.out.printf("\n# Digite salario [%d]: ", i);
                salario = ent.nextDouble();

                while (salario < 0) 
                {
                    System.out.printf("\n# Digite salario [%d]: ", i);
                    salario = ent.nextDouble();                                        
                }

                // Imposto de renda
                tot_imposto = imp_renda(salario, tot_imposto);

                // Folha de pagamento
                soma_sal = val_tot_pag(soma_sal, salario);

                // Salario liquido (Desconto no INSS)
                sal_liq = desc_inss(salario);
                System.out.print("Salario liquido do funcionario [" + i + "]: " + df.format(sal_liq) + "\n");
            }

            // Apresentacao
            System.out.println("\n# Valor total do imposto de renda: " + df.format(tot_imposto));
            System.out.println("# Valor total da folha de pagamento: " + df.format(soma_sal));
        }

        catch(Exception e)
        {
            //System.err.println(e);
        }
    }

    // Funcao: Imposto de renda
    private static double imp_renda(double salario, double tot_imposto)
    {
        double imp_ren = 0;
        
        if (salario <= 1903.98)
        {
            imp_ren = salario * (0/100);
        }
        
        else if (salario <= 2826.65)
        {
            imp_ren = salario * (7.5/100);
        }

        else if ( salario <= 3751.05)
        {
            imp_ren = salario * (15.0/100);
        }
        
        else if (salario <= 4664.68)
        {
            imp_ren = salario * (22.5/100);
        }

        if (salario > 4664.68)
        {
            imp_ren = salario * (27.5/100);
        }
        
        tot_imposto += imp_ren;
        
        return tot_imposto;
    }

    // Funcao: Valor da folha de pagamento
    private static double val_tot_pag(double soma_sal, double salario)
    {
        soma_sal += salario;
        
        return soma_sal;
    }

    // Funcao: Salario bruto descontando o inss
    private static double desc_inss(double salario)
    {
        double plano_saude;
        double desc = 0;
        double novo_sal;
        
        if (salario <= 1693.72)
        {
            desc = salario * (8/100);
        }
        
        else if (salario <= 2822.90)
        {
            desc = salario * (9/100);
        }
        
        else if (salario > 2822.90)
        {
            desc = salario * (11/100);
        }

        plano_saude = salario * (4.5/100);
        novo_sal = salario - (desc + plano_saude);
        
        return novo_sal;
    }
}
