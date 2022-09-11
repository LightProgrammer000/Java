package A;

import java.awt.Color;

public class A_TelaProjeto extends javax.swing.JFrame 
{
    public A_TelaProjeto()
    {
        initComponents();
        config();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();
        lblResultado2 = new javax.swing.JLabel();
        lblResultado3 = new javax.swing.JLabel();
        jtfNumero1 = new javax.swing.JTextField();
        jtfNumero2 = new javax.swing.JTextField();
        jtfNumero3 = new javax.swing.JTextField();
        jtfNumero4 = new javax.swing.JTextField();
        jtfNumero5 = new javax.swing.JTextField();
        jtfNumero6 = new javax.swing.JTextField();
        jtfNumero7 = new javax.swing.JTextField();
        jtfNumero8 = new javax.swing.JTextField();
        btnOperacao = new javax.swing.JButton();
        btnOperacao1 = new javax.swing.JButton();
        btnOperacao2 = new javax.swing.JButton();
        btnOperacao3 = new javax.swing.JButton();
        lblCtr1 = new javax.swing.JLabel();
        lblCtr2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Simples");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("+");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("-");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 17, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("x");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 17, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("/");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 40));

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblResultado.setText("0");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, 36));

        lblResultado1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblResultado1.setText("0");
        getContentPane().add(lblResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, 36));

        lblResultado2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblResultado2.setText("0");
        getContentPane().add(lblResultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, 36));

        lblResultado3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblResultado3.setText("0");
        getContentPane().add(lblResultado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, 36));

        jtfNumero1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jtfNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, -1));

        jtfNumero2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jtfNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 90, -1));

        jtfNumero3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jtfNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 87, -1));

        jtfNumero4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jtfNumero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 87, -1));

        jtfNumero5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jtfNumero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 87, -1));

        jtfNumero6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jtfNumero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 87, 31));

        jtfNumero7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jtfNumero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 87, -1));

        jtfNumero8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jtfNumero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 87, 31));

        btnOperacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOperacao.setText("=");
        btnOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnOperacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 76, -1));

        btnOperacao1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOperacao1.setText("=");
        btnOperacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacao1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOperacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 76, -1));

        btnOperacao2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOperacao2.setText("=");
        btnOperacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacao2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOperacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 76, -1));

        btnOperacao3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOperacao3.setText("=");
        btnOperacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacao3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOperacao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 76, -1));
        getContentPane().add(lblCtr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 20, 20));
        getContentPane().add(lblCtr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 20, 20));

        pack();
    }// </editor-fold>                        

    // Método: Soma
    private void btnOperacaoActionPerformed(java.awt.event.ActionEvent evt) {                                            

        // Capturar valor do campo de texto(STRING) --> Converter para número(FLOAT) 
        float n1 = Float.parseFloat(jtfNumero1.getText());
        float n2 = Float.parseFloat(jtfNumero2.getText());

        // Cálculo
        float res = (n1 + n2);

        // Converter FLOAT --> STRING
        lblResultado.setText(Float.toString(res));
    }                                           

    // Método: Subtração
    private void btnOperacao1ActionPerformed(java.awt.event.ActionEvent evt) {                                             

        // Capturar valor do campo de texto(STRING) --> Converter para número(FLOAT) 
        float n1 = Float.parseFloat(jtfNumero3.getText());
        float n2 = Float.parseFloat(jtfNumero4.getText());

        // Cálculo
        float res = (n1 - n2);

        // Converter FLOAT --> STRING
        lblResultado1.setText(Float.toString(res));
    }                                            

    // Método: Multiplicação
    private void btnOperacao2ActionPerformed(java.awt.event.ActionEvent evt) {                                             
    
        // Capturar valor do campo de texto(STRING) --> Converter para número(FLOAT) 
        float n1 = Float.parseFloat(jtfNumero5.getText());
        float n2 = Float.parseFloat(jtfNumero6.getText());

        // Cálculo
        float res = (n1 * n2);

        // Converter FLOAT --> STRING
        lblResultado2.setText(Float.toString(res));
    }                                            

    // Método: Divisão
    private void btnOperacao3ActionPerformed(java.awt.event.ActionEvent evt) {                                             

        // Capturar valor do campo de texto(STRING) --> Converter para número(FLOAT) 
        float n1 = Float.parseFloat(jtfNumero7.getText());
        float n2 = Float.parseFloat(jtfNumero8.getText());

        // Cálculo
        float res = (n1 / n2);

        // Converter FLOAT --> STRING
        lblResultado3.setText(Float.toString(res));
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
            java.util.logging.Logger.getLogger(A_TelaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new A_TelaProjeto().setVisible(true);
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnOperacao;
    private javax.swing.JButton btnOperacao1;
    private javax.swing.JButton btnOperacao2;
    private javax.swing.JButton btnOperacao3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtfNumero1;
    private javax.swing.JTextField jtfNumero2;
    private javax.swing.JTextField jtfNumero3;
    private javax.swing.JTextField jtfNumero4;
    private javax.swing.JTextField jtfNumero5;
    private javax.swing.JTextField jtfNumero6;
    private javax.swing.JTextField jtfNumero7;
    private javax.swing.JTextField jtfNumero8;
    private javax.swing.JLabel lblCtr1;
    private javax.swing.JLabel lblCtr2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JLabel lblResultado2;
    private javax.swing.JLabel lblResultado3;
    // End of variables declaration                   

    // Método: Configuração de tels
    private void config() 
    {
        this.setLocationRelativeTo(null);           // Tela Inicial no centro       
        getContentPane().setBackground(Color.white);// Tela JFrame em branco
    }
}
