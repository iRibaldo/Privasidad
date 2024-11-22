/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacionorientaaobjetos;

import com.mycompany.programacionorientaaobjetos.clases.Curso;
import com.mycompany.programacionorientaaobjetos.clases.Estudiantes;

/**
 *
 * @author User
 */
public class Programacionorientaaobjetos {

    public static void main(String[] args) {
        
        Estudiantes objEstudiante = new Estudiantes ();
        
        objEstudiante.setNombre("Ribaldo Lenin");
        objEstudiante.setApellido("Nantip Barre");
        
        Curso objCursos = new Curso ();
        
        objCursos.setNombre(" Programacion orientada a Objetos");
        
        objCursos.agregarEstudiante(objEstudiante);
                
    
    }
}
