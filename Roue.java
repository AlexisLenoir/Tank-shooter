/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unchartroploin;

import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

/**
 *
 * @author Constantin
 */
public class Roue extends Parent {
    
    double ech = 0.8; //changer l'échelle des roues, c'est pratique..
    double rayonRoue = 10; 
    
    Circle roue = new Circle(10*ech,Color.WHITE); //(15*2,Color.WHITE);
    Rectangle rayon1 = new Rectangle(20*ech,4*ech);//(30*2,4);
    Rectangle rayon2 =  new Rectangle(4*ech,20*ech); //(4,30*2);
    Rotate maRotation = new Rotate ();
    
    
    
    public Roue(double x, double y){
    
        this.getChildren().add(roue);
        this.getChildren().add(rayon1);
        this.getChildren().add(rayon2);
        rayon1.setX(-10*ech);//(-15*2);
        rayon1.setY(-2*ech); //Centrage
        rayon2.setY(-10*ech);//(-15*2);
        rayon2.setX(-2*ech); //Centrage
        
        roue.setStroke(Color.BLACK); 
        roue.setStrokeWidth(5*ech); // Pneu , le contour augmente le diamètre du cercle du paramètre entré dans la méthode.
        
        //this.setTranslateX(150);
        this.setTranslateX(x);
        this.setTranslateY(y); //on positionne la roue
        
        maRotation = new Rotate (0);
        this.getTransforms().add(maRotation);
        
        
        
        
    }
    
    public void rotationRoue ( double vitesse, double distance){
    
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll( 
                new KeyFrame (Duration.ZERO, new KeyValue(maRotation.angleProperty(), 0)),
                new KeyFrame (new Duration(vitesse), new KeyValue(maRotation.angleProperty(), (360*distance)/(2*Math.PI*rayonRoue)))); //une formule de maths !
        
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    
    }
    
    
    public void rotationManuRoue ( double vitesse, double distance, Timeline timeline){
        
        //Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll( 
                new KeyFrame (Duration.ZERO, new KeyValue(maRotation.angleProperty(), maRotation.getAngle())),
                new KeyFrame (new Duration(vitesse), new KeyValue(maRotation.angleProperty(), maRotation.getAngle() + (360*distance)/(2*Math.PI*rayonRoue)))); //une formule de maths !
        
   
    }
    
}
