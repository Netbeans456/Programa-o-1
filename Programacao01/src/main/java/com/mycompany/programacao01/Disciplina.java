/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class Disciplina {
    private String codigoDiciplina;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String ementa;
    private String objetivos;
    
    //codigoDiciplina
    public String getCodigoDisciplina(){
        return codigoDiciplina;
    }
    
    public void setCodigoDiciplina(String _codigoDiciplina){
        codigoDiciplina = _codigoDiciplina;
    }
    
    //nomeDisciplina
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    
    public void setNomeDisciplina(String _nomeDisciplina){
        nomeDisciplina = _nomeDisciplina;
    }
    
    //cargaHoraria
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int _cargaHoraria){
        cargaHoraria = _cargaHoraria;
    }
    
    //ementa
    public String getEmenta(){
        return ementa;
    }
    
    public void setEmenta(String _ementa){
        ementa = _ementa;
    }
    
    //objetivos
    public String getObjetivos(){
        return objetivos;
    }
    
    public void setObjetivos(String _objetivos){
        objetivos = _objetivos;
    }
}

