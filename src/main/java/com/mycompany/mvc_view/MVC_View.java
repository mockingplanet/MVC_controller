/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mvc_view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alu10711158
 */
public class MVC_View {

Container con;
JButton addButton;
JTextField textField1,textField2,textFieldresult;
JLabel first,second,result;

public MVC_View() {
        con = getContentPane();
        setTitle("MVC ADD");
        setLayout(new FlowLayout());
        setSize(220, 200);
        first = new JLabel("first variable");
        textField1 = new JTextField("", 10);
        second = new JLabel("second variable");
        textField2 = new JTextField("", 8);
        result = new JLabel("result");
        textFieldresult = new JTextField("", 13);
        addButton = new JButton("add");
        con.add(first);
        con.add(textField1);
        con.add(second);
        con.add(textField2);
        con.add(result);
        con.add(textFieldresult);
        con.add(addButton);
        setVisible(true);
    }



    private void setTitle(String title) {
        this.setTitle(title);
        
    }

    private void setSize(int i, int i0) {
        this.setSize(i, i0);
    }

    private void setVisible(boolean b) {
        this.setVisible(b);
    }

    private void setLayout(FlowLayout flowLayout) {
        this.setLayout(flowLayout);
    }
    
    private Container getContentPane() {
        return this.getContentPane();
    }


    
    public String getValue1() {
        return textField1.getText();
    }
    
    public String getValue2() {
        return textField2.getText();
    }
    
    public void setResult(String s) {
        textFieldresult.setText(s);
    }
    
    public void setActionListener(ActionListener act) {
        addButton.addActionListener(act);
    }


}
