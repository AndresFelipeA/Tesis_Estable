package tesis_libre;

import java.awt.Color;
//import java.awt.Image;
//import java.awt.Toolkit;
import java.util.Random;
import javax.swing.*;

public class Tesis_Libre {

    
    private int [][] arreglo;
    private final int [][] arrAnd = {{ 1,  1,  1},
                                     { 1, -1, -1},
                                     {-1,  1, -1},
                                     {-1, -1, -1}};

    private final int[][] arrOr =   {{ 1,  1,  1}, 
                                     { 1, -1,  1},
                                     {-1,  1,  1}, 
                                     {-1, -1, -1}};
    
    private double w1;
    private double w2;
    private double umbral;
    private double constUmbral;
    private double factorE;
    private double y;
    
    //-----------------//
    
    private int x1;
    private int x2;
    private double sumatoriaGen;
    private double funcionActiv;
    
    private JComboBox comboX1;
    private JComboBox comboX2;
    private JComboBox comboPuertaLogica;
    
    private JTextField txtUmbral;
    private JTextField txtConstUmbral;
    private JTextField txtFactorE;
    private JTextField txtDivisorPesos;
    private JTextArea txtAreaConsola;
        
    private JLabel labelX1;
    private JLabel labelX2;
    private JLabel labelW1;
    private JLabel labelW2;
    private JLabel labelUmbral;
    private JLabel labelConstUmbral;
    private JLabel labelSumatoria;
    private JLabel labelFunActiv;
    private JLabel labelYFinal;
    
    private JLabel labelInfoX1;
    private JLabel labelInfoX2;
    private JLabel labelInfoW1;
    private JLabel labelInfoW2;
    private JLabel labelInfoUmbral;
    private JLabel labelInfoSumatoria;
    private JLabel labelInfoFunActiv;
    private JLabel labelInfoYFinal;
    private JLabel labelFondo;
    
   
    
    private JToggleButton toggleEditar;
    private JPanel panelConfig;
    //private JFrame framePrin;
    
    
    public Tesis_Libre(){
    
        
    
    }
    
    public Tesis_Libre(JComboBox cComboX1,
                       JComboBox cComboX2,
                       JComboBox cComboPuertaLogica,
                       
                       JTextField cTxtUmbral,
                       JTextField cTxtConstUmbral,
                       JTextField cTxtFactorE,
                       JTextField cTxtDivisorPesos,
                       JTextArea cTxtAreaConsola,
                                            
                       JLabel cLabelX1,
                       JLabel cLabelX2,
                       JLabel cLabelW1,
                       JLabel cLabelW2,
                       JLabel cLabelUmbral,
                       JLabel cLabelConstUmbral,
                       JLabel cLabelSumatoria,
                       JLabel cLabelFunActiv,
                       JLabel cLabelYFinal,
                       JLabel cLabelFondo,
                       
                       JLabel cLabelInfoX1,
                       JLabel cLabelInfoX2,
                       JLabel cLabelInfoW1,
                       JLabel cLabelInfoW2,
                       JLabel cLabelInfoUmbral,
                       JLabel cLabelInfoSumatoria,
                       JLabel cLabelInfoFunActiv,
                       JLabel cLabelInfoYFinal,
                       
                       JToggleButton cToggleEditar,
                       JPanel cPanelConfig){            
                       //JFrame cFramePrin){

       
        this.comboX1 = cComboX1;
        this.comboX2 = cComboX2;
        this.comboPuertaLogica = cComboPuertaLogica;
        
        this.txtUmbral = cTxtUmbral;
        this.txtConstUmbral = cTxtConstUmbral;
        this.txtFactorE = cTxtFactorE;
        this.txtDivisorPesos = cTxtDivisorPesos;
        this.txtAreaConsola = cTxtAreaConsola;
                
        this.labelX1 = cLabelX1;
        this.labelX2 = cLabelX2;
        this.labelW1 = cLabelW1;
        this.labelW2 = cLabelW2;
        this.labelUmbral = cLabelUmbral;
        this.labelConstUmbral= cLabelConstUmbral;
        this.labelSumatoria = cLabelSumatoria;
        this.labelFunActiv = cLabelFunActiv;
        this.labelYFinal = cLabelYFinal;
        this.labelFondo = cLabelFondo;
        
        this.labelInfoX1 = cLabelInfoX1;
        this.labelInfoX2 = cLabelInfoX2;
        this.labelInfoW1 = cLabelInfoW1;
        this.labelInfoW2 = cLabelInfoW2;
        this.labelInfoUmbral = cLabelInfoUmbral;
        this.labelInfoYFinal = cLabelInfoYFinal;
        this.labelInfoSumatoria = cLabelInfoSumatoria;
        this.labelInfoFunActiv = cLabelInfoFunActiv;
        
        this.toggleEditar = cToggleEditar;
        this.panelConfig = cPanelConfig;
        //this.framePrin = cFramePrin;
                        
    
    }
    
