package Tarefas_1;

// Biblioteca
import java.util.Scanner;

public class EX_03
{
    public static void main(String[] args)
    {
        System.out.println("# Programa EX_03");
        
        try 
        {
            // Variaveis
            char sexo;
            int idade;
            int temp_exp;

            // Controle
            int ctrl;
            int qtd_fem = 0;
            int qtd_hom = 0;
            int som_ida_hom = 0;
            int som_ida_fem = 0;

            // Instanciacao
            Scanner ent = new Scanner(System.in);

            do
            {
                // Entrada de dados
                System.out.print("\n# Sexo ([m] - masculino]) ([f] - feminino]): ");
                sexo = ent.next().charAt(0);

                System.out.print("# Idade: ");
                idade = ent.nextInt();

                while (idade < 16)
                {
                    System.out.print("# Idade (>= 16): ");
                    idade = ent.nextInt(); 
                }

                System.out.print("# Tempo de experiencia profissional (em anos): ");
                temp_exp = ent.nextInt();

                while (idade < temp_exp) 
                {
                    System.out.print("# Tempo de experiencia profissional (em anos): ");
                    temp_exp = ent.nextInt();
                }

                // Funcoes estatisticas
                qtd_fem = num_cand_fem(sexo, qtd_fem);
                som_ida_fem = med_ida_fem(sexo, idade, som_ida_fem, temp_exp);

                qtd_hom = num_cand_hom(sexo, qtd_hom);
                som_ida_hom = med_ida_hom(sexo, idade, som_ida_hom);

                System.out.print("\n# Deseja cadastrar outro candidato \n[1] sim \n[-1] nao \nOpc: ");
                ctrl = ent.nextInt();

            } while (ctrl > 0);

            // Chamada de metodo: Relatorio estatistico
            relatorio(qtd_fem, qtd_hom, som_ida_hom, som_ida_fem);
        }
        
        catch (Exception e) 
        {
            //System.err.println(e);            
        }
    }

    // Funcao: Numero de candidatos do sexo feminino
    private static int num_cand_fem(char sexo, int qtd_fem)
    {
        if (sexo == 'f' || sexo == 'F')
        {
            qtd_fem ++;
        }

        return qtd_fem;
    }
    
    // Funcao: Numero de candidatos do sexo masculino
    private static int num_cand_hom(char sexo, int qtd_hom)
    {
        if (sexo == 'm' || sexo == 'M')
        {
            qtd_hom ++;
        }
        
        return qtd_hom;
    }
    
    // Funcao: Media da idade dos homens
    private static int med_ida_hom(char sexo, int idade, int som_ida_hom)
    {
        if (sexo == 'm' || sexo == 'M')
        {
            som_ida_hom += idade;
        }
        
        return som_ida_hom;
    }
    
    // Funcao: Media da idade das mulheres
    private static int med_ida_fem(char sexo, int idade, int som_ida_fem, int temp_exp)
    {
        if ( (sexo == 'f' || sexo == 'F') && (temp_exp > 0) )
        {
            som_ida_fem += idade;
        }
        
        return som_ida_fem;
    }

    // Metodo: Relatorio
    private static void relatorio(int qtd_fem, int qtd_hom, int som_ida_hom, int som_ida_fem)
    {
        if (qtd_fem > 0 && qtd_hom > 0)
        {
            System.out.println("\n########## RELATORIO ##########");
            System.out.println("# Numero de candidatos do sexo feminino: " + qtd_fem);
            System.out.println("# Numero de candidatos do sexo masculino: " + qtd_hom);
            System.out.println("# Idade media dos homens: " + (som_ida_hom / qtd_hom));
            System.out.println("# Idade media das mulheres com experiencia: " + (som_ida_fem / qtd_fem));
            System.out.println("####################################################"); 
        }
        
        // Estrutura de decisao: Feminino
        else if (qtd_hom > 0 && qtd_fem == 0)
        {
            System.out.println("\n########## RELATORIO ##########");
            System.out.println("# Numero de candidatos do sexo masculino: " + qtd_hom);
            System.out.println("# Idade media dos homens: " + (som_ida_hom / qtd_hom));
            System.out.println("####################################################");  
        }
        
        // Estrutura de decisao: Masculino
        else if (qtd_fem > 0 && qtd_hom == 0)
        {
            System.out.println("\n########## RELATORIO ##########");
            System.out.println("# Numero de candidatos do sexo feminino: " + qtd_fem);
            System.out.println("# Idade media das mulheres com experiencia: " + (som_ida_fem / qtd_fem));
            System.out.println("####################################################"); 
        }
    }
}
