package com.example.visualcortex;

import com.example.visualcortex.IT_Decider.ITDecider;
import com.example.visualcortex.brain_simulation.VisualCortexSimulator;
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.input.MouseEvent; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 

import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text; 
import javafx.stage.Stage; 
         
import java.util.ArrayList;
import javafx.geometry.Rectangle2D;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import com.example.visualcortex.visual_cortex_neurons.Retina;
import com.example.visualcortex.visual_cortex_neurons.V1_Neuron;
import com.example.visualcortex.visual_cortex_neurons.V2Neuron;
import com.example.visualcortex.visual_cortex_neurons.V4Neuron;

public class Brain_Simulation extends Application { 
    
    public void initResultSection(Text result, Group r){
      Text text = new Text("The Result Predicted By Neural Cortex:"); 
      text.setFont(Font.font(null, FontWeight.BOLD, 13));     
      text.setFill(Color.BLACK); 
      text.setX(10+22*22+22+5); 
      text.setY(270); 
      ObservableList list = r.getChildren(); 
      list.add(text);
      Rectangle rectangle = new Rectangle();  
      
      //Setting the properties of the rectangle 
      rectangle.setX(10+22*22); 
      rectangle.setY(280); 
      rectangle.setWidth(300.0f); 
      rectangle.setHeight(150.0f); 
       
      //Setting the height and width of the arc 
      rectangle.setArcWidth(30.0); 
      rectangle.setArcHeight(20.0); 
      
      list.add(rectangle);
      
      result.setFont(Font.font(null, FontWeight.BOLD, 90));     
      result.setFill(Color.WHITE); 
      result.setX(10+22*22+130); 
      result.setY(375); 
      list.add(result);
      
    }
   
    public void initRetina_Layer(ArrayList<Circle> retinaCircles, Group r){
      Text text = new Text("Retina"); 
      text.setFont(Font.font(null, FontWeight.BOLD, 13));     
      text.setFill(Color.BLACK); 
      text.setX(10+7*21); 
      text.setY(110); 
      
      for(int i =0; i < 25; i++){
            Circle circle = new Circle();
            //Setting the position of the circle 
            circle.setCenterX(10+8*21); 
            circle.setCenterY(135.0f + i*21); 
            //Setting the radius of the circle 
            circle.setRadius(10.0f); 
            circle.setFill(Color.GREEN); 
            circle.setStrokeWidth(20); 
            ObservableList list = r.getChildren(); 
            list.add(circle);
            retinaCircles.add(circle);
      }
      ObservableList list = r.getChildren(); 
      list.add(text);
   }
   
