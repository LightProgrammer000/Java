package Modulo_A;
import java.io.IOException;

public class EX_07
{
	// Metodo: Limpar console
	static void limpaConsole() throws IOException, InterruptedException
	{
		// Limpa a tela: Windows, Linux e MacOS
		if (System.getProperty("os.name").contains("Windows"))
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

        else
		{
			Runtime.getRuntime().exec("clear");
		}
	}

	// Metodo principal
    public static void main(String[] args) throws IOException, InterruptedException
    {
		limpaConsole();
		
		// Variaveis
        int opc;

        // Menu
        System.out.println("# Menu");
        System.out.println("- 1. O primeiro numero elevado ao segundo numero");
        System.out.println("- 2. Raiz quadrada de cada um dos numeros");
        System.out.println("- 3. Raiz cubica de cada um dos numeros");
        System.out.print("* Opc: ");
        opc = Integer.parseInt(System.console().readLine());

        // Chamada de metodo
        escolha(opc);
    }
    
    // Estrutura em escolha
    static void escolha(int a)
    {
        switch (a)
        {
            case 1:
                num_elev();
                break;

            case 2:
                rai_qua();
                break;

            case 3:
                rai_cub();
                break;

            default:
                System.out.println("# Terminando a execucao do programa");
                System.exit(0);
                break;
        }
    }

    // Metodo [1]
    static void num_elev()
    {
        // Variaveis
        double a, b;

        // Entrada de dados
        System.out.print("\n# N[1]: ");
        a = Double.parseDouble(System.console().readLine());

        System.out.print("# N[2]: ");
        b = Double.parseDouble(System.console().readLine());

        // Saida de dados
        System.out.printf("- [%.2f] ^ [%.2f]: %.2f \n",a ,b, Math.pow(a, b));
    }

    // Metodo [2]
    static void rai_qua()
    {
        // Variaveis
        double n1, n2;
        
        // Entrada de dados
        System.out.print("\n# N[1]: ");
        n1 = Double.parseDouble(System.console().readLine());
        
        System.out.print("# N[2]: ");
        n2 = Double.parseDouble(System.console().readLine());
        
        // Saida de dados
        System.out.printf("- Raiz quadrada [%.2f]: %.2f \n", n1, Math.sqrt(n1));
        System.out.printf("- Raiz quadrada [%.2f]: %.2f \n", n2, Math.sqrt(n2));
    }
    
    // Metodo [3]
    static void rai_cub()
    {
        // Variaveis
        double n1, n2;

        // Entrada de dados
        System.out.print("\n# N[1]: ");
        n1 = Double.parseDouble(System.console().readLine());
        
        System.out.print("# N[2]: ");
        n2 = Double.parseDouble(System.console().readLine());
        
        // Saida de dados
        System.out.printf("- Raiz cubica [%.2f]: %.2f \n", n1, Math.cbrt(n1));
        System.out.printf("- Raiz cubica [%.2f]: %.2f \n", n2, Math.cbrt(n2));
    }
}
