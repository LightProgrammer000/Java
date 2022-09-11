package PDEITEL_009;

import javax.swing.JOptionPane;

public class Exemplo_Notas
{
    public static void main(String[] args)
    {
        String str;
        double n;
        int nr_alunos = 0, nr_notas = 0;;

        while (nr_alunos <= 0) 
        {
            str = JOptionPane.showInputDialog(null, "Numero de alunos").trim();
            
            if (str == null) 
            {
                System.exit(0);
            }
            
            nr_alunos = Integer.parseInt(str);
        }

        
        while (nr_notas <= 0) 
        {
            str = JOptionPane.showInputDialog(null, "Número de notas");
            
            if (str == null)
            {
                System.exit(0);
            }
            
            nr_notas = Integer.parseInt(str);
        }

        double[][] notas = new double[nr_alunos][nr_notas];

        for (int lin = 0; lin < notas.length; lin++) 
        {
            for (int col = 0; col < notas[lin].length; col++) 
            {
                notas[lin][col] = 1;
            }
        }

        str = "";
        for (int lin = 0; lin < notas.length; lin++) 
        {
            for (int col = 0; col < notas[lin].length; col++) 
            {
                while (true)
                {
                    str = JOptionPane.showInputDialog(null, "Aluno " + (lin + 1) + ": nota" + (col + 1));
                    
                    if (str == null)
                    {
                        break;
                    }
                    
                    n = Double.parseDouble(str);
                    if (n >= 0 && n <= 10) 
                    {
                        notas[lin][col] = n;
                        break;

                    }

                }

                if (str == null)
                {
                    break;
                }
            }

            if (str == null)
            {
                break;
            }
        }
        
        str = "Quadro de notas:";
        for (int lin = 0; lin < notas.length; lin++)
        {
            if (notas[lin][nr_notas - 1] == -1) 
            {
                break;
            }
            
            double soma = 0;
            
            str += "\nAluno" + (lin + 1) + ":    ";
            
            for (int col = 0; col < notas[lin].length; col++)
            {
                soma += notas[lin][col];
                str += notas[lin][col] + " ";
            }

            str += "  =   " + (soma / nr_notas);
        }
        
        JOptionPane.showMessageDialog(null, str);
    }
}