    ///////Acciones Ventana///////////////
 
    public void AccionBotonPrueba(){       
        
        //En este método, cargamos los valores de las variables mediante los Setters,
        //estos valores están en los JCombobox de las entradas, del tipo de Compuerta lógica
        //y los valores del umbral, la constante del Umbral así como las del factor de Aprendizaje 
        //y el divisor de los números aleatorios.
                
        
        setX1(Integer.parseInt((String) comboX1.getSelectedItem()));
        setX2(Integer.parseInt((String) comboX2.getSelectedItem()));
        setUmbral(Double.parseDouble(txtUmbral.getText()));
        setConsUmbral(Double.parseDouble(txtConstUmbral.getText()));
        setFactorE (Double.parseDouble(txtFactorE.getText()));
        
        PesosAj(Double.parseDouble(txtDivisorPesos.getText()));
       
               
        LimpiarCamposNeu("0");
        
        labelX1.setText(String.valueOf(getX1()));
        labelX2.setText(String.valueOf(getX2()));
        labelUmbral.setText(String.valueOf(getUmbral()));
        labelConstUmbral.setText(String.valueOf(getConsUmbral()));
        ImprimirArr();
        labelSumatoria.setText(String.valueOf(getSumatoriaGen()));
        labelFunActiv.setText(String.valueOf(getFunAc()));
        
        //cargo los valores del umbral ya uqe este se ajusta en el proceso de aprendisaje
        this.labelUmbral.setText(String.valueOf(this.getUmbral()));
        this.txtUmbral.setText(String.valueOf(this.getUmbral()));
        
        CambiarLabelInfo();
                
    }   
    
    private void ImprimirArr(){
                        
        txtAreaConsola.setText("");
        txtAreaConsola.setForeground(Color.black);
        
        
        txtAreaConsola.append("");
        txtAreaConsola.append("***********************************\n");
        txtAreaConsola.append("Cargando Valores:\n\n");
        txtAreaConsola.append("Entrada 1= "+getX1()+"\n");
        txtAreaConsola.append("Entrada 2= "+getX2()+"\n");
        txtAreaConsola.append("Peso 1= "+getW1()+"\n");
        txtAreaConsola.append("Peso 2= "+getW2()+"\n");
        txtAreaConsola.append("Umbral= "+getUmbral()+"\n");
        txtAreaConsola.append("Constante de Umbral= "+getConsUmbral()+"\n\n");
       
        txtAreaConsola.append("Puerta Lógica Seleccionada= "+this.comboPuertaLogica.getSelectedItem()+"\n");
        txtAreaConsola.append("Resultado Esperado:\n");
        txtAreaConsola.append("[X1]   [X2]   [Y]\n");
        
        int ac = 0;
        while(ac < getArreglo().length){
                        
            txtAreaConsola.append("[" + getArreglo()[ac][0] + "]   [" + getArreglo()[ac][1]
                                     + "]   [" + getArreglo()[ac][2]+"]\n");
            ac++;
        }
        txtAreaConsola.append("***********************************\n");
       
        
        int i=0;
        int contador = 1;
        int limiteWhile=100;
        int limiteContador=9999;
        
        while(i < getArreglo().length && contador < limiteWhile){
            
            FuncSum(i, true);
            FunTanH();

            this.setY(this.getFunAc());

            double valorY  = (this.getY()>=this.getUmbral())?1:-1;

            txtAreaConsola.append("Valor[" + this.getArreglo()[i][0] + "," + this.getArreglo()[i][1]+ "]) "
                                + "Valor esperado[" + this.getArreglo()[i][2]+ "]"
                                + " Salida[" + (int) valorY + "]\n");

            if(valorY==this.getArreglo()[i][2]){

                i++;

            }else{

                FuncAjusteP(i);

                txtAreaConsola.append("Ajuste de Pesos : "+contador+"\n");
                txtAreaConsola.append("Peso 1: " + getW1()+"\n");
                txtAreaConsola.append("Peso 2: " + getW2()+"\n");
                txtAreaConsola.append("Umbral: " + getUmbral()+"\n");

                contador ++;
                i = 0;
                txtAreaConsola.append("***********************************\n");
            }    
            
        }
        
        if (contador <= limiteContador){
        
            txtAreaConsola.append("\nFase de aprendizaje terminado con exito "+"\n");
            txtAreaConsola.append("\nResultados:"+"\n");
            txtAreaConsola.append("w1: " + getW1()+"\n");
            txtAreaConsola.append("w2: " + getW2()+"\n");
            txtAreaConsola.append("Umbral: " + getUmbral()+"\n");
            txtAreaConsola.append("\nSalida lógica hallada:"+"\n");
            
            FuncSum(i, false);
            FunTanH();
            
            setY(this.getFunAc());
                                               
            double valorYDef = (this.getY() >= this.getUmbral()) ? 1 : -1;

            txtAreaConsola.append("\nSalida: " + (int)valorYDef+"\n");
            labelYFinal.setText(String.valueOf((int)valorYDef));
            
        }else{
        
           txtAreaConsola.append("\nfase de testeo ha fallado"+"\n");
            
        }
        
        //cargo el valor de los pesos despues de ajustarlos
        labelW1.setText(String.valueOf(getW1()));
        labelW2.setText(String.valueOf(getW2()));
        
    }
    
