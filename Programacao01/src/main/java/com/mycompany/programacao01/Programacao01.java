/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class Programacao01 {

    public static void main(String[] args) {
        Estudante camada = new Estudante();
        Estudante joao = new Estudante();
        Estudante miguel = new Estudante();
        
        camada.setNome("Marcos");
        joao.setNome("joadojesc");
        miguel.setNome("migdojesc");
        
        System.out.println(camada.getNome());
        System.out.println(joao.getNome());
        System.out.println(miguel.getNome());
        
    }
    
    
}
