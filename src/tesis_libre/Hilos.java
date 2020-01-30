package tesis_libre;

import java.awt.Color;
import javax.swing.*;


public class Hilos extends Thread {
    
        
    private Color colVerde;
    private Color colNegro;
    private Color colBlanco;
               
    private final JComboBox comboX1;
    private final JComboBox comboX2;
    private final JComboBox comboPuertaLogica;
    
    private final JTextField txtUmbral;
    private final JTextField txtConstUmbral;
    private final JTextField txtFactorE;
    private final JTextField txtDivisorPesos;
    private final JTextArea txtAreaConsola;
    
    private final JLabel labelPruebaX1;
    private final JLabel labelPruebaX2;
    
    private final JLabel labelX1;
    private final JLabel labelX2;
    private final JLabel labelW1;
    private final JLabel labelW2;
    private final JLabel labelUmbral;
    private final JLabel labelConstUmbral;
    private final JLabel labelSumatoria;
    private final JLabel labelFunActiv;
    private final JLabel labelYFinal;
        
    private final JLabel labelInfoX1;
    private final JLabel labelInfoX2;
    private final JLabel labelInfoW1;
    private final JLabel labelInfoW2;
    private final JLabel labelInfoSumatoria;
    private final JLabel labelInfoFunActiv;
    private final JLabel labelInfoYFinal;
    
    private final JLabel labelOk_A;
    private final JLabel labelOk_B;
    private final JLabel labelOk_C;
    private final JLabel labelOk_D;
    private final JLabel labelOk_E;
    
    private final JLabel labelPuertaLogica;
    private final JLabel labelFondo;
    
    private final JButton botonCalcular;
    private final JButton botonLimpiar;
    private final JButton botonCerrar;
    
    private final JToggleButton toggleEditar;
        
    private final JLabel labelBarraProgreso;
    private final JProgressBar barraProgreso;
   
    
      
    public Hilos(JComboBox cComboX1,
                 JComboBox cComboX2,
                 JComboBox cComboPuertaLogica,
                 
                 JTextField cTxtUmbral,
                 JTextField cTxtConstUmbral,
                 JTextField cTxtFactorE,
                 JTextField cTxtDivisorPesos,
                 JTextArea cTxtAreaConsola,
                 
                 JLabel cLabelPruebaX1,
                 JLabel cLabelPruebaX2,
                 
                 JLabel cLabelX1,
                 JLabel cLabelX2,
                 JLabel cLabelW1,
                 JLabel cLabelW2,
                 JLabel cLabelUmbral,
                 JLabel cLabelConstUmbral,
                 JLabel cLabelSumatoria,
                 JLabel cLabelFunActiv,
                 JLabel cLabelYFinal,
                 
                 JLabel cLabelInfoX1,
                 JLabel cLabelInfoX2,
                 JLabel cLabelInfoW1,
                 JLabel cLabelInfoW2,
                 JLabel cLabelInfoSumatoria,
                 JLabel cLabelInfoFunActiv,
                 JLabel cLabelInfoYFinal,
                 
                 JLabel cLabelOk_A,
                 JLabel cLabelOk_B,
                 JLabel cLabelOk_C,
                 JLabel cLabelOk_D,
                 JLabel cLabelOk_E,
                 
                 JLabel cLabelPuertaLogica,
                 JLabel cLabelFondo,
                 
                 JButton cBotonCalcular,
                 JButton cBotonLimpiar,
                 JButton cBotonCerrar,
                 
                 JToggleButton cToggleEditar,
                 
                 JLabel cLabelBarraProgreso,     
                 JProgressBar cBarraProgreso){
    
        this.comboX1 = cComboX1;
        this.comboX2 = cComboX2;
        this.comboPuertaLogica = cComboPuertaLogica;
        
        this.txtUmbral = cTxtUmbral;
        this.txtConstUmbral = cTxtConstUmbral;
        this.txtFactorE = cTxtFactorE;
        this.txtDivisorPesos = cTxtDivisorPesos;
        this.txtAreaConsola = cTxtAreaConsola;
        
        
        this.labelPruebaX1 = cLabelPruebaX1;
        this.labelPruebaX2 = cLabelPruebaX2;
        
        this.labelX1 = cLabelX1;
        this.labelX2 = cLabelX2;
        this.labelW1 =cLabelW1;
        this.labelW2 =cLabelW2;
        this.labelUmbral =cLabelUmbral;
        this.labelConstUmbral = cLabelConstUmbral;
        this.labelSumatoria = cLabelSumatoria;
        this.labelFunActiv = cLabelFunActiv;
        this.labelYFinal = cLabelYFinal;
        
        this.labelInfoX1 = cLabelInfoX1;
        this.labelInfoX2 = cLabelInfoX2;
        this.labelInfoW1 = cLabelInfoW1;
        this.labelInfoW2 = cLabelInfoW2;
        this.labelInfoSumatoria = cLabelInfoSumatoria;
        this.labelInfoFunActiv = cLabelInfoFunActiv;
        this.labelInfoYFinal = cLabelInfoYFinal;
        
        this.labelOk_A = cLabelOk_A;
        this.labelOk_B = cLabelOk_B;
        this.labelOk_C = cLabelOk_C;
        this.labelOk_D = cLabelOk_D;
        this.labelOk_E = cLabelOk_E;
        
        this.labelPuertaLogica = cLabelPuertaLogica;
        this.labelFondo = cLabelFondo;
        
        this.botonCalcular = cBotonCalcular;
        this.botonLimpiar = cBotonLimpiar;
        this.botonCerrar = cBotonCerrar;
                
        this.toggleEditar = cToggleEditar;
        
        this.labelBarraProgreso = cLabelBarraProgreso;
        this.barraProgreso = cBarraProgreso;
       
    
    }

      
    @Override
    public void run(){
        
        boolean des = true;
        colVerde = new Color(51,255,51);
        colNegro = new Color(0,0,0);
        colBlanco = new Color(255,255,255);
        
        this.SetColorLabelInfo(colNegro);
        
        AccionHilo();
        
        comboX1.setEnabled(des);
        comboX2.setEnabled(des);
        comboPuertaLogica.setEnabled(des);
        
        botonCalcular.setEnabled(des);
        botonLimpiar.setEnabled(des);
        botonCerrar.setEnabled(des);
        
        toggleEditar.setEnabled(des);
        
        interrupt();
        this.txtAreaConsola.setForeground(colBlanco);
        this.botonCalcular.setEnabled(false);
        
    }
    