    private void CambiarLabelInfo(){
    
        labelInfoX1.setText(String.valueOf(getX1()));
        labelInfoX2.setText(String.valueOf(getX2()));
        labelInfoW1.setText(String.valueOf(getW1()));
        labelInfoW2.setText(String.valueOf(getW2()));
        labelInfoSumatoria.setText(String.valueOf(getSumatoriaGen()));
        labelInfoFunActiv.setText(String.valueOf(getFunAc()));
        
        //cambio el valor de la label de información
        int valFy = (getY()>0)? 1:-1;
        
        labelInfoYFinal.setText(String.valueOf(valFy));
    
    }
    
    private void LimpiarCamposNeu(String valor){

           labelX1.setText(valor);
           labelX2.setText(valor);
           labelUmbral.setText(valor);
           labelConstUmbral.setText(valor);
           labelW1.setText(valor);
           labelW2.setText(valor);
           labelYFinal.setText(valor);
           
    }
   
      
    public void EditarCampos(String mensaje,boolean decision){
        
        Color colFonts = new Color (240,240,240);
        Color colPrin = new Color(0,0,0);
        Color colEdit = new Color (51,255,51);
        
        if (txtUmbral.getText().isEmpty()||txtConstUmbral.getText().isEmpty()||txtFactorE.getText().isEmpty()||txtDivisorPesos.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "No puede dejar campos en blanco!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtUmbral.setText("-0.4");
            txtConstUmbral.setText("-1");
            txtFactorE.setText("0.6");
            txtDivisorPesos.setText("2.5");

        }else{

            toggleEditar.setText(mensaje);            
            txtUmbral.setEditable(decision);
            txtConstUmbral.setEditable(decision);
            txtFactorE.setEditable(decision);
            txtDivisorPesos.setEditable(decision);
            
            if (decision == true){
                
                panelConfig.setBackground(colEdit);    
                txtUmbral.setBackground(Color.white);
                txtUmbral.setForeground(Color.black);
                txtConstUmbral.setBackground(Color.white);
                txtConstUmbral.setForeground(Color.black);
                txtFactorE.setBackground(Color.white);
                txtFactorE.setForeground(Color.black);
                txtDivisorPesos.setBackground(Color.white);
                txtDivisorPesos.setForeground(Color.black);
                toggleEditar.setBackground(Color.white);
                toggleEditar.setForeground(Color.BLACK);
        
            }else{
                
                panelConfig.setBackground(colPrin); 
                txtUmbral.setBackground(Color.black);
                txtUmbral.setForeground(colFonts);
                txtConstUmbral.setBackground(Color.black);
                txtConstUmbral.setForeground(colFonts);
                txtFactorE.setBackground(Color.black);
                txtFactorE.setForeground(colFonts);
                txtDivisorPesos.setBackground(Color.black);
                txtDivisorPesos.setForeground(colFonts);
                toggleEditar.setBackground(Color.BLACK);
                toggleEditar.setForeground(Color.white);

            }

        }
        
    }
    
