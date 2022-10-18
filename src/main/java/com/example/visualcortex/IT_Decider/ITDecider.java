
package com.example.visualcortex.IT_Decider;

import com.example.visualcortex.visual_cortex_neurons.Neuron;

/**
 *
 * @author umid
 */
public class ITDecider {
    
    public int decide(Neuron[] v4Neurons){
        
        for (int i = 0; i < v4Neurons.length; i++)  
            if (v4Neurons[i].getFlag() == 1)
                return i;      
        return 8;
    }
    
}