    private void SetColorLabelInfo(Color col){
    
        labelW1.setForeground(col);
        labelW2.setForeground(col);
        labelSumatoria.setForeground(col);
        labelFunActiv.setForeground(col);
        labelYFinal.setForeground(col);
        labelInfoW1.setForeground(col);
        labelInfoW2.setForeground(col);
        labelInfoSumatoria.setForeground(col);
        labelInfoFunActiv.setForeground(col);
        labelInfoYFinal.setForeground(col);
    
    }
        
    private void ColorLabel(Color col){
    
         //labelSum.setForeground(col);
         //labelFunSum.setForeground(col);
         this.labelYFinal.setForeground(col);
    
    }
    
    
    private void SetLabelImagen(ImageIcon ima){
        
        labelOk_A.setIcon(ima);
        labelOk_B.setIcon(ima);
        labelOk_C.setIcon(ima);
        labelOk_D.setIcon(ima);
        labelOk_E.setIcon(ima);
    
    }
    
    private void SetLabelProgreso(String txtLabel, Color col){
    
            labelBarraProgreso.setForeground(col);
            labelBarraProgreso.setText(txtLabel);
    
    }
    
    
    /*
    private void LimpiarCamposNeu(String valor){

           labelX1.setText(valor);
           labelX2.setText(valor);
           labelUmbral.setText(valor);
           labelConstUmbral.setText(valor);
           labelW1.setText(valor);
           labelW2.setText(valor);
           labelYFinal.setText(valor);
           
    }
    */
    