    /*
    public void CambiarIcono(Image icon) {
                
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Icono.png"));
        this.framePrin.setIconImage(icon);
                
    }
    */
    ///////Acciones Ventana///////////////
    
    
    
    ///////////Cálculos////////////

    /// calculo Sumatoria
    
    //////
    private void PesosAj(double factorDiv){
    
        setW1(new Random().nextDouble()/factorDiv);
        setW2(new Random().nextDouble()/factorDiv);
    
    }
    ////////////
    
    private void FuncSum(int i, boolean desSum){
        
        int x1Local;
        int x2Local;
        if (desSum == true){
        
            x1Local = this.getArreglo()[i][0];
            x2Local = this.getArreglo()[i][1];
        
        }else{
        
            x1Local = this.getX1();
            x2Local = this.getX2();
        
        }
                   
        this.setSumatoriaGen(((x1Local * this.getW1()) + (x2Local * this.getW2()) + (this.getConsUmbral() * this.getUmbral())));
                        
    }
        
    ///calculo TangenteH
    private void FunTanH(){
            
        this.setFuncAc(Math.tanh(this.getSumatoriaGen()));
                                    
    }
         
    ///Ajuste de Pesos
        
    private void FuncAjusteP(int i){
                      
        this.setW1(this.getW1() + 2 * this.getFactorE() * this.getArreglo()[i][2] * this.getArreglo()[i][0]);
        this.setW2(this.getW2() + 2 * this.getFactorE() * this.getArreglo()[i][2] * this.getArreglo()[i][1]);
        this.setUmbral(this.getUmbral() + 2 * this.getFactorE() * this.getArreglo()[i][2] * this.getConsUmbral());
    }
    
       
    ///////////Cálculos////////////
    
    ///Getters y Setters 
    
    public void setArreglo(int[][] sArreglo){
    
        this.arreglo = sArreglo;
        
    }
    
    public int[][] getArreglo(){
        
        if(comboPuertaLogica.getSelectedItem().equals("AND")){//con esto evito poner mas ifs y siempre sé que arreglo pide el usuario
           
            setArreglo(arrAnd);
        
        }else{
        
            setArreglo(arrOr);
        }
                       
        return this.arreglo;
        
    }
    
 
    //____________//
    
    public void setX1(int sX1){
    
        this.x1 = sX1;
        
    }
    
    public int getX1(){
    
        return this.x1;
        
    }
    
    //____________//
    
    public void setX2(int sX2){
    
        this.x2 = sX2;
        
    }
    
    public int getX2(){
    
        return this.x2;
        
    }
    
    //____________//
    
    public void setW1(double sW1){
    
        this.w1 = sW1;
        
    }
    
    public double getW1(){
    
        return this.w1;
        
    }
    
    //____________//
    
     public void setW2(double sW2){
    
        this.w2 = sW2;
        
    }
    
    public double getW2(){
    
        return this.w2;
        
    }
    
    //____________//
    
     public void setUmbral(double sUmbral){
    
        this.umbral = sUmbral;
        
    }
    
    public double getUmbral(){
    
        return this.umbral;
        
    }
    
    //____________//
    
    public void setConsUmbral(double sConsUmbral){
    
        this.constUmbral = sConsUmbral;
        
    }
    
    public double getConsUmbral(){
    
        return this.constUmbral;
        
    }
    
    //____________//
    
    public void setFactorE(double sFactorE){
    
        this.factorE = sFactorE;
        
    }
    
    public double getFactorE(){
    
        return this.factorE;
        
    }
    
    //____________//
    
    public void setY(double sY){
    
        this.y = sY;
        
    }
    
    public double getY(){
    
        return this.y;
        
    }
    
    //____________//
    
    public void setSumatoriaGen(double sGen){
    
        this.sumatoriaGen = sGen;
        
    }
    
    public double getSumatoriaGen(){
    
        return this.sumatoriaGen;
    
    }
    
      //____________//
    
    public void setFuncAc(double sFunAc){
    
        this.funcionActiv = sFunAc;
        
    }
    
    public double getFunAc(){
    
        return this.funcionActiv;
    
    }
    
  
    public static void main(String[] args) {
       
        Ventana_Neu vn = new Ventana_Neu();
        
        vn.setVisible(true);
        
    }
    
}
