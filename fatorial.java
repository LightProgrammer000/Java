package Aula_16;

import java.awt.Color;

public class A extends javax.swing.JFrame 
{
    public A()
    {
        initComponents();
        config();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pan = new javax.swing.JPanel();
        sld = new javax.swing.JSlider();
        lblNum = new javax.swing.JLabel();
        lblFat = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fatorial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 24), new java.awt.Color(0, 51, 0))); // NOI18N

        sld.setMaximum(12);
        sld.setValue(0);
        sld.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldStateChanged(evt);
            }
        });

        lblNum.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblNum.setForeground(new java.awt.Color(102, 204, 0));
        lblNum.setText("0");

        lblFat.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblFat.setForeground(new java.awt.Color(0, 0, 204));
        lblFat.setText("Linha");

        lblRes.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblRes.setForeground(new java.awt.Color(255, 0, 0));
        lblRes.setText("Resultado");

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRes, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(lblFat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panLayout.createSequentialGroup()
                        .addComponent(sld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(lblNum))))
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNum))
                .addGap(28, 28, 28)
                .addComponent(lblFat)
                .addGap(18, 18, 18)
                .addComponent(lblRes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    // Método: Mudança em tempo real
    private void sldStateChanged(javax.swing.event.ChangeEvent evt) {                                 

        // Variáveis locais
        int valor = sld.getValue();

        // Lable
        lblNum.setText(Integer.toString(valor));
        lblRes.setText(String.format("<html> <p> Fatorial: %d </html>", fatorial(valor)));
        lblFat.setText(String.format("<html> <p> Linha: %s </html>", linha(valor)));
    }                                

    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }

        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new A().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel lblFat;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblRes;
    private javax.swing.JPanel pan;
    private javax.swing.JSlider sld;
    // End of variables declaration                   

    // Método: Configurações
    private void config()
    {
        // Frame
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        
        // Painel
        pan.setBackground(Color.WHITE);
        
        // Lable
        lblNum.setText("0");
        lblFat.setText("Valor");
        lblRes.setText("Resultado");   
    }
    
    // Método: Cálculo do fatorial
    private int fatorial(int valor) 
    {
        // Variáveis
        int fat = 1;
        String aux = " ";
        
        // Estrutura de repetição
        for (int i = 1; i <= valor; i++) 
        {
            fat *= i;
        }

        return fat;
    }

    // Método: Cálculo do fatorial em linha
    private String linha(int valor) 
    {
        // Variáveis
        int fat = 1;
        String aux = " ";

        // Estrutura de repetição
        for (int i = 1; i <= valor; i++) 
        {
            fat *= i;

            if (i != valor)
            {
                aux += i + " * ";                
            }

            else
            {
                aux += i;                                                
            }
        }

        // Estrutura de decisão
        if (!aux.equalsIgnoreCase(" "))
        {
            return aux;
        }

        else
        {
            return "...";
        }
    }
}
