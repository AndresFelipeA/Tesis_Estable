package tesis_libre;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Ventana_Neu extends javax.swing.JFrame {
    
    private final Tesis_Libre tl;
    
    int x, y;
       
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ventana_Neu() {
        initComponents();
        this.setBackground(new Color(0,0,0,0)); 
        this.setLocationRelativeTo(null);
        
       
        
        tl = new Tesis_Libre(
            
            this.comboX1,
            this.comboX2,
            this.comboPuertaLogica,  
                
            this.txtUmbral,
            this.txtConstUmbral,
            this.txtFactorE,
            this.txtDivisorPesos,
            this.txtAreaConsola,
                          
            this.labelX1,
            this.labelX2,
            this.labelW1,
            this.labelW2,
            this.labelUmbral,
            this.labelConstUmbral,
            this.labelSumatoria,
            this.labelFunActiv,
            this.labelYFinal,
            this.labelFondo,
                
            this.labelInfoX1,
            this.labelInfoX2,
            this.labelInfoW1,
            this.labelInfoW2,
            this.labelInfoUmbral,
            this.labelInfoSumatoria,
            this.labelInfoFunActiv,
            this.labelInfoYFinal,
                
            this.toggleEditar,
            this.panelConfig

        );
                       
        tl.EditarCampos("Editar Parámetros", false);
        this.comboX1.setEnabled(false);
        this.comboX2.setEnabled(false); 
        
    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaConsola = new javax.swing.JTextArea();
        panelNeu = new javax.swing.JPanel();
        labelPuertaLogica = new javax.swing.JLabel();
        labelOk_E = new javax.swing.JLabel();
        labelOk_D = new javax.swing.JLabel();
        labelOk_C = new javax.swing.JLabel();
        labelOk_B = new javax.swing.JLabel();
        labelOk_A = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        labelPruebaX1 = new javax.swing.JLabel();
        labelPruebaX2 = new javax.swing.JLabel();
        labelX1 = new javax.swing.JLabel();
        labelX2 = new javax.swing.JLabel();
        labelW1 = new javax.swing.JLabel();
        labelW2 = new javax.swing.JLabel();
        labelUmbral = new javax.swing.JLabel();
        labelImagenFunAc = new javax.swing.JLabel();
        labelConstUmbral = new javax.swing.JLabel();
        labelSumatoria = new javax.swing.JLabel();
        labelFunActiv = new javax.swing.JLabel();
        labelYFinal = new javax.swing.JLabel();
        labelBarraProgreso = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        labelFondo = new javax.swing.JLabel();
        panelEntradaDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboX1 = new javax.swing.JComboBox<>();
        comboX2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        comboPuertaLogica = new javax.swing.JComboBox<>();
        panelEntradaDatos1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelInfoX1 = new javax.swing.JLabel();
        labelInfoX2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelInfoUmbral = new javax.swing.JLabel();
        labelInfoW1 = new javax.swing.JLabel();
        labelInfoW2 = new javax.swing.JLabel();
        labelInfoSumatoria = new javax.swing.JLabel();
        labelInfoFunActiv = new javax.swing.JLabel();
        labelInfoYFinal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        panelConfig = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDivisorPesos = new javax.swing.JTextField();
        txtUmbral = new javax.swing.JTextField();
        txtConstUmbral = new javax.swing.JTextField();
        txtFactorE = new javax.swing.JTextField();
        toggleEditar = new javax.swing.JToggleButton();
        panelBotones = new javax.swing.JPanel();
        botonCalcular = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        botonProbar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        panelGeneral.setBackground(new java.awt.Color(0, 0, 0));
        panelGeneral.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelGeneral.setForeground(new java.awt.Color(240, 240, 240));
        panelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtAreaConsola.setBackground(new java.awt.Color(0, 0, 0));
        txtAreaConsola.setColumns(20);
        txtAreaConsola.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtAreaConsola.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaConsola.setRows(5);
        txtAreaConsola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAreaConsola.setFocusable(false);
        jScrollPane1.setViewportView(txtAreaConsola);

        panelGeneral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 440));

        panelNeu.setBackground(new java.awt.Color(0, 0, 0));
        panelNeu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelNeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPuertaLogica.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelPuertaLogica.setForeground(new java.awt.Color(255, 255, 255));
        labelPuertaLogica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPuertaLogica.setText("AND");
        panelNeu.add(labelPuertaLogica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 50));

        labelOk_E.setForeground(new java.awt.Color(255, 255, 255));
        labelOk_E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelNeu.add(labelOk_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 30, 30));

        labelOk_D.setForeground(new java.awt.Color(255, 255, 255));
        labelOk_D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelNeu.add(labelOk_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 30, 30));

        labelOk_C.setForeground(new java.awt.Color(255, 255, 255));
        labelOk_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelNeu.add(labelOk_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 30, 30));

        labelOk_B.setForeground(new java.awt.Color(255, 255, 255));
        labelOk_B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelNeu.add(labelOk_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 30, 30));

        labelOk_A.setForeground(new java.awt.Color(255, 255, 255));
        labelOk_A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelNeu.add(labelOk_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 30, 30));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 255, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Y");
        panelNeu.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 80, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 255, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Función de Activación");
        panelNeu.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 160, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 255, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Sumatoria");
        panelNeu.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 130, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 255, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Umbral");
        panelNeu.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 130, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 255, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Constante Umbral");
        panelNeu.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 140, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 255, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("W2");
        panelNeu.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 255, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("W1");
        panelNeu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, -1));

        labelPruebaX1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelPruebaX1.setForeground(new java.awt.Color(51, 255, 51));
        labelPruebaX1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelNeu.add(labelPruebaX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        labelPruebaX2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelPruebaX2.setForeground(new java.awt.Color(51, 255, 51));
        labelPruebaX2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPruebaX2.setToolTipText("");
        panelNeu.add(labelPruebaX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));

        labelX1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelX1.setForeground(new java.awt.Color(255, 255, 255));
        labelX1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelNeu.add(labelX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 60));

        labelX2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelX2.setForeground(new java.awt.Color(255, 255, 255));
        labelX2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelNeu.add(labelX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, 50));

        labelW1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelW1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelW1.setText("0");
        panelNeu.add(labelW1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 120, 50));

        labelW2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelW2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelW2.setText("0");
        panelNeu.add(labelW2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 120, 50));

        labelUmbral.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUmbral.setForeground(new java.awt.Color(255, 255, 255));
        labelUmbral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUmbral.setText("-0.4");
        panelNeu.add(labelUmbral, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 120, 60));
        panelNeu.add(labelImagenFunAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 160, 70));

        labelConstUmbral.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelConstUmbral.setForeground(new java.awt.Color(255, 255, 255));
        labelConstUmbral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConstUmbral.setText("-1");
        panelNeu.add(labelConstUmbral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 120, 60));

        labelSumatoria.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelSumatoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSumatoria.setText("0");
        panelNeu.add(labelSumatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 140, 140));

        labelFunActiv.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelFunActiv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFunActiv.setText("0");
        labelFunActiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelFunActivMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelFunActivMouseReleased(evt);
            }
        });
        panelNeu.add(labelFunActiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 130, 50));

        labelYFinal.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelYFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelYFinal.setText("0");
        panelNeu.add(labelYFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 80, 70));

        labelBarraProgreso.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelBarraProgreso.setForeground(new java.awt.Color(255, 255, 255));
        labelBarraProgreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelNeu.add(labelBarraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 530, 60));

        barraProgreso.setBackground(new java.awt.Color(0, 0, 0));
        barraProgreso.setForeground(new java.awt.Color(51, 255, 51));
        barraProgreso.setBorderPainted(false);
        panelNeu.add(barraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 530, 60));

        labelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Arreglo.png"))); // NOI18N
        panelNeu.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        panelEntradaDatos.setBackground(new java.awt.Color(0, 0, 0));
        panelEntradaDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelEntradaDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Entrada de Neurona");
        panelEntradaDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jSeparator12.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelEntradaDatos.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 30, 70));

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        panelEntradaDatos.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 260, 19));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        panelEntradaDatos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 19));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X2");
        panelEntradaDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 90, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X1");
        panelEntradaDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));

        comboX1.setBackground(new java.awt.Color(0, 0, 0));
        comboX1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        comboX1.setForeground(new java.awt.Color(51, 255, 51));
        comboX1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "-1" }));
        comboX1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboX1ItemStateChanged(evt);
            }
        });
        panelEntradaDatos.add(comboX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        comboX2.setBackground(new java.awt.Color(0, 0, 0));
        comboX2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        comboX2.setForeground(new java.awt.Color(51, 255, 51));
        comboX2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "-1" }));
        comboX2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboX2ItemStateChanged(evt);
            }
        });
        panelEntradaDatos.add(comboX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 90, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Puerta Lógica");
        panelEntradaDatos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        comboPuertaLogica.setBackground(new java.awt.Color(0, 0, 0));
        comboPuertaLogica.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        comboPuertaLogica.setForeground(new java.awt.Color(51, 255, 51));
        comboPuertaLogica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AND", "OR" }));
        comboPuertaLogica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPuertaLogicaItemStateChanged(evt);
            }
        });
        panelEntradaDatos.add(comboPuertaLogica, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 140, -1));

        panelEntradaDatos1.setBackground(new java.awt.Color(0, 0, 0));
        panelEntradaDatos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelEntradaDatos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Datos Iniciales");
        panelEntradaDatos1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, -1));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        panelEntradaDatos1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 270, 10));

        labelInfoX1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelInfoX1.setForeground(new java.awt.Color(255, 255, 255));
        labelInfoX1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoX1.setText("1");
        panelEntradaDatos1.add(labelInfoX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, -1));

        labelInfoX2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelInfoX2.setForeground(new java.awt.Color(255, 255, 255));
        labelInfoX2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoX2.setText("1");
        panelEntradaDatos1.add(labelInfoX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 90, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Umbral=");
        panelEntradaDatos1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        labelInfoUmbral.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelInfoUmbral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoUmbral.setText("0");
        panelEntradaDatos1.add(labelInfoUmbral, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, -1));

        labelInfoW1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelInfoW1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoW1.setText("0");
        panelEntradaDatos1.add(labelInfoW1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, -1));

        labelInfoW2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelInfoW2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoW2.setText("0");
        panelEntradaDatos1.add(labelInfoW2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 70, -1));

        labelInfoSumatoria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelInfoSumatoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoSumatoria.setText("0");
        panelEntradaDatos1.add(labelInfoSumatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, -1));

        labelInfoFunActiv.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelInfoFunActiv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoFunActiv.setText("0");
        panelEntradaDatos1.add(labelInfoFunActiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, -1));

        labelInfoYFinal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelInfoYFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoYFinal.setText("0");
        panelEntradaDatos1.add(labelInfoYFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 110, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("W1=");
        panelEntradaDatos1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("W2=");
        panelEntradaDatos1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("X1=");
        panelEntradaDatos1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X2=");
        panelEntradaDatos1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sumatoria=");
        panelEntradaDatos1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("F. de Activ=");
        panelEntradaDatos1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Resultado Final (Y)=");
        panelEntradaDatos1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        panelEntradaDatos1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, 10));
        panelEntradaDatos1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 10));
        panelEntradaDatos1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 270, 10));
        panelEntradaDatos1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, 10));
        panelEntradaDatos1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 270, 10));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelEntradaDatos1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 20, 20));

        panelConfig.setBackground(new java.awt.Color(0, 0, 0));
        panelConfig.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Configuración Inicial");

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Divisor de Pesos");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Umbral");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Constante Umbral");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Factor de Aprendizaje");

        txtDivisorPesos.setBackground(new java.awt.Color(0, 0, 0));
        txtDivisorPesos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtDivisorPesos.setForeground(new java.awt.Color(255, 255, 255));
        txtDivisorPesos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDivisorPesos.setText("2.5");

        txtUmbral.setBackground(new java.awt.Color(0, 0, 0));
        txtUmbral.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtUmbral.setForeground(new java.awt.Color(255, 255, 255));
        txtUmbral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUmbral.setText("-0.4");

        txtConstUmbral.setBackground(new java.awt.Color(0, 0, 0));
        txtConstUmbral.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtConstUmbral.setForeground(new java.awt.Color(255, 255, 255));
        txtConstUmbral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConstUmbral.setText("-1");

        txtFactorE.setBackground(new java.awt.Color(0, 0, 0));
        txtFactorE.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtFactorE.setForeground(new java.awt.Color(255, 255, 255));
        txtFactorE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFactorE.setText("0.6");

        toggleEditar.setBackground(new java.awt.Color(0, 0, 0));
        toggleEditar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        toggleEditar.setForeground(new java.awt.Color(255, 255, 255));
        toggleEditar.setText("Editar Parámetros");
        toggleEditar.setFocusable(false);
        toggleEditar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                toggleEditarStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelConfigLayout = new javax.swing.GroupLayout(panelConfig);
        panelConfig.setLayout(panelConfigLayout);
        panelConfigLayout.setHorizontalGroup(
            panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigLayout.createSequentialGroup()
                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConfigLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(toggleEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConfigLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelConfigLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16)
                                .addComponent(txtUmbral, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConfigLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14)
                                .addComponent(txtConstUmbral, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConfigLayout.createSequentialGroup()
                                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)
                                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDivisorPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFactorE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelConfigLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        panelConfigLayout.setVerticalGroup(
            panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtUmbral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtConstUmbral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txtFactorE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDivisorPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(15, 15, 15)
                .addComponent(toggleEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBotones.setBackground(new java.awt.Color(0, 0, 0));
        panelBotones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        botonCalcular.setBackground(new java.awt.Color(0, 0, 0));
        botonCalcular.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        botonCalcular.setText("Calcular");
        botonCalcular.setToolTipText("");
        botonCalcular.setFocusPainted(false);
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        botonLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        botonLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        botonLimpiar.setText("Limpiar Texto");
        botonLimpiar.setFocusPainted(false);
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonCerrar.setBackground(new java.awt.Color(0, 0, 0));
        botonCerrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrar.setText("Cerrar");
        botonCerrar.setFocusPainted(false);
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        botonProbar.setBackground(new java.awt.Color(0, 0, 0));
        botonProbar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonProbar.setForeground(new java.awt.Color(255, 255, 255));
        botonProbar.setText("Probar Valores");
        botonProbar.setToolTipText("");
        botonProbar.setFocusPainted(false);
        botonProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProbarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonProbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonProbar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNeu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEntradaDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEntradaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(panelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelEntradaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(237, 237, 237))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelNeu, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelEntradaDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        
        //ImageIcon ima = new ImageIcon(getClass().getResource("/Imagenes/okverde.png"));
       
        tl.AccionBotonPrueba();
        Hilos h1= new Hilos (this.comboX1,
                             this.comboX2,
                             this.comboPuertaLogica,

                             this.txtUmbral,
                             this.txtConstUmbral,
                             this.txtFactorE,
                             this.txtDivisorPesos,
                             this.txtAreaConsola,
                             
                              
                             this.labelPruebaX1,    
                             this.labelPruebaX2,
                
                             this.labelX1,
                             this.labelX2,
                             this.labelW1,
                             this.labelW2,
                             this.labelUmbral,
                             this.labelConstUmbral,
                             this.labelSumatoria,
                             this.labelFunActiv,
                             this.labelYFinal,

                             this.labelInfoX1,
                             this.labelInfoX2,
                             this.labelInfoW1,
                             this.labelInfoW2,
                             this.labelInfoSumatoria,
                             this.labelInfoFunActiv,
                             this.labelInfoYFinal,
                             
                             this.labelOk_A,
                             this.labelOk_B,
                             this.labelOk_C,
                             this.labelOk_D,
                             this.labelOk_E,
                             
                             this.labelPuertaLogica,
                             this.labelFondo,
                             
                             this.botonCalcular,
                             this.botonLimpiar,
                             this.botonCerrar,

                             this.toggleEditar,

                             this.labelBarraProgreso,
                             this.barraProgreso

        );
        h1.start();
        
                
               
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void toggleEditarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_toggleEditarStateChanged
         
        
        if (toggleEditar.isSelected()){
            
            tl.EditarCampos("Editando...", true);
                                   
        }else{
            
            tl.EditarCampos("Editar Parámetros", false);
      
            
        }
    }//GEN-LAST:event_toggleEditarStateChanged

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
           System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        
        this.txtAreaConsola.setText("");
        
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void comboX1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboX1ItemStateChanged
        
        this.labelX1.setText(this.comboX1.getSelectedItem().toString());
        this.labelInfoX1.setText(this.comboX1.getSelectedItem().toString());
                
    }//GEN-LAST:event_comboX1ItemStateChanged

    private void comboX2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboX2ItemStateChanged
        
        this.labelX2.setText(this.comboX2.getSelectedItem().toString());
        this.labelInfoX2.setText(this.comboX2.getSelectedItem().toString());
        
    }//GEN-LAST:event_comboX2ItemStateChanged

    private void labelFunActivMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFunActivMousePressed
        
        ImageIcon ima = new ImageIcon(getClass().getResource("/Imagenes/FunTanH.png"));
        
        this.labelImagenFunAc.setIcon(ima);
    }//GEN-LAST:event_labelFunActivMousePressed

    private void labelFunActivMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFunActivMouseReleased
        
        this.labelImagenFunAc.setIcon(null);
        
    }//GEN-LAST:event_labelFunActivMouseReleased

    private void botonProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProbarActionPerformed
       
        
        
    }//GEN-LAST:event_botonProbarActionPerformed

    private void comboPuertaLogicaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPuertaLogicaItemStateChanged
        this.labelPuertaLogica.setText(this.comboPuertaLogica.getSelectedItem().toString());
    }//GEN-LAST:event_comboPuertaLogicaItemStateChanged

   
    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Neu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Neu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Neu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Neu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new Ventana_Neu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonProbar;
    private javax.swing.JComboBox<String> comboPuertaLogica;
    private javax.swing.JComboBox<String> comboX1;
    private javax.swing.JComboBox<String> comboX2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelBarraProgreso;
    private javax.swing.JLabel labelConstUmbral;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelFunActiv;
    private javax.swing.JLabel labelImagenFunAc;
    private javax.swing.JLabel labelInfoFunActiv;
    private javax.swing.JLabel labelInfoSumatoria;
    private javax.swing.JLabel labelInfoUmbral;
    private javax.swing.JLabel labelInfoW1;
    private javax.swing.JLabel labelInfoW2;
    private javax.swing.JLabel labelInfoX1;
    private javax.swing.JLabel labelInfoX2;
    private javax.swing.JLabel labelInfoYFinal;
    private javax.swing.JLabel labelOk_A;
    private javax.swing.JLabel labelOk_B;
    private javax.swing.JLabel labelOk_C;
    private javax.swing.JLabel labelOk_D;
    private javax.swing.JLabel labelOk_E;
    private javax.swing.JLabel labelPruebaX1;
    private javax.swing.JLabel labelPruebaX2;
    private javax.swing.JLabel labelPuertaLogica;
    private javax.swing.JLabel labelSumatoria;
    private javax.swing.JLabel labelUmbral;
    private javax.swing.JLabel labelW1;
    private javax.swing.JLabel labelW2;
    private javax.swing.JLabel labelX1;
    private javax.swing.JLabel labelX2;
    private javax.swing.JLabel labelYFinal;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelConfig;
    private javax.swing.JPanel panelEntradaDatos;
    private javax.swing.JPanel panelEntradaDatos1;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelNeu;
    private javax.swing.JToggleButton toggleEditar;
    private javax.swing.JTextArea txtAreaConsola;
    private javax.swing.JTextField txtConstUmbral;
    private javax.swing.JTextField txtDivisorPesos;
    private javax.swing.JTextField txtFactorE;
    private javax.swing.JTextField txtUmbral;
    // End of variables declaration//GEN-END:variables
   


}