    private void AccionHilo(){
        ImageIcon imaFon = new ImageIcon(getClass().getResource("/Imagenes/Fondo_Prueba.png"));
        ImageIcon ima = new ImageIcon(getClass().getResource("/Imagenes/okverde.png"));
        
        
        try{
            
            boolean des = false;
            
            this.SetLabelImagen(null);
            comboX1.setEnabled(des);
            comboX2.setEnabled(des);
            comboPuertaLogica.setEnabled(des);
            botonCalcular.setEnabled(des);
            botonLimpiar.setEnabled(des);
            botonCerrar.setEnabled(des);
            toggleEditar.setEnabled(des);
            
            this.labelX1.setForeground(colNegro);
            this.labelX2.setForeground(colNegro);
            
            barraProgreso.setValue(5);

            Thread.sleep(250);                          
            barraProgreso.setValue(10);
            SetLabelProgreso("Calculando.",colBlanco);
            
            Thread.sleep(250);
            barraProgreso.setValue(20);
            SetLabelProgreso("Calculando..",colBlanco);
            
            Thread.sleep(1000);
            labelW1.setForeground(colBlanco);
            labelInfoW1.setForeground(colBlanco);
            SetLabelProgreso("Calculando...",colBlanco);
            
            Thread.sleep(100);
            labelOk_A.setIcon(ima);
            labelW2.setForeground(colBlanco);
            labelInfoW2.setForeground(colBlanco);
            SetLabelProgreso("Calculando.",colBlanco);
            
            Thread.sleep(100);
            labelOk_B.setIcon(ima);
            barraProgreso.setValue(40);
            SetLabelProgreso("Calculando..",colBlanco);
            
            Thread.sleep(1000);
            labelSumatoria.setForeground(colBlanco);
            labelInfoSumatoria.setForeground(colBlanco);
            SetLabelProgreso("Calculando...",colBlanco);
            
            Thread.sleep(100);
            labelOk_C.setIcon(ima);
            labelBarraProgreso.setForeground(colNegro);
            barraProgreso.setValue(60);
            SetLabelProgreso("Calculando.",colNegro);

            Thread.sleep(1000);
            labelFunActiv.setForeground(Color.white);
            labelInfoFunActiv.setForeground(colBlanco);
            SetLabelProgreso("Calculando..",colNegro);
            
            Thread.sleep(100);
            labelOk_D.setIcon(ima);
            barraProgreso.setValue(80);

            Thread.sleep(1000);
            this.labelYFinal.setText(this.comboPuertaLogica.getSelectedItem().toString());
            labelYFinal.setForeground(colBlanco);
            labelInfoYFinal.setForeground(colBlanco);
            
            Thread.sleep(100);
            labelOk_E.setIcon(ima);
            SetLabelProgreso("Calculando...",colNegro);
            barraProgreso.setValue(100);               

            Thread.sleep(1000);
            ColorLabel(colNegro);
            SetLabelImagen(null);
            SetLabelProgreso("Proceso Terminado",colBlanco);
            barraProgreso.setValue(0); 

            Thread.sleep(500);
            ColorLabel(colVerde);
            SetLabelImagen(ima);
            SetLabelProgreso("Proceso Terminado",colNegro);
            barraProgreso.setValue(100);
 
            Thread.sleep(500);                
            ColorLabel(colNegro);
            SetLabelImagen(null);
            SetLabelProgreso("Proceso Terminado",colBlanco);
            barraProgreso.setValue(0);
            
            Thread.sleep(500);
            ColorLabel(colVerde);
            SetLabelImagen(ima);
            SetLabelProgreso("Proceso Terminado",colNegro);
            barraProgreso.setValue(100);

            Thread.sleep(500);                
            ColorLabel(colNegro);
            SetLabelImagen(null);
            SetLabelProgreso("Proceso Terminado",colBlanco);
            barraProgreso.setValue(0);
 
            Thread.sleep(500);                
            ColorLabel(colBlanco);
            SetLabelImagen(ima);
            SetLabelProgreso("Proceso Terminado",colNegro);
            barraProgreso.setValue(100);
            
            //oculto la label de la puerta lógica (Alisto todo para la fase de test)
            this.labelPuertaLogica.setForeground(colNegro);
            this.labelPruebaX1.setText("X1");
            this.labelPruebaX2.setText("X2");
            this.labelX1.setForeground(colBlanco);
            this.labelX2.setForeground(colBlanco);
                                    
            this.labelX1.setText(String.valueOf(this.comboX1.getSelectedItem()));
            this.labelX2.setText(String.valueOf(this.comboX2.getSelectedItem()));
            labelFondo.setIcon(imaFon);
                       
            
        }catch(InterruptedException ex){
                
            System.out.println("El error es: "+ex);
      
        }
    
    }
    
    
    
}
