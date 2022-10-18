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
public class V4EightNeuron extends V4Neuron{
    
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
        
        if (zero_angle_count >= 2 && ninty_angle_count >= 2 && one_hundred_angle_count >= 2 && two_hundred_and_seventy_angle_count >= 2){

                this.setFlag(1);
         
        }
        else
            this.setFlag(0);
                    
    }

}

