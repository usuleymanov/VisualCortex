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
public class V2OneHundrenAndEightyAngleDetectorNeuron extends V2Neuron{
    
    public void activate(Neuron horizontal_neuron, Neuron vertical_neuron){
        if (horizontal_neuron.getFlag() == 1 &&  vertical_neuron.getFlag() == 1)
            this.setFlag(1);
        else
            this.setFlag(0); 
                 
    }
}
