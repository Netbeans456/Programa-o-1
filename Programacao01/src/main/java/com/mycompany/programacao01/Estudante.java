/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {
    private String nome;
    private Date dataDeNascimento;
    private String cpf;
    private char genero;
    private String matriculado;
    private String email;
    
    public Estudante(){
        nome = "Nobody";
    }
    
    private int obterIdade(Date hoje) {
        int idade = 0;
        return idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String _nome){
        nome = _nome;
    }
    
    public Date getDataDeacimento(){
        return dataDeNascimento;
    }
    
    public void setDataDeNascimeto(Date _dataDeNacimento){
        dataDeNascimento = _dataDeNacimento;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public void setCPF(String _cpf){
        cpf = _cpf;
    }
    
    public char getGenero(){
        return genero;
    }
    
    public void setGenero(char _genero){
        genero = _genero;
    }
    
    public String getMatriculado(){
        return matriculado;
    }
    
    public void setGenero(String _matriculado){
        matriculado = _matriculado;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String _email){
        email = _email;
    }
    
    sout
}
