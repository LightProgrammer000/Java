package A;

// Bibliotecas
import java.util.Date;
import java.util.Locale;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Teste extends javax.swing.JFrame 
{
    // Construtor
    public Teste() 
    {
        initComponents();
        config();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        lblDimensao = new javax.swing.JLabel();
        btnHora = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Identificadores");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/B/2.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/B/3.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/B/4.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        lblHora.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 153, 0));
        lblHora.setText("Data e Hora do sistema");

        lblIdioma.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(0, 255, 51));
        lblIdioma.setText("Idioma do Sistema");

        lblDimensao.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblDimensao.setForeground(new java.awt.Color(255, 102, 0));
        lblDimensao.setText("Dimensionamento de tela");

        btnHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHora.setForeground(new java.awt.Color(255, 0, 0));
        btnHora.setText("Clique Aqui");
        btnHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDimensao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblDimensao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblHora))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdioma))
                .addGap(18, 18, 18)
                .addComponent(btnHora)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    // Método: Botão
    private void btnHoraActionPerformed(java.awt.event.ActionEvent evt) {                                        

        // Instanciação de Objeto
        Date relogio = new Date();                                       // Classe: "Date" <-> Objeto: "relogio" (Análise da hora)
        Locale idioma = Locale.getDefault();                             // Classe: "Locale" <-> Objeto: "idioma" (Análise do idioma)
        Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();// Classe: "Dimension" <-> Objeto "dimensao" (Análise da dimensão)

        // Dimensão da Tela
        int largura = (int) dimensao.getWidth();// Capturar largura
        int altura = (int) dimensao.getHeight();// Capturar altura

        // Saída de dados
        lblHora.setText(relogio.toString().toUpperCase());
        lblIdioma.setText(idioma.getDisplayLanguage().toUpperCase());
        lblDimensao.setText(largura + " x " +  altura);
    }                                       

    // Método Principal
    public static void main(String args[]) 
    {
        try
        {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }

        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new A().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHora;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDimensao;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIdioma;
    // End of variables declaration                   

    // Método: Configurações
    private void config() 
    {
        this.setLocationRelativeTo(null);// Tela inicial no centro
        getContentPane().setBackground(Color.white);// Tela inicial em cor branca
    }
}
