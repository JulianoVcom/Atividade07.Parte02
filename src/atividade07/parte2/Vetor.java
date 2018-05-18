/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade07.parte2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author juliano
 */
public class Vetor {
    
    private List<Double> VetorDeValores = new ArrayList<>();

    public Vetor() {

    }


    public List<Double> getVetorDeValores() {
        return VetorDeValores;
    }

    public void setVetorDeValores(List<Double> VetorDeValores) {
        this.VetorDeValores = VetorDeValores;
    }


    public void addValoresDoVetor(double pValor) {
        VetorDeValores.add(pValor);
    }
    
    public int getQtdeValoresDoVetor() {
        return VetorDeValores.size();
    }

     public double getValoresDoVetorPosN(int pPos) {
        return VetorDeValores.get(pPos).doubleValue();
    }
}    