    public void initV1_Layer(ArrayList<Circle> v1Circles, Group r){
      Text text = new Text("V1 Layer"); 
      text.setFont(Font.font(null, FontWeight.BOLD, 13));     
      text.setFill(Color.BLACK); 
      text.setX(10+12*21); 
      text.setY(150); 
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                Circle circle = new Circle();
                circle.setCenterX(10+12*21); 
                circle.setCenterY(175.0f + j*21 + i*3*21); 
                //Setting the radius of the circle 
                circle.setRadius(10.0f); 
                circle.setFill(Color.GREEN); 
                circle.setStrokeWidth(20); 
                ObservableList list = r.getChildren(); 
                list.add(circle);
                for (int k = 0; k < 3; k++){
                    Line line = new Line();
                    line.setStartX(10+8*21+4); 
                    line.setStartY(135.0f + (i*5+j+k)*21); 
                    line.setEndX(10+12*21-4); 
                    line.setEndY(175.0f + j*21 + i*3*21);
                    list.add(line);
                }
                v1Circles.add(circle);
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                Circle circle = new Circle();
                //Setting the position of the circle 
                circle.setCenterX(10+14*21); 
                circle.setCenterY(320.0f + j*21 + i*5*21); 
                //Setting the radius of the circle 
                circle.setRadius(10.0f); 
                circle.setFill(Color.GREEN); 
                circle.setStrokeWidth(20); 
                ObservableList list = r.getChildren(); 
                list.add(circle);
                 for (int k = 0; k < 3; k++){
                    Line line = new Line();
                    line.setStartX(10+8*21+4); 
                    line.setStartY(135.0f + ((i+k)*5+j)*21); 
                    line.setEndX(10+14*21-4); 
                    line.setEndY(320.0f + j*21 + i*5*21);
                    list.add(line);
                }
                v1Circles.add(circle);
            }
        }
      ObservableList list = r.getChildren(); 
      list.add(text);
   }
    
    public void initV2_Layer(ArrayList<Circle> v2Circles, Group r){
      Text text = new Text("V2 Layer"); 
      text.setFont(Font.font(null, FontWeight.BOLD, 13));     
      text.setFill(Color.BLACK); 
      text.setX(10+18*21); 
      text.setY(150); 
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Circle circle = new Circle();
                circle.setCenterX(10+18*21); 
                circle.setCenterY(175.0f + j*21 + i*3*21); 
                //Setting the radius of the circle 
                circle.setRadius(10.0f); 
                circle.setFill(Color.GREEN); 
                circle.setStrokeWidth(20); 
                ObservableList list = r.getChildren(); 
                list.add(circle);
                
                Line line = new Line();
                line.setStartX(10+12*21+4); 
                line.setStartY(175.0f + j*21 + i*3*21); 
                line.setEndX(10+18*21-4); 
                line.setEndY(175.0f + j*21 + i*3*21);
                list.add(line);
                Line line1 = new Line();
                line1.setStartX(10+14*21+4); 
                line1.setStartY(320.0f + j*21 + i*5*21); 
                line1.setEndX(10+18*21-4); 
                line1.setEndY(175.0f + j*21 + i*3*21);
                list.add(line1);
                v2Circles.add(circle);
            }
        }
            
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Circle circle = new Circle();
                circle.setCenterX(10+18*21); 
                circle.setCenterY(175.0f + (j+3)*21 + (i+3)*3*21); 
                //Setting the radius of the circle 
                circle.setRadius(10.0f); 
                circle.setFill(Color.GREEN); 
                circle.setStrokeWidth(20); 
                ObservableList list = r.getChildren(); 
                list.add(circle);
                
                Line line = new Line();
                line.setStartX(10+12*21+4); 
                line.setStartY(175.0f + (j+2)*21 + i*3*21); 
                line.setEndX(10+18*21-4); 
                line.setEndY(175.0f + (j+3)*21 + (i+3)*3*21);
                list.add(line);
                Line line1 = new Line();
                line1.setStartX(10+14*21+4); 
                line1.setStartY(320.0f + (j+2)*21 + i*5*21); 
                line1.setEndX(10+18*21-4); 
                line1.setEndY(175.0f + (j+3)*21 + (i+3)*3*21);
                list.add(line1);
                v2Circles.add(circle);
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Circle circle = new Circle();
                circle.setCenterX(10+19*21); 
                circle.setCenterY(175.0f + (j)*21 + (i)*3*21 + 10); 
                //Setting the radius of the circle 
                circle.setRadius(10.0f); 
                circle.setFill(Color.GREEN); 
                circle.setStrokeWidth(20); 
                ObservableList list = r.getChildren(); 
                list.add(circle);
                
                Line line = new Line();
                line.setStartX(10+12*21+4); 
                line.setStartY(175.0f + (j)*21 + (i+2)*3*21); 
                line.setEndX(10+19*21-4); 
                line.setEndY(175.0f + (j)*21 + (i)*3*21 + 10);
                list.add(line);
                Line line1 = new Line();
                line1.setStartX(10+14*21+4); 
                line1.setStartY(320.0f + (j+2)*21 + (i)*5*21); 
                line1.setEndX(10+19*21-4); 
                line1.setEndY(175.0f + (j)*21 + (i)*3*21 + 10);
                list.add(line1);
                v2Circles.add(circle);
            }
            
        }
        
         for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Circle circle = new Circle();
                circle.setCenterX(10+19*21); 
                circle.setCenterY(175.0f + (j+3)*21 + (i+3)*3*21 -10); 
                //Setting the radius of the circle 
                circle.setRadius(10.0f); 
                circle.setFill(Color.GREEN); 
                circle.setStrokeWidth(20); 
                ObservableList list = r.getChildren(); 
                list.add(circle);
                
                Line line = new Line();
                line.setStartX(10+12*21+4); 
                line.setStartY(175.0f + (j)*21 + (i+2)*3*21); 
                line.setEndX(10+19*21-4); 
                line.setEndY(175.0f + (j+3)*21 + (i+3)*3*21 - 10);
                list.add(line);
                Line line1 = new Line();
                line1.setStartX(10+14*21+4); 
                line1.setStartY(320.0f + (j)*21 + (i)*5*21); 
                line1.setEndX(10+19*21-4); 
                line1.setEndY(175.0f + (j+3)*21 + (i+3)*3*21 - 10);
                list.add(line1);
                v2Circles.add(circle);
            }
        }
         
      ObservableList list = r.getChildren(); 
      list.add(text);
   }
    
    public void initV4_Layer(ArrayList<Circle> v4Circles, Group r){
      Text text = new Text("V4 Layer (Numbers)"); 
      text.setFont(Font.font(null, FontWeight.BOLD, 13));     
      text.setFill(Color.BLACK); 
      text.setX(10+22*21); 
      text.setY(200); 
      for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Circle circle = new Circle();
                circle.setCenterX(10+22*21); 
                circle.setCenterY(175.0f + j*21 + i*3*21+20*3); 
                //Setting the radius of the circle 
                circle.setRadius(10.0f); 
                circle.setFill(Color.GREEN); 
                circle.setStrokeWidth(20); 
                ObservableList list = r.getChildren(); 
                list.add(circle);
                
                Line line = new Line();
                line.setStartX(10+18*21+4); 
                line.setStartY(175.0f + j*21 + i*3*21); 
                line.setEndX(10+22*21-4); 
                line.setEndY(175.0f + j*21 + i*3*21+20*3);
                list.add(line);
                Line line1 = new Line();
                line1.setStartX(10+19*21+4); 
                line1.setStartY(320.0f + j*21 + i*5*21); 
                line1.setEndX(10+22*21-4); 
                line1.setEndY(175.0f + j*21 + i*3*21+20*3);
                list.add(line1);
                v4Circles.add(circle);
            }
        }
            
        Circle circle = new Circle();
        circle.setCenterX(10+22*21); 
        circle.setCenterY(175.0f + 3*21 + 2*3*21+20*3); 
        //Setting the radius of the circle 
        circle.setRadius(10.0f); 
        circle.setFill(Color.GREEN); 
        circle.setStrokeWidth(20); 
        v4Circles.add(circle);
        ObservableList list = r.getChildren(); 
        list.add(circle);

        Line line = new Line();
        line.setStartX(10+19*21+4); 
        line.setStartY(175.0f + 2*21 + 3*3*21+5); 
        line.setEndX(10+22*21-4); 
        line.setEndY(175.0f + 3*21 + 2*3*21+20*3);
        list.add(line);
        Line line1 = new Line();
        line1.setStartX(10+19*21+4); 
        line1.setStartY(320.0f + 3*21 + 2*5*21); 
        line1.setEndX(10+22*21-4); 
        line1.setEndY(175.0f + 3*21 + 2*3*21+20*3);
        list.add(line1);
        list.add(text);
   }
    
    public void displayRetina(ArrayList<Circle> circles, Retina[] retina){
       for(int i = 0; i < retina.length; i++){
           if (retina[i].getFlag() == 1)
                circles.get(i).setFill(Color.DARKSLATEBLUE);
           else
                circles.get(i).setFill(Color.BROWN);
              
       }
   }
   
    public void displayV1Layer(ArrayList<Circle> circles, V1_Neuron[] v1Neurons){
       for(int i = 0; i < v1Neurons.length; i++){
           if (v1Neurons[i].getFlag() == 1)
                circles.get(i).setFill(Color.YELLOW);
           else
                circles.get(i).setFill(Color.GREEN);
              
       }
   }
    
    public void displayV2Layer(ArrayList<Circle> circles, V2Neuron[] v2Neurons){
       for(int i = 0; i < v2Neurons.length; i++){
           if (v2Neurons[i].getFlag() == 1)
                circles.get(i).setFill(Color.YELLOW);
           else
                circles.get(i).setFill(Color.GREEN);
              
       }
   }
    
    public void displayV4Layer(ArrayList<Circle> circles, V4Neuron[] v4Neurons){
       for(int i = 0; i < v4Neurons.length; i++){
           if (v4Neurons[i].getFlag() == 1)
                circles.get(i).setFill(Color.YELLOW);
           else
                circles.get(i).setFill(Color.GREEN);
              
       }
   }
    
   
   public void displayRetina_Layer(ArrayList<Circle> circles, Retina[] retina){
       for(int i = 0; i < retina.length; i++){
           if (retina[i].getFlag() == 1)
                circles.get(i).setFill(Color.YELLOW);
           else
                circles.get(i).setFill(Color.GREEN);
              
       }
   }
   
    public void displayResult(Text result, int decided_result){
     result.setText(""+decided_result);
   }
   

   @Override 
   public void start(Stage stage) {      
      ITDecider itDecider = new ITDecider();
      VisualCortexSimulator visualCortexSimulator = new VisualCortexSimulator();
      
      Text text = new Text("Brain Visual Cortex Simulation"); 
      text.setFont(Font.font(null, FontWeight.BOLD, 15));     
      text.setFill(Color.CRIMSON); 
      text.setX(450); 
      text.setY(50); 
      
      Group root = new Group(text);
      ArrayList<Circle> circles = new ArrayList();
      // Retina Display Circles
      ArrayList<Circle> retinaCircles = new ArrayList();
      // V1 Layer
      ArrayList<Circle> v1Circles = new ArrayList();
      // V2 Layer
      ArrayList<Circle> v2Circles = new ArrayList();
      // V4 Layer
      ArrayList<Circle> v4Circles = new ArrayList();
      //Result
      Text result = new Text("?");

      
      //Creating the click event handler 
      EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(MouseEvent e) { 
            Circle circle = (Circle) e.getSource();
            int i = circles.indexOf(circle);
            visualCortexSimulator.activateRetina(i);
            displayRetina(circles, visualCortexSimulator.getRetina());
            visualCortexSimulator.simulate();
            int decided_result = itDecider.decide(visualCortexSimulator.getV4Layer());
            displayRetina_Layer(retinaCircles, visualCortexSimulator.getRetina());
            displayV1Layer(v1Circles, visualCortexSimulator.getV1Layer() );
            displayV2Layer(v2Circles, visualCortexSimulator.getV2Layer());
            displayV4Layer(v4Circles, visualCortexSimulator.getV4Layer());
            displayResult(result, decided_result);
         } 
      };  
      
      // Input Circles
      for(int i =0; i < 5; i++){
        for(int j =0; j < 5; j++){
            Circle circle = new Circle();
            //circles[i] = new Circle(); 
            circle.setCenterX(10+j*21); 
            circle.setCenterY(135.0f + i*21); 
            //Setting the radius of the circle 
            circle.setRadius(10.0f); 
            //Setting the color of the circle 
            circle.setFill(Color.BROWN); 
            //Setting the stroke width of the circle 
            circle.setStrokeWidth(20); 
            circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
            ObservableList list = root.getChildren(); 
            list.add(circle);
            circles.add(circle);
        }
      }
      // Retina Layer
      initRetina_Layer(retinaCircles, root);
      //  V1 Layer
      initV1_Layer(v1Circles, root);
      initV2_Layer(v2Circles, root);
      initV4_Layer(v4Circles, root);
      initResultSection(result, root);
      
      Screen screen = Screen.getPrimary();
      Rectangle2D bounds = screen.getVisualBounds();
      
      //Creating a scene object 
      Scene scene = new Scene(root, bounds.getWidth(), bounds.getHeight()); 
       
      //Setting the fill color to the scene 
      scene.setFill(Color.LAVENDER);  
      
      //Setting title to the Stage 
      stage.setTitle("Brain Visual Cortex");   
      
      stage.setX(bounds.getMinX());
      stage.setY(bounds.getMinY());
      stage.setWidth(bounds.getWidth());
      stage.setHeight(bounds.getHeight());
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   } 
   
   public static void main(String args[]){ 
      launch(args); 
   } 
}