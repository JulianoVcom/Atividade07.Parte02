/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrr.atividade07.parte02;

/**
 * @author juliano
 */
public class Calcula {
     Vetor vet;

//Retorna a mediana de valores de um vetor
public int getMedianaValoresVetor(Vetor vet) {
    int medianaValores = 0;
    
    medianaValores = vet.getQtdeValoresDoVetor() / 2;
    
    return medianaValores;
}
    
}
