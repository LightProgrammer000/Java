// Pacote
package Tarefas_1;

// Bibliotecas
import java.util.Scanner;

public class EX_11 
{
    // Instanciacao
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println("# Programa EX_11");

        try
        {
            // Apresentacao
            System.out.println("\n----- Genio da lampada -----\n");
            System.out.println("+ Vou adivinhar o animal que o senhor(a) escolheu dentre os abaixo\n");

            // Programa
            exec_program();
        }

        catch(Exception e)
        {
            System.err.println(e);
        }
    }

    // Metodo: Execucao do programa principal
    private static void exec_program()
    {
        // Variavel
        String animal;
        String[] lista = {"leao", "cavalo", "homem", "macaco", "morcego", 
                          "baleia", "avestruz", "pinguim", "pato", "aguia", 
                          "tartaruga", "crocodilo", "cobra"};

        // Aprensentacao das opcoes
        System.out.println("# Animais possiveis: ");
        for (int i = 0; i < lista.length; i++) 
        {
            System.out.printf("[%d]. %s\n",(i + 1), lista[i]);          
        }

        while(true)
        {
            // Chamada de funcao
            animal = questionario();

            // Estrutura de decisao
            if (!animal.equals("nenhum"))
            {
                System.out.println("\n---------------- Resultado ----------------");
                System.out.println("\n# Entao o animal escolhido foi o " + animal);
                System.out.println("\n-------------------------------------------");
                System.exit(0);
            }

            else
            {
                System.out.println("\n---------------- Resultado ----------------");
                System.out.println("\n# Nao consegui adivinhar");
                System.out.println("\n-------------------------------------------");
            }
        }
    }

    // Funcao: Escolha dentre os tipos de animais
    private static String questionario()
    {
        // Variavel
        String opc = null;

        // Estrutura em escolha
        switch (animais()) 
        {
            case "mamiferos":

                // Mamifero
                opc = mamiferos();
                break;

            case "aves":

                // Aves
                opc = aves();
                break;

            case "repteis":

                // Repteis
                opc = repteis();
                break;

            case "nenhum":
                opc = "nenhum";

            default:
                break;
        }

        return opc;
    }

    // Funcao: Analise de animais
    private static String animais()
    {
        // Variavel
        String opc;

        // Entrada de dados
        System.out.print("\n* Mamifero \n[s] Sim \n[n] Nao \nOpc: ");
        opc = ent.next().toLowerCase();

        // Estrutura de decisao: Mamiferos
        if (opc.equals("s"))
        {
            opc = "mamiferos"; 
        }

        else
        {
            System.out.print("\n* Aves \n[s] Sim \n[n] Nao \nOpc: ");
            opc = ent.next().toLowerCase();

            // Estrutura de decisao: Aves
            if (opc.equals("s"))
            {
                opc = "aves";                
            }

            else
            {
                System.out.print("\n* Repteis \n[s] Sim \n[n] Nao \nOpc: ");
                opc = ent.next().toLowerCase();

                // Estrutura de decisao: Repteis
                if (opc.equals("s"))
                {
                    opc = "repteis";                
                }

                else
                {
                    opc = "nenhum";
                }
            }
        }

        return opc;
    }

    // Funcao: Analise dos mamiferos
    private static String mamiferos()
    {
        // Variavel
        String opc;

        // Entrada de dados
        System.out.print("\n* Quadrupede \n[s] Sim \n[n] Nao \nOpc: ");
        opc = ent.next().toLowerCase();

        // Estrutura de decisao: Quadrupede
        if(opc.equals("s"))
        {
            System.out.print("\n* Carnivoro \n[s] Sim \n[n] Nao \nOpc: ");
            opc = ent.next().toLowerCase();

            // Estrutura em escolha
            switch (opc)
            {
                // Escolha: Resultado -> leao
                case "s":

                    opc = "leao";
                    break;

                // Escolha: Herbivoro
                case "n":

                    System.out.print("\n* Herbivoro \n[s] Sim \n[n] Nao \nOpc: ");
                    opc = ent.next().toLowerCase();

                    // Estrutura de decisao: Resultado -> cavalo
                    if (opc.equals("s"))
                    {
                        opc = "cavalo";
                    }

                    else
                    {
                        opc = "nenhum";
                    }

                    break;

                default:
                    break;
            }
        }

        else
        {
            System.out.print("\n* Bipedes \n[s] Sim \n[n] Nao \nOpc: ");
            opc = ent.next().toLowerCase();

            // Estrutura de decisao: Bipedes
            if (opc.equals("s"))
            {
                System.out.print("\n* Onivoros \n[s] Sim \n[n] Nao \nOpc: ");
                opc = ent.next().toLowerCase();

                // Estrutura em escolha
                switch (opc)
                {
                    // Escolha: Resultado -> homem
                    case "s":

                        opc = "homem";
                        break;

                    // Escolha: Frutivoros
                    case "n":

                        System.out.print("\n* Frutivoros \n[s] Sim \n[n] Nao \nOpc: ");
                        opc = ent.next().toLowerCase();

                        // Estrutura de decisao: Resultado -> Macaco
                        if (opc.equals("s"))
                        {
                            opc = "Macaco";
                        }

                        else
                        {
                            opc = "nenhum";
                        }

                        break;

                    default:
                        break;
                }
            }

            // Estrutura de decisao: Voadores
            else
            {
                System.out.print("\n* Voadores \n[s] Sim \n[n] Nao \nOpc: ");
                opc = ent.next().toLowerCase();

                // Estrutura em escolha
                switch (opc)
                {
                    // Escolha: Resultado -> Morcego
                    case "s":

                        opc = "morcego";
                        break;

                    // Escolha: Aquaticos
                    case "n":

                        System.out.print("\n* Aquaticos \n[s] Sim \n[n] Nao \nOpc: ");
                        opc = ent.next().toLowerCase();

                        if (opc.equals("s"))
                        {
                            opc = "baleia";
                        }

                        else
                        {
                            opc = "nenhum";
                        }

                        break;

                    default:
                        break;
                }
            }
        }

        return opc;
    }
    
    private static String aves()
    {
        // Variavel
        String opc;

        // Entrada de dados
        System.out.print("\n* Nao-voadoras \n[s] Sim \n[n] Nao \nOpc: ");
        opc = ent.next().toLowerCase();
       
        // Estrutura de decisao: Nao-voadoras
        if(opc.equals("s"))
        {
            System.out.print("\n* Tropicais \n[s] Sim \n[n] Nao \nOpc: ");
            opc = ent.next().toLowerCase();

            // Estrutura em escolha
            switch (opc)
            {
                // Escolha: Resultado -> Avestruz
                case "s":

                    opc = "avestruz";
                    break;

                // Escolha: Polares
                case "n":

                    System.out.print("\n* Polares \n[s] Sim \n[n] Nao \nOpc: ");
                    opc = ent.next().toLowerCase();

                    // Estrutura de decisao: Polares
                    if (opc.equals("s"))
                    {
                        opc = "pinguim";
                    }

                    else
                    {
                        opc = "nenhum";
                    }
 
                    break;

                default:
                    break;
            }
        }

        else
        {
            System.out.print("\n* Nadadoras \n[s] Sim \n[n] Nao \nOpc: ");
            opc = ent.next().toLowerCase();

            // Estrutura de decisao: Nadadoras
            if (opc.equals("s"))
            {
                opc = "pato";   
            }

            else
            {
                System.out.print("\n* De rapina \n[s] Sim \n[n] Nao \nOpc: ");
                opc = ent.next().toLowerCase();

                // Estrutura de decisao: De rapina
                if (opc.equals("s"))
                {
                    opc = "aguia";                    
                }

                else
                {
                    opc = "nenhum";
                }
            }
        }

        return opc;
    }
    
    private static String repteis()
    {
        // Variavel
        String opc;

        // Entrada de dados
        System.out.print("\n* Com casco \n[s] Sim \n[n] Nao \nOpc: ");
        opc = ent.next().toLowerCase();

        // Estrutura de decisao: Com casco
        if(opc.equals("s"))
        {
            opc = "tartaruga";
        }

        else
        {
            System.out.print("\n* Carnivoros \n[s] Sim \n[n] Nao \nOpc: ");
            opc = ent.next().toLowerCase();
            
            // Estrutura de decisao: Carnivoros
            if (opc.equals("s"))
            {
                opc = "crocodilo";   
            }

            else
            {
                System.out.print("\n* Sem patas \n[s] Sim \n[n] Nao \nOpc: ");
                opc = ent.next().toLowerCase();

                // Estrutura de decisao: Sem patas
                if (opc.equals("s"))
                {
                    opc = "cobra";                    
                }

                else
                {
                    opc = "nenhum";
                }
            }
        }

        return opc;
    }
}
