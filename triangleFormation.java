package Aula_14;

import java.awt.Color;

public class A extends javax.swing.JFrame 
{
    // Construtor
    public A() 
    {
        initComponents();
        config();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblSegAB = new javax.swing.JLabel();
        lblSegAC = new javax.swing.JLabel();
        lblSegBC = new javax.swing.JLabel();
        lblAB = new javax.swing.JLabel();
        lblAC = new javax.swing.JLabel();
        lblBC = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        lblValAB = new javax.swing.JLabel();
        lblValAC = new javax.swing.JLabel();
        lblValBC = new javax.swing.JLabel();
        sldSegAB = new javax.swing.JSlider();
        sldSegAC = new javax.swing.JSlider();
        sldSegBC = new javax.swing.JSlider();
        pan = new javax.swing.JPanel();
        lblFor = new javax.swing.JLabel();
        lblTip = new javax.swing.JLabel();
        btnCal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSegAB.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblSegAB.setText("<html> <p> Segmento <font color='red'> AB </font> </p> </html>");
        getContentPane().add(lblSegAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lblSegAC.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblSegAC.setText("<html> <p> Segmento <font color='red'> AC </font> </p> </html>");
        getContentPane().add(lblSegAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lblSegBC.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblSegBC.setText("<html> <p> Segmento <font color='red'> BC </font> </p> </html>");
        getContentPane().add(lblSegBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lblAB.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblAB.setForeground(new java.awt.Color(0, 0, 204));
        lblAB.setText("AB");
        getContentPane().add(lblAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        lblAC.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblAC.setForeground(new java.awt.Color(204, 204, 0));
        lblAC.setText("AC");
        getContentPane().add(lblAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, -1, -1));

        lblBC.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblBC.setForeground(new java.awt.Color(153, 0, 153));
        lblBC.setText("BC");
        getContentPane().add(lblBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tipos-de-triangulos1.jpg"))); // NOI18N
        getContentPane().add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 210));

        lblValAB.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblValAB.setText("0");
        getContentPane().add(lblValAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        lblValAC.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblValAC.setText("0");
        getContentPane().add(lblValAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        lblValBC.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblValBC.setText("0");
        getContentPane().add(lblValBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        sldSegAB.setValue(0);
        sldSegAB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSegABStateChanged(evt);
            }
        });
        getContentPane().add(sldSegAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 220, -1));

        sldSegAC.setValue(0);
        sldSegAC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSegACStateChanged(evt);
            }
        });
        getContentPane().add(sldSegAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, -1));

        sldSegBC.setValue(0);
        sldSegBC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSegBCStateChanged(evt);
            }
        });
        getContentPane().add(sldSegBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 220, -1));

        pan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 18), new java.awt.Color(255, 51, 0))); // NOI18N

        lblFor.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblFor.setText("Forma ou não forma um triângulo ?");

        lblTip.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblTip.setText("Tipo do triângulo");

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFor, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(panLayout.createSequentialGroup()
                        .addComponent(lblTip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFor)
                .addGap(18, 18, 18)
                .addComponent(lblTip)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 770, 160));

        btnCal.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnCal.setForeground(new java.awt.Color(153, 0, 204));
        btnCal.setText("Calcular");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });
        getContentPane().add(btnCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 366, -1));

        setBounds(0, 0, 824, 547);
    }// </editor-fold>                        

    // Método: Segmento AB
    private void sldSegABStateChanged(javax.swing.event.ChangeEvent evt) {                                      

        lblAB.setText(Integer.toString(sldSegAB.getValue()));
        lblValAB.setText(Integer.toString(sldSegAB.getValue())); 
    }                                     

    // Método: Segmento AC
    private void sldSegACStateChanged(javax.swing.event.ChangeEvent evt) {                                      

        lblAC.setText(Integer.toString(sldSegAC.getValue()));
        lblValAC.setText(Integer.toString(sldSegAC.getValue())); 
    }                                     

    // Método: Segmento BC
    private void sldSegBCStateChanged(javax.swing.event.ChangeEvent evt) {                                      

        lblBC.setText(Integer.toString(sldSegBC.getValue()));
        lblValBC.setText(Integer.toString(sldSegBC.getValue())); 
    }                                     

    // Método: Calcular formação de triângulo
    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {                                       

        //
        int ab = sldSegAB.getValue();
        int ac = sldSegAC.getValue();
        int bc = sldSegBC.getValue();
        
        // Painel
        pan.setVisible(true);
        
        // Estrutura de decisão
        if (analFormTri(ab, ac, bc) == 1)
        {
            tipoTri(ab, ac, bc);                        
        }
        
        else
        {
            lblTip.setText("");
        }
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
    private javax.swing.JButton btnCal;
    private javax.swing.JLabel lblAB;
    private javax.swing.JLabel lblAC;
    private javax.swing.JLabel lblBC;
    private javax.swing.JLabel lblFor;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblSegAB;
    private javax.swing.JLabel lblSegAC;
    private javax.swing.JLabel lblSegBC;
    private javax.swing.JLabel lblTip;
    private javax.swing.JLabel lblValAB;
    private javax.swing.JLabel lblValAC;
    private javax.swing.JLabel lblValBC;
    private javax.swing.JPanel pan;
    private javax.swing.JSlider sldSegAB;
    private javax.swing.JSlider sldSegAC;
    private javax.swing.JSlider sldSegBC;
    // End of variables declaration                   

    private void config()
    {
        // Frame
        this.setTitle("Formação de triângulo");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        
        // Painel
        pan.setBackground(Color.WHITE);
        pan.setVisible(false);
    }

    // Método: Formação de triângulo
    private int analFormTri(int ab, int ac, int bc) 
    {
        if ( (ab < ac + bc) && (ac < ab + bc) && (bc < ac + bc) )
        {
            lblFor.setText(String.format(
            "<html>\n" +
            "<p> Análise: <font color='green'> As medidas informadas formam um triângulo !!! </font> </p>\n" +
            "</html>"));

            return (1);
        }

        else
        {
            lblFor.setText(String.format(
            "<html>\n" +
            "<p> Análise: <font color='red'> As medidas informadas não formam um triângulo !!! </font> </p>\n" +
            "</html>"));

            return (0);
        }
    }

    // Método: Tipo do triângulo
    private void tipoTri(int ab, int ac, int bc) 
    {
        if (ab == ac && ac == bc)
        {
            lblTip.setText(String.format(
            "<html>\n" +
            "<p> Tipo: <font color='green'> Triângulo Equilátero !!! </font> </p>\n" +
            "</html>"));
        }

        else if(ab != ac && ac != bc && bc != ab)
        {
            lblTip.setText(String.format(
            "<html>\n" +
            "<p> Tipo: <font color='blue'> Triângulo Escaleno !!! </font> </p>\n" +
            "</html>"));            
        }

        else
        {
            lblTip.setText(String.format(
            "<html>\n" +
            "<p> Tipo: <font color='purple'> Triângulo Isósceles !!! </font> </p>\n" +
            "</html>"));  
        }
    }
}
