/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;
/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{
        
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model)
    {
        this.view = view;
        this.model = model;
        this.view.b1.addActionListener(this);
    }
    
    public void iniciar()
    {
        view.setTitle("MVC Sumar");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        model.setNumeroUno(Integer.parseInt(view.f1.getText()));
        model.setNumeroDos(Integer.parseInt(view.f2.getText()));
        model.sumar();
        view.f3.setText(String.valueOf(model.getResultado()));
    }
}


