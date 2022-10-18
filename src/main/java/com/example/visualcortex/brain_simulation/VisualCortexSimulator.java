
package com.example.visualcortex.brain_simulation;

import com.example.visualcortex.visual_cortex_neurons.Retina;
import com.example.visualcortex.visual_cortex_neurons.V1HorizontalNeuron;
import com.example.visualcortex.visual_cortex_neurons.V1VerticalNeuron;
import com.example.visualcortex.visual_cortex_neurons.V1_Neuron;
import com.example.visualcortex.visual_cortex_neurons.V2Neuron;
import com.example.visualcortex.visual_cortex_neurons.V2NintyAngleDetectorNeuron;
import com.example.visualcortex.visual_cortex_neurons.V2OneHundrenAndEightyAngleDetectorNeuron;
import com.example.visualcortex.visual_cortex_neurons.V2TwoHundrenAndSeventyAngleDetectorNeuron;
import com.example.visualcortex.visual_cortex_neurons.V2ZeroAngleDetectorNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4EightNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4FiveNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4FourNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4Neuron;
import com.example.visualcortex.visual_cortex_neurons.V4NineNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4OneNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4SevenNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4SixNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4ThreeNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4TwoNeuron;
import com.example.visualcortex.visual_cortex_neurons.V4ZeroNeuron;

/**
 *
 * @author umid
 */
public class VisualCortexSimulator {
    
    public Retina[] retina;
    public V1VerticalNeuron[][] v1VerticalNeurons;
    public V1HorizontalNeuron[][] v1HorizontalNeurons;
    public V2ZeroAngleDetectorNeuron[][] v2ZeroAngleDetectorNeurons;
    public V2NintyAngleDetectorNeuron[][] v2NintyAngleDetectorNeuron;
    public V2OneHundrenAndEightyAngleDetectorNeuron[][] v2OneHundredAndEightyAngleDetectorNeuron;
    public V2TwoHundrenAndSeventyAngleDetectorNeuron[][] v2TwoHundrenAndSeventyAngleDetectorNeuron;
    public V4Neuron[] v4Neurons;
    
   
    
    public VisualCortexSimulator(){
        retina = new Retina[25];
        for(int i = 0; i < 25; i++)
            retina[i] = new Retina();
        
        v1VerticalNeurons = new V1VerticalNeuron[5][3];
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 3; j++)
                v1VerticalNeurons[i][j] = new V1VerticalNeuron();
        
        v1HorizontalNeurons = new V1HorizontalNeuron[3][5];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                v1HorizontalNeurons[i][j] = new V1HorizontalNeuron();
        
        v2ZeroAngleDetectorNeurons = new V2ZeroAngleDetectorNeuron[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                v2ZeroAngleDetectorNeurons[i][j] = new V2ZeroAngleDetectorNeuron();
        
        v2NintyAngleDetectorNeuron = new V2NintyAngleDetectorNeuron[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                v2NintyAngleDetectorNeuron[i][j] = new V2NintyAngleDetectorNeuron();
        
        v2OneHundredAndEightyAngleDetectorNeuron = new V2OneHundrenAndEightyAngleDetectorNeuron[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                v2OneHundredAndEightyAngleDetectorNeuron[i][j] = new V2OneHundrenAndEightyAngleDetectorNeuron();
        
        v2TwoHundrenAndSeventyAngleDetectorNeuron = new V2TwoHundrenAndSeventyAngleDetectorNeuron[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                v2TwoHundrenAndSeventyAngleDetectorNeuron[i][j] = new V2TwoHundrenAndSeventyAngleDetectorNeuron();
        
        v4Neurons = new V4Neuron[10];
        v4Neurons[0] = new V4ZeroNeuron();
        v4Neurons[1] = new V4OneNeuron();
        v4Neurons[2] = new V4TwoNeuron();
        v4Neurons[3] = new V4ThreeNeuron();
        v4Neurons[4] = new V4FourNeuron();
        v4Neurons[5] = new V4FiveNeuron();
        v4Neurons[6] = new V4SixNeuron();
        v4Neurons[7] = new V4SevenNeuron();
        v4Neurons[8] = new V4EightNeuron();
        v4Neurons[9] = new V4NineNeuron();
                
    }
    
    public void activateRetina(int index){
        
        if (retina[index].getFlag() == 0)
            retina[index].setFlag(1);
        else
            retina[index].setFlag(0);
        
    }
    
    public void printRetina(){
        System.out.println("---------");
        for(int i = 0; i < 25; i++)
            System.out.print(retina[i].getFlag());
        System.out.println();
        System.out.println("---------");
        
    }
    
    public void printV1_Layer(){
        System.out.println("---------");
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(v1VerticalNeurons[i][j].getFlag());
            System.out.println();
        }
        System.out.println();
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++)
                System.out.print(v1HorizontalNeurons[i][j].getFlag());
            System.out.println();
        }
        
        System.out.println();
        System.out.println("---------");
        
    }
    
