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
public class V4TwoNeuron extends V4Neuron{
    
     public void activate(Neuron[][] Zero_Angle_neurons, Neuron[][] Ninty_Angle_neurons, 
             Neuron[][] One_Hundren_Eighty_Angle_neurons, Neuron[][] Two_Hundren_Seventy_Angle_neurons ){
        int zero_angle_count = 0;
        int ninty_angle_count = 0;
        int one_hundred_angle_count = 0;
        int two_hundred_and_seventy_angle_count = 0;
        for(int i = 0; i < Zero_Angle_neurons.length; i++){
            for(int j = 0; j < Zero_Angle_neurons[i].length; j++ ){
                zero_angle_count += Zero_Angle_neurons[i][j].getFlag();
                ninty_angle_count += Ninty_Angle_neurons[i][j].getFlag();
                one_hundred_angle_count += One_Hundren_Eighty_Angle_neurons[i][j].getFlag();
                two_hundred_and_seventy_angle_count += Two_Hundren_Seventy_Angle_neurons[i][j].getFlag();
            }
        }
        
        if (zero_angle_count == 1 && ninty_angle_count == 1 && one_hundred_angle_count == 1 && two_hundred_and_seventy_angle_count == 1){
            int zero_angle_neuron_in_up = 0;
            for (int i= 0; i < 2; i++)
                for (int j = 0; j < 3; j++)
                    zero_angle_neuron_in_up += Zero_Angle_neurons[i][j].getFlag();
                            
            int ninty_angle_neuron_in_up = 0;
            for (int i= 0; i < 2; i++)
                for (int j = 0; j < 3; j++)
                    ninty_angle_neuron_in_up += Ninty_Angle_neurons[i][j].getFlag();
                    
            if (zero_angle_neuron_in_up == 0 && ninty_angle_neuron_in_up > 0)
                this.setFlag(1);
            else
                this.setFlag(0);
        }
        else
            this.setFlag(0);
                    
    }

}
