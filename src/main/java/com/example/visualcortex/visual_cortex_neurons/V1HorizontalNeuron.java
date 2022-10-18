/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.visualcortex.visual_cortex_neurons;

/**
 *
 * @author umid
 */
public class V1HorizontalNeuron extends V1_Neuron{
    
     public void activate(Neuron cortex1, Neuron cortex2, Neuron cortex3){
        if (cortex1.getFlag() == 1 && cortex2.getFlag() == 1 && cortex3.getFlag() == 1)
            this.setFlag(1);
        else
            this.setFlag(0);
    }
}
