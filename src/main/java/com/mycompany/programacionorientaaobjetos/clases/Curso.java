/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionorientaaobjetos.clases;

/**
 *
 * @author User
 */
public class Curso {
    private String nombre;
    private String paralelo;
    
    //Constructor

    public Curso() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }
    

    
    public void agregarEstudiante (Estudiantes objEstudiante){
        
        System.out.println("El estudiante " + objEstudiante.getNombre()+ " " + objEstudiante.getApellido() + " esta agregado en" + " el curso" + this.nombre );
}
    
}
