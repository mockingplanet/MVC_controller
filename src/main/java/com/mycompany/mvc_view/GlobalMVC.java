/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc_view;

/**
 *
 * @author alu10711158
 */
public class GlobalMVC {
    
    public static void main(String args[]) {
        MVC_Model m = new MVC_Model();
        MVC_View v = new MVC_View();
        new MVC_Controller(v, m);
    }
}
