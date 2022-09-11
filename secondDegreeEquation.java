package Aula_12;

// Bibliotecas
import java.awt.Color;
import java.awt.Font;

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

        pan1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTxt = new javax.swing.JLabel();
        spn1 = new javax.swing.JSpinner();
        spn2 = new javax.swing.JSpinner();
        spn3 = new javax.swing.JSpinner();
        btnCal = new javax.swing.JButton();
        pan2 = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        lblDelta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pan1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equação do 2º grau", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 18), new java.awt.Color(0, 0, 153))); // NOI18N
        pan1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel1.setText("X²");

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setText("X");

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setText("=");

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel4.setText("+");

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel5.setText("+");

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel6.setText("0");

        lblTxt.setText("Delta");

        spn1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        spn2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        spn3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        btnCal.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnCal.setForeground(new java.awt.Color(204, 0, 0));
        btnCal.setText("Calcular Δ");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addComponent(spn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addGap(58, 58, 58)
                        .addComponent(spn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49)
                        .addComponent(spn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(25, 25, 25))
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(spn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addComponent(lblTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pan2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        lblTipo.setText("jLabel7");

        lblDelta.setText("jLabel8");

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDelta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTipo)
                .addGap(18, 18, 18)
                .addComponent(lblDelta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {                                       

        try
        {
            // Entrada de dados
            double a = Double.parseDouble(spn1.getValue().toString());
            double b = Double.parseDouble(spn2.getValue().toString());
            double c = Double.parseDouble(spn3.getValue().toString());

            // Cálculo
            double delta = Math.pow(b, 2) - 4 * a * c;

            // Estilo da lable
            lblTxt.setFont(new Font("Agency FB", Font.ROMAN_BASELINE, 25));
            lblTipo.setFont(new Font("Agency FB", Font.ROMAN_BASELINE, 30));
            lblDelta.setFont(new Font("Agency FB", Font.ROMAN_BASELINE, 30));

            // Lable
            lblTxt.setText(String.format(
            "<html>" +
            "<p> Δ = <font color='red'> %.0f² </font> \n" +
            " - 4 * <font color='red'> %.0f </font> * <font color='red'> %.0f </font> </p>" +
            "</html>", b, a, c));

            // Painel
            pan2.setVisible(true);
            pan2.setBackground(Color.WHITE);

            // Estrutura de decisão
            if (delta < 0)
            {
                lblTipo.setText(String.format(
                "<html>" +
                "Tipo: <font color='red'> %s </font>" +
                "</html>", "Não existem raizes"));

                lblDelta.setText(String.format(
                "<html>" +
                "Δ = <font color='red'> %.0f </font>" +
                "</html>", delta));
            }

            else if (delta == 1)
            {
                lblTipo.setText(String.format(
                "<html>" +
                "Tipo: <font color='blue'> %s </font>" +
                "</html>", "Existe somente 1 raiz"));

                lblDelta.setText(String.format(
                "<html>" +
                "Δ = <font color='blue'> %.0f </font>" +
                "</html>", delta));
            }

            else
            {
                lblTipo.setText(String.format(
                "<html>" +
                "Tipo: <font color='green'> %s </font>" +
                "</html>", "Existem 2 raízes"));

                lblDelta.setText(String.format(
                "<html>" +
                "Δ = <font color='green'> %.0f </font>" +
                "</html>", delta));
            }
        }

        catch(NumberFormatException e)
        {
            System.err.println(e);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDelta;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan2;
    private javax.swing.JSpinner spn1;
    private javax.swing.JSpinner spn2;
    private javax.swing.JSpinner spn3;
    // End of variables declaration                   

    // Método: Configurações
    private void config()
    {
        // Frame
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // Lable
        lblTxt.setFont(new Font("Agency FB", Font.ROMAN_BASELINE, 40));
        lblTxt.setText(String.format
        ("<html>" +
         "<p> Δ = <font color='red'> %c² </font> \n" +
         " - 4 * <font color='red'> %c </font> * <font color='red'> %c </font>\n" +
         "</p>\n" +
         "</html>",'B', 'A', 'C'));

        // Painel 1
        pan1.setBackground(Color.WHITE);
        
        // Painel 2
        pan2.setVisible(false);
    }
}
