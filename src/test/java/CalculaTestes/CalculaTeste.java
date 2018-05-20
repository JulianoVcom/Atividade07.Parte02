/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaTestes;

import java.util.List;
import jrr.atividade07.parte02.Calcula;
import jrr.atividade07.parte02.Vetor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juliano
 */
public class CalculaTeste {
    
    public CalculaTeste() {
    }
    
   
    @Test
    public void testMedianaValoresVetor() {
        int PosMediana;
        double valorPosmediana;
        
        Calcula calculo = new Calcula();
        Vetor vet = new Vetor();
                         
        vet.addValoresDoVetor(2.0);
        vet.addValoresDoVetor(5.0);
        vet.addValoresDoVetor(8.0);
        vet.addValoresDoVetor(9.0);
        vet.addValoresDoVetor(9.5);
                
        PosMediana = calculo.getMedianaValoresVetor(vet);
        valorPosmediana = vet.getValoresDoVetorPosN(PosMediana);
                
        assertEquals(8.0, valorPosmediana, 0.01);
    }    
    
}