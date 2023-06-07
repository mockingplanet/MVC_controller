/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alu10711158
 */
public class MVC_Controller implements ActionListener{

    private  MVC_View view;
    private MVC_Model model;
    private int result = 0;

    public MVC_Controller(MVC_View v, MVC_Model m) {
        view = v;
        model = m;
        view.setActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        try {
            String a = view.getValue1();
            String b = view.getValue2();
            
            result = model.add(a, b);
            
            updateView();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void updateView() {
        view.setResult("" + result);
    }
    
    
    
}
