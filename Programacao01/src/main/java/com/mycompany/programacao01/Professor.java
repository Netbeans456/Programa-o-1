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
public class Professor {
    private String nomeProfessor;
    private String siape;
    private String email;
    private String telefone;
    private String titulacaoAcademica;
    private String areaAtuacao;
    private String regimeTrabalho;
    private Date anoIngresso;
    private String formacao;
    
    public Professor(){
        nomeProfessor = "Nobody";
    }
    
    //Nome profesor
    public String getNomelunoProfessot(){
        return nomeProfessor;
        
    }
    
    public void setNomeprofessor(String _nomeProfessor){
        nomeProfessor = _nomeProfessor;
    }
    
    //SIAPE
    public String getSiape(){
        return siape;
    }
    
    public void setSiape(String _siape){
        siape = _siape;
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
    
    //titulacaoAcademica
    public String getTitulacaoAcademica(){
        return titulacaoAcademica;
    }
    
    public void SetTitulacaoAcademica(String _titulacaoAcademica){
        titulacaoAcademica = _titulacaoAcademica;
    }
    
    //areaAtuacao
    public String getAreaAtuacao(){
        return areaAtuacao;
    }
    
    public void setAreaAtuacao(String _areaAtuacao){
        areaAtuacao = _areaAtuacao;
    }
    
    //regimeTrabalho
    public String getRegimeTrabalho(){
        return regimeTrabalho;
    }
    
    public void setRegimeTrabalho(String _regimeTrabalho){
        regimeTrabalho = _regimeTrabalho;
    }
    
    //anoIngresso
    public Date getAnoIngresso(){
        return anoIngresso;
    }
    
    public void setAnoIngresso(Date _anoIngresso){
        anoIngresso = _anoIngresso;
    }
    
    //formacao
    public String getFormacao(){
       return formacao; 
    }
    
    public void setFormacao(String _formacao){
        formacao = _formacao;
    }
}
