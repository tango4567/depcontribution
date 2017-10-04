/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepak;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ultra
 */
public class Calculater extends Frame implements ActionListener {

    Button clear, div, sub, mult, addition, one, two, three, four, five, six, sevan, eigth, nine, zero, enter, dot,hishtry;
    TextField inputText;
    String v1[] = new String[3];
    // two type int and  fload
    String type[] = new String[2];
    String histryarr[] = new String[10];
    static int i =0;
    public void init() {
        this.setSize(215, 400);
        setBackground(Color.pink);

        inputText = new TextField("");
        inputText.setBounds(10, 60, 175, 70);

        hishtry = new Button("Histry");
        hishtry.setBounds(10, 20, 80, 30);
        hishtry.setActionCommand("Histry");
        hishtry.addActionListener(this);

        clear = new Button("C");
        clear.setBounds(10, 155, 40, 40);
        clear.setActionCommand("c");
        clear.addActionListener(this);

        div = new Button("/");
        div.setBounds(55, 155, 40, 40);
        div.setActionCommand("/");
        div.addActionListener(this);

        sub = new Button("-");
        sub.setBounds(145, 155, 40, 40);
        sub.setActionCommand("-");
        sub.addActionListener(this);

        addition = new Button("+");
        addition.setBounds(145, 200, 40, 85);
        addition.setActionCommand("+");
        addition.addActionListener(this);

        enter = new Button("Enter");
        enter.setBounds(145, 290, 40, 85);
        enter.setActionCommand("Enter");
        enter.addActionListener(this);

        mult = new Button("*");
        mult.setBounds(100, 155, 40, 40);
        mult.setActionCommand("*");
        mult.addActionListener(this);

        nine = new Button("9");
        nine.setBounds(100, 200, 40, 40);
        nine.setActionCommand("9");
        nine.addActionListener(this);

        eigth = new Button("8");
        eigth.setBounds(55, 200, 40, 40);
        eigth.setActionCommand("8");
        eigth.addActionListener(this);

        sevan = new Button("7");
        sevan.setBounds(10, 200, 40, 40);
        sevan.setActionCommand("7");
        sevan.addActionListener(this);

        six = new Button("6");
        six.setBounds(100, 245, 40, 40);
        six.setActionCommand("6");
        six.addActionListener(this);

        five = new Button("5");
        five.setBounds(55, 245, 40, 40);
        five.setActionCommand("5");
        five.addActionListener(this);

        four = new Button("4");
        four.setBounds(10, 245, 40, 40);
        four.setActionCommand("4");
        four.addActionListener(this);

        three = new Button("3");
        three.setBounds(100, 290, 40, 40);
        three.setActionCommand("3");
        three.addActionListener(this);

        two = new Button("2");
        two.setBounds(55, 290, 40, 40);
        two.setActionCommand("2");
        two.addActionListener(this);

        one = new Button("1");
        one.setBounds(10, 290, 40, 40);
        one.setActionCommand("1");
        one.addActionListener(this);

        zero = new Button("0");
        zero.setBounds(10, 335, 85, 40);
        zero.setActionCommand("0");
        zero.addActionListener(this);

        dot = new Button(".");
        dot.setBounds(100, 335, 40, 40);
        dot.setActionCommand(".");
        dot.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });

        setLayout(null);
        add(hishtry);
        add(clear);
        add(dot);
        add(addition);
        add(enter);
        add(mult);
        add(div);
        add(sub);
        add(zero);
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(sevan);
        add(eigth);
        add(nine);
        add(inputText);
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculater cal = new Calculater();
        cal.init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Histry":
                for(i = 0;i<10;i++){
                    System.out.println(histryarr[i]);
                        }
                break;
            case "c":
                inputText.setText("");
                break;
            case "1":
                inputText.setText(getInputValue(inputText) + "1");
                break;
            case "2":
                inputText.setText(getInputValue(inputText) + "2");
                break;
            case "3":
                inputText.setText(getInputValue(inputText) + "3");
                break;
            case "4":
                inputText.setText(getInputValue(inputText) + "4");
                break;
            case "5":
                inputText.setText(getInputValue(inputText) + "5");
                break;
            case "6":
                inputText.setText(getInputValue(inputText) + "6");
                break;
            case "7":
                inputText.setText(getInputValue(inputText) + "7");
                break;
            case "8":
                inputText.setText(getInputValue(inputText) + "8");
                break;
            case "9":
                inputText.setText(getInputValue(inputText) + "9");
                break;
            case "0":
                inputText.setText(getInputValue(inputText) + "0");
                break;
            case "-":
                v1[0] = "";
                v1[2] = "-";
                v1[0] = getInputValue(inputText);
                inputText.setText(getInputValue(inputText) + "-");
                type[0] = idValue(v1[0]);
                inputText.setText("");
                break;
            case "+":
                v1[0] = "";
                v1[2] = "+";
                v1[0] = getInputValue(inputText);
                type[0] = idValue(v1[0]);
                inputText.setText(getInputValue(inputText) + "+");
                inputText.setText("");

                break;
            case "*":
                v1[0] = "";
                v1[2] = "*";
                v1[0] = getInputValue(inputText);
                type[0] = idValue(v1[0]);
                inputText.setText(getInputValue(inputText) + "*");
                inputText.setText("");
                break;
            case "/":
                v1[0] = "";
                v1[2] = "/";
                v1[0] = getInputValue(inputText);
                type[0] = idValue(v1[0]);
                inputText.setText(getInputValue(inputText) + "/");
                inputText.setText("");
                break;
            case ".":
                inputText.setText(getInputValue(inputText) + ".");
                break;
            case "Enter":
                // operation  nested switch 
                       
                switch (v1[2]) {
                    case "+":
                        v1[1] = "";
                        v1[1] = getInputValue(inputText);
                        type[1] = idValue(v1[1]);

                        inputText.setText(getInputValue(inputText) + "+");
                        if ((type[0] == "I") && (type[1] == "I")) {
                           inputText.setText(String.valueOf(convertValue(v1[0])
                                    + convertValue(v1[1])));
                        
                        } else {
                            inputText.setText(String.valueOf(convertValueDouble(v1[0])
                                    + convertValueDouble(v1[1])));
                        }

                        break;

                    case "-":
                        v1[1] = "";
                        v1[1] = getInputValue(inputText);
                        type[1] = idValue(v1[1]);

                        inputText.setText(getInputValue(inputText) + "-");
                        if ((type[0] == "I") && (type[1] == "I")) {
                            inputText.setText(String.valueOf(convertValue(v1[0])
                                    - convertValue(v1[1])));
                        } else {
                            inputText.setText(String.valueOf(convertValueDouble(v1[0])
                                    - convertValueDouble(v1[1])));
                        }
                        break;

                    case "*":
                        v1[1] = "";
                        v1[1] = getInputValue(inputText);
                        type[1] = idValue(v1[1]);

                        inputText.setText(getInputValue(inputText) + "*");
                        if ((type[0] == "I") && (type[1] == "I")) {
                            inputText.setText(String.valueOf(convertValue(v1[0])
                                    * convertValue(v1[1])));
                        } else {
                            inputText.setText(String.valueOf(convertValueDouble(v1[0])
                                    * convertValueDouble(v1[1])));
                        }
                        break;

                    case "/":
                        v1[1] = "";
                        v1[1] = getInputValue(inputText);
                        type[1] = idValue(v1[1]);

                        inputText.setText(getInputValue(inputText) + "/");
                        if ((type[0] == "I") && (type[1] == "I")) {
                            inputText.setText(String.valueOf(convertValue(v1[0])
                                    / convertValue(v1[1])));
                        } else {
                            inputText.setText(String.valueOf(convertValueDouble(v1[0])
                                    / convertValueDouble(v1[1])));
                        }
                        break;
                }
                
                 for (i = i; i <= i;) {
                         histryarr[i]=inputText.getText();
                    System.out.println(inputText.getText());
                        i++;
                        break;
                    }

                break;

        }
    }

    public String getInputValue(TextField field) {
        String tempValues = field.getText();
        return tempValues;
    }

    public int convertValue(String value) {
        int i = Integer.parseInt(value);
        return i;
    }

    public static String idValue(String value) {
        String tempString = "I";
        if (value.contains(".")) {
            tempString = "D";
        } else {
            tempString = "I";
        }

        return tempString;
    }

    public static double convertValueDouble(String value) {
        double i = Double.parseDouble(value);
        return i;
    }
    
}
