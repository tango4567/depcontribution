/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepak;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ultra
 */
public class FormInAwt extends Frame {

    File user;
    String path, filepath,filetype=".txt";
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;
    FileReader fileReader;
    FileWriter fileWriter;

    public void Form() throws FileNotFoundException, IOException {
        setSize(500, 500);
        setBackground(Color.cyan);
        Label name = new Label("Full Name : -");
        name.setBounds(20, 80, 90, 30);
        TextField textFieldname = new TextField();
        textFieldname.setBounds(130, 80, 110, 30);
        Label Father = new Label("Father Name : -");
        Father.setBounds(20, 120, 90, 30);
        TextField textFielfather = new TextField();
        textFielfather.setBounds(130, 120, 110, 30);
        Label birthdate = new Label("date of Birth : -");
        birthdate.setBounds(20, 160, 90, 30);
        TextField textFielddob = new TextField();
        textFielddob.setBounds(130, 160, 110, 30);
        Label Gender = new Label("gender (M/F) : -");
        Gender.setBounds(20, 200, 90, 30);
        TextField textFieldgender = new TextField();
        textFieldgender.setBounds(130, 200, 110, 30);
        Button done = new Button("Done");
        done.setBounds(80, 250, 70, 30);
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    path = "C:\\Users\\ultra\\Desktop\\myproject\\";
                    filepath = path.concat(textFieldname.getText()).concat(filetype);
                    user = new File(filepath);
                    try {
                        user.createNewFile();
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    try {
                        fileReader = new FileReader(user);
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex);
                    }

                    fileWriter = new FileWriter(user);
                    bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedReader = new BufferedReader(fileReader);
                    bufferedWriter.append("Full Name :- "+textFieldname.getText());
                    bufferedWriter.newLine();
                    bufferedWriter.append("Father Name :- "+textFielfather.getText());
                    bufferedWriter.newLine();
                    bufferedWriter.append("Date Of Birth :- "+textFielddob.getText());
                    bufferedWriter.newLine();
                    bufferedWriter.append("Gender :- "+textFieldgender.getText());
                    bufferedWriter.newLine();
                    System.out.println(textFieldname.getText());
                    System.out.println(textFielfather.getText());
                    System.out.println(textFielddob.getText());
                    System.out.println(textFieldgender.getText());
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    fileWriter.close();
                    fileReader.close();
                    bufferedReader.close();
                    textFielddob.setText("");
                    textFieldgender.setText("");
                    textFieldname.setText("");
                    textFielfather.setText("");
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        add(name);
        add(textFieldname);
        add(Father);
        add(textFielfather);
        add(birthdate);
        add(textFielddob);
        add(Gender);
        add(textFieldgender);
        add(done);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        FormInAwt form = new FormInAwt();
        form.Form();
    }
}
