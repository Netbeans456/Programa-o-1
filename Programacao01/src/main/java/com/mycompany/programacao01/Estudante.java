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
    
    private String nomeAluno;
    private Date dataDeNascimento;
    private String cpf;
    private char genero;
    private String email;
    private String nivelEnsino;
    private String telefone;
    private int anoIngresso;
    private int semetreIngresso;
    private String situacaoAcademica;
    private String digito;
    
    public Estudante(){
        this.nomeAluno = "Nobody";
        
    }
    
    private int obterIdade(Date hoje) {
        int idade = 0;
        return idade;
    }
    //Nome aluno
    public String getNomeAluno(){
        return nomeAluno;
        
    }
    
    public void setNomeAluno(String _nome){
        nomeAluno = _nome;
    }
    
    //data
    public Date getDataDeacimento(){
        return dataDeNascimento;
    }
    
    public void setDataDeNascimeto(Date _dataDeNacimento){
        dataDeNascimento = _dataDeNacimento;
    }
    
    //cpf
    public String getCPF(){
        return cpf;
    }
    
    public void setCPF(String _cpf){
        cpf = _cpf;
    }
    
    //genero
    public char getGenero(){
        return genero;
    }
    
    public void setGenero(char _genero){
        genero = _genero;
    }
    
    //metricula
    public String getMatricula(){
        return String.valueOf(anoIngresso)+String.valueOf(semetreIngresso)+digito;
    }
    
    public void setGenero(String _digito){
        digito = _digito;
    }
    
    //email
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String _email){
        email = _email;
    }
    
    //telefone
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String _telefone){
        telefone = _telefone;
    }
    
    //nivel de ensino
    public String getNivelEnsino(){
        return nivelEnsino;
    }
    
    public void setNivelEnsino(String _nivelEnsino){
        nivelEnsino = _nivelEnsino;
    }
    
    //Situacao Academica
    public String getSituacaoAcademica(){
        return situacaoAcademica;
    }
    
    public void setSituacaoAcademica(String _situacaoAcademica){
        situacaoAcademica = _situacaoAcademica;
    }
}
