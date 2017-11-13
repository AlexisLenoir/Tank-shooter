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
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

/**
 *
 * @author Constantin
 */
public class Char extends Parent {
    
    Rectangle corps = new Rectangle(120,40,Color.DARKGRAY);
    
   
    
    Rectangle croix1 = new Rectangle(16,3, Color.DARKOLIVEGREEN);
    Rectangle croix2 = new Rectangle(3,16, Color.DARKOLIVEGREEN);
    Rectangle croix3 = new Rectangle(3,8, Color.DARKOLIVEGREEN);
    Rectangle croix4 = new Rectangle(3,9, Color.DARKOLIVEGREEN);
    Rectangle croix5 = new Rectangle(9,3, Color.DARKOLIVEGREEN);
    Rectangle croix6 = new Rectangle(9,3, Color.DARKOLIVEGREEN);
    Polygon triangle = new Polygon();
    
    Rectangle cabine = new Rectangle(50,50, Color.BURLYWOOD);
    Rectangle avantCanon = new Rectangle (20,20,Color.BURLYWOOD);
    Circle viseur = new Circle (10,Color.BURLYWOOD);
    Rectangle canon = new Rectangle (100,10);
    
    Roue [] roues  = new Roue[6]; //On ajoute six roues au char
    
    Obus [] obus = new Obus[1];
    
    double rayonRoue = 10; //ATTENTION toute modification des roues doit être prise en compte, il en va du réalisme de l'animation !!
    
    Translate translationObus;
    Translate translationChar;
    
    public Char(double x, double y){
        
        for (int k = 0; k<6;k++){
            roues[k] = new Roue(10+k*20,48);
            this.getChildren().add(roues[k]);
            
        }
        obus[0] = new Obus(75+20,-25);
        
        
       
        cabine.setArcWidth(30);
        cabine.setArcHeight(30);
        
      
       
        
        
        this.getChildren().add(cabine);
        this.getChildren().add(corps);
        this.getChildren().add(obus[0]);
        this.getChildren().add(canon);
        this.getChildren().add(viseur);
        this.getChildren().add(avantCanon);
        this.getChildren().add(croix1);
        this.getChildren().add(croix2);
        this.getChildren().add(croix3);
        this.getChildren().add(croix4);
        this.getChildren().add(croix5);
        this.getChildren().add(croix6);
       
     
        
        
        cabine.setTranslateX(40);
        cabine.setTranslateY(-40);
        
       
        
        croix1.setTranslateX(45);
        croix1.setTranslateY(-30);
        croix5.setTranslateX(45+6);
        croix5.setTranslateY(-30-6);
        croix6.setTranslateX(45);
        croix6.setTranslateY(-30+8);
        
        croix2.setTranslateX(45+6);
        croix2.setTranslateY(-36);
        croix3.setTranslateX(45);
        croix3.setTranslateY(-36);
        croix4.setTranslateX(45+13);
        croix4.setTranslateY(-36+8);
        
        croix2.getTransforms().add(new Rotate(0));
        
        
        avantCanon.setTranslateX(75);
        avantCanon.setTranslateY(-30);
        viseur.setTranslateX(75+20);
        viseur.setTranslateY(-20);
        canon.setTranslateX(75+10);
        canon.setTranslateY(-25);
        
        
        translationObus = new Translate (0,0);
        obus[0].getTransforms().add(translationObus);
        
        
        translationChar = new Translate (0,0);
        this.getTransforms().add(translationChar);
        
        setTranslateX(x);
        setTranslateY(y);
    
    }
    
    public void translationChar(double vitesse){
    
        double distance = 1000;
        for (int k = 0; k<6;k++){
            roues[k].rotationRoue(vitesse,distance);
            
        }
        
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll( 
                new KeyFrame (Duration.ZERO, new KeyValue(translationChar.xProperty(), 0)), 
                new KeyFrame (new Duration(vitesse), new KeyValue(translationChar.xProperty(), distance)
                ));
        
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
       
        /*Timeline timeline2 = new Timeline();
        timeline2.getKeyFrames().addAll( 
                
                new KeyFrame ( Duration.ZERO, new KeyValue(translationObus.xProperty(), 0)),
                new KeyFrame (new Duration(vitesse/5), new KeyValue(translationObus.xProperty(), distance))
                );
        
        timeline2.setCycleCount(100);
        timeline2.play();*/
        
     }
    
   
   public void translationObus (double vitesse){
    	
    	Timeline timeline2 = new Timeline();
        timeline2.getKeyFrames().addAll( 
                
                new KeyFrame ( Duration.ZERO, new KeyValue(translationObus.xProperty(), 0)),
                new KeyFrame (new Duration(vitesse/5), new KeyValue(translationObus.xProperty(), 1000))
                );
        
        
        timeline2.play();
    }
    
   public void translationManuChar(double vitesse, double distance,Timeline timeline){
       
       //FinDepla maFin = new FinDepla(this, distance, maTranslation);
       //distance est positif pour avancer et négatif pour reculer
       
       
       for (int k = 0; k<6;k++){
           roues[k].rotationManuRoue(vitesse,distance,timeline);
           
       }
       
       //this.getLayoutX()
       timeline.getKeyFrames().addAll( 
               new KeyFrame (Duration.ZERO, new KeyValue(this.layoutXProperty(),this.getLayoutX()  )/*,new KeyValue(roues[0].maRotation.angleProperty(), 0),new KeyValue(roues[1].maRotation.angleProperty(), 0),new KeyValue(roues[2].maRotation.angleProperty(), 0),new KeyValue(roues[3].maRotation.angleProperty(), 0),new KeyValue(roues[4].maRotation.angleProperty(), 0), new KeyValue(roues[5].maRotation.angleProperty(), 0) ),//(mesJetons[tour-1][niveau].translateYProperty(),0)*/),//
               new KeyFrame (new Duration(vitesse),  new KeyValue(this.layoutXProperty(),  this.getLayoutX() + distance)
               ));
       
       
       
       timeline.play();
       
   
   }
   

    
}
