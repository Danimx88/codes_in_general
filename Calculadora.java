package ventana;
import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {

    JButton btnSuma, btnResta, btnMult, btnDiv,
            igual, limpiar, nueve, ocho, siete, seis, cinco, cuatro, tres,
            dos, uno, btncero;
    private JTextField textfield;

    public int num1, resultado;
    public String oper = "nula", cadenaNum = "";
    private boolean activado = false;

    
    public Calculadora() {
        setTitle("Mi Calculadora");
        setSize(390, 460);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textfield = new JTextField();
        textfield.setBounds(15, 10, 345, 50);
        add(textfield);

        btnSuma = new JButton("+");
        btnSuma.setBounds(278, 70, 80, 80);
        add(btnSuma);
        btnSuma.addActionListener(this);

        btnResta = new JButton("-");
        btnResta.setBounds(278, 155, 80, 80);
        add(btnResta);
        btnResta.addActionListener(this);

        btnMult = new JButton("*");
        btnMult.setBounds(278, 240, 80, 80);
        add(btnMult);
        btnMult.addActionListener(this);

        btnDiv = new JButton("/");
        btnDiv.setBounds(278, 325, 80, 80);
        add(btnDiv);
        btnDiv.addActionListener(this);

        tres = new JButton("3");
        tres.setBounds(191, 70, 80, 80);
        add(tres);
        tres.addActionListener(this);

        seis = new JButton("6");
        seis.setBounds(191, 155, 80, 80);
        add(seis);
        seis.addActionListener(this);

        nueve = new JButton("9");
        nueve.setBounds(191, 240, 80, 80);
        add(nueve);
        nueve.addActionListener(this);

        igual = new JButton("=");
        igual.setBounds(191, 325, 80, 80);
        add(igual);
        igual.addActionListener(this);

        dos = new JButton("2");
        dos.setBounds(103, 70, 80, 80);
        add(dos);
        dos.addActionListener(this);;

        cinco = new JButton("5");
        cinco.setBounds(103, 155, 80, 80);
        add(cinco);
        cinco.addActionListener(this);

        ocho = new JButton("8");
        ocho.setBounds(103, 240, 80, 80);
        add(ocho);
        ocho.addActionListener(this);

        btncero = new JButton("0");
        btncero.setBounds(103, 325, 80, 80);
        add(btncero);
        btncero.addActionListener(this);

        uno = new JButton("1");
        uno.setBounds(15, 70, 80, 80);
        add(uno);
        uno.addActionListener(this);

        cuatro = new JButton("4");
        cuatro.setBounds(15, 155, 80, 80);
        add(cuatro);
        cuatro.addActionListener(this);

        siete = new JButton("7");
        siete.setBounds(15, 240, 80, 80);
        add(siete);
        siete.addActionListener(this);

        limpiar = new JButton("C");
        limpiar.setBounds(15, 325, 80, 80);
        add(limpiar);
        limpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == uno) {
            cadenaNum += "1";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == dos) {
            cadenaNum += "2";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == tres) {
            cadenaNum += "3";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == cuatro) {
            cadenaNum += "4";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == cinco) {
            cadenaNum += "5";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == seis) {
            cadenaNum += "6";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == siete) {
            cadenaNum += "7";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == ocho) {
            cadenaNum += "8";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == nueve) {
            cadenaNum += "9";
            textfield.setText(cadenaNum);
            activado = true;
        }
        if (e.getSource() == btncero) {
            if (cadenaNum != "" || cadenaNum != oper && num1>0) {
                cadenaNum += "0";
                textfield.setText(cadenaNum);
                activado = true;
            }
        }
        if(e.getSource()==limpiar){
            if(cadenaNum ==""){
               activado = false; 
            }
            cadenaNum ="";
            textfield.setText("");
        }
        if(e.getSource()==btnSuma){
            if(cadenaNum==""){
                activado = false;
            }
            if(activado == true){
                num1 = Integer.parseInt(cadenaNum);
                textfield.setText("+");
                cadenaNum = "";
                oper="sumar";
                
                activado = false;
            }
        }
        if(e.getSource()==btnResta){
            if(cadenaNum==""){
                activado = false;
            }
            if(activado == true){
                num1 = Integer.parseInt(cadenaNum);
                textfield.setText("-");
                cadenaNum = "";
                oper="restar";
                
                activado = false;
            }
        }
        if (e.getSource() == btnMult) {
            if (cadenaNum == "") {
                activado = false;
            }
            if (activado == true) {
                num1 = Integer.parseInt(cadenaNum);
                textfield.setText("*");
                cadenaNum = "";
                oper = "multiplicar";
            }
        }
        if (e.getSource() == btnDiv) {
            if (cadenaNum == "") {
                activado = false;
            }
            if (activado == true) {
                num1 = Integer.parseInt(cadenaNum);
                textfield.setText("/");
                cadenaNum = "";
                oper = "dividir";
            }
        }
        if(e.getSource()==igual){
            
            int num2;
            num2 = Integer.parseInt(cadenaNum);
            if(activado == true){
                if(oper.equals("nula")){
                    textfield.setText(cadenaNum);
                }else if(oper.equals("sumar")){
                    resultado = num1 + num2;
                    textfield.setText(String.valueOf(resultado));
                    cadenaNum = String.valueOf(resultado);
                    activado = true;
                    oper = "nula";
                }else if (oper.equals("restar")) {
                    resultado = num1 - num2;
                    textfield.setText(String.valueOf(resultado));
                    cadenaNum = String.valueOf(resultado);
                    activado = true;
                    oper = "nula";
                } else if (oper.equals("multiplicar")) {
                    resultado = num1 * num2;
                    textfield.setText(String.valueOf(resultado));
                    cadenaNum = String.valueOf(resultado);
                    activado = true;
                    oper = "nula";
                } else if(oper.equals("dividir")){
                    if(num2!=0){
                        resultado = num1 / num2;
                        textfield.setText(String.valueOf(resultado));
                        activado = true;
                        oper = "nula";
                        cadenaNum="";
                    }else{
                        String mensaje = "El segundo numero tiene que ser diferente de cero";
                        textfield.setText(mensaje);
                        cadenaNum="";
                    }
                }
            }
          
            activado = false;
        }
    }

}