    public void printV2Layer(){
        System.out.println("---------");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(v2ZeroAngleDetectorNeurons[i][j].getFlag());
            System.out.println();
        }
        System.out.println();
    }
    
    public Retina[] getRetina(){
        return retina;
    }
    
    public V1_Neuron[] getV1Layer(){
        V1_Neuron[] v1_neurons = new V1_Neuron[30];
        int c = 0;
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 3; j++){
                v1_neurons[c] = v1VerticalNeurons[i][j];
                c++;
            }
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++){
                v1_neurons[c] = v1HorizontalNeurons[i][j];
                c++;
            }
        return v1_neurons;
    }
    
    public V2Neuron[] getV2Layer(){
        V2Neuron[] v2neurons = new V2Neuron[36];
        int c = 0;
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++){
                v2neurons[c] = v2ZeroAngleDetectorNeurons[i][j];
                c++;
            }
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++){
                v2neurons[c] = v2NintyAngleDetectorNeuron[i][j];
                c++;
            }
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++){
                v2neurons[c] = v2OneHundredAndEightyAngleDetectorNeuron[i][j];
                c++;
            }
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++){
                v2neurons[c] = v2TwoHundrenAndSeventyAngleDetectorNeuron[i][j];
                c++;
            }
        return v2neurons;
    }
    
    public V4Neuron[] getV4Layer(){
        return v4Neurons;
    }
    
    
    
    public void simulate(){
        
        // setting vertical neurons
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                //System.out.print(retina[i*3+j].getFlag());
                v1VerticalNeurons[i][j].activate(retina[i*5+j], retina[i*5+j+1], retina[i*5+j+2]);
            }
            //System.out.println();
        }
                
                    
        // setting horizontal neurons
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                v1HorizontalNeurons[i][j].activate(retina[i*5+j], retina[(i+1)*5+j], retina[(i+2)*5+j]);

            
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                v2ZeroAngleDetectorNeurons[i][j].activate(v1HorizontalNeurons[i][j], v1VerticalNeurons[i][j]);

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)   
                v2NintyAngleDetectorNeuron[i][j].activate(v1HorizontalNeurons[i][j+2], v1VerticalNeurons[i][j]);
       
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                v2OneHundredAndEightyAngleDetectorNeuron[i][j].activate(v1HorizontalNeurons[i][j+2], v1VerticalNeurons[i+2][j] );
        
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                v2TwoHundrenAndSeventyAngleDetectorNeuron[i][j].activate(v1HorizontalNeurons[i][j], v1VerticalNeurons[i+2][j]);
        
   
        for(int i = 0; i < 10; i++)
            v4Neurons[i].activate( v2ZeroAngleDetectorNeurons, 
                         v2NintyAngleDetectorNeuron,  
                         v2OneHundredAndEightyAngleDetectorNeuron, 
                         v2TwoHundrenAndSeventyAngleDetectorNeuron);

    }
    
}
