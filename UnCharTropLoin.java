/*
 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unchartroploin;

import javafx.scene.Scene;

import java.io.File;



import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javafx.scene.transform.Rotate;
import javafx.animation.Animation;
import javafx.animation.Animation.Status;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

 
import javafx.stage.Stage;

 
import javafx.stage.Stage;

/**
 * @author  Alexis 
 * @author Constantin
 */
public class UnCharTropLoin extends Application {

    /**
     * @param args the command line arguments
     */
    
    Char monChar = new Char(-200,200+100+300);//(-200,200);
    Menu monMenu = new Menu(10,10);
   
    Soleil monSoleil = new Soleil(1200-150,130);
    Nuage monNuage1 = new Nuage(40,50);
    Nuage monNuage2 = new Nuage(600,100);
    Nuage monNuage3 = new Nuage(400,150);
    Nuage monNuage4 = new Nuage(750,80);
    
   
   // 17h  
   
    
    DeplaManu deplaManu = new UnCharTropLoin.DeplaManu();
    
    String musicFile = "SF-TANK.mp3";
		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
   
    
    
    public static void main(String[] args) {
        Application.launch(UnCharTropLoin.class, args);
    
    
    }
    
    public void start (Stage primaryStage){
    
    	
    	  
    	
       	MonAction2 monAction2 = new UnCharTropLoin.MonAction2();
        Arret monArret = new Arret();
        
        
        
        /*DeplaManu deplaManu = new UnCharTropLoin.DeplaManu();
        MonAction2 monAction2 = new UnCharTropLoin.MonAction2();*/
        
        
        
    // Fenêtre jeux 
        
        
        Group root = new Group();
        Scene jeux = new Scene(root,1200,800);
        
        
       
        primaryStage.setTitle("Tank Shooter");
        
       // Fenêtre jeux 
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        // FORÊT ICI ATTENTION
        
        
        
        
        
        
       Foret maForet = new Foret(3000, 558.5, 1200, root );
        
        
        
        
        
        
        
        // FIN  DE FORÊT PAR  ICI ATTENTION
        
        
        
        
        
        
        
        
        
        
        MonAction1 monAction1 =  new MonAction1 (root);
        
        
        //Char monChar = new Char(-100,100);
        
       
       // ROOT  
        
        root.getChildren().add(monSoleil);
        root.getChildren().add(monNuage1);
        root.getChildren().add(monNuage2);
        root.getChildren().add(monNuage3);
        root.getChildren().add(monNuage4);
        root.getChildren().add(monChar);
   
        
       // ROOT 
        
        
        
        
        
        
        // monChar.setOpacity(0);
        
        /*Rectangle bordGauche = new Rectangle(200,200,Color.WHITE);//,Color.WHITE);
        bordGauche.setTranslateX(-200);
        bordGauche.setTranslateY(150);
        root.getChildren().add(bordGauche);
        */
        //bordGauche.setOpacity(0.5);
        
        
        
        /*Rectangle bordDroit = new Rectangle(200,200,Color.WHITE);//,Color.WHITE);
        root.getChildren().add(bordDroit);
        bordDroit.setTranslateX(800);
        bordDroit.setTranslateY(150);
        */
        
        
        
        //TERRAIN
        
        Rectangle sol1 = new Rectangle (1200,20, Color.DARKSEAGREEN);
        sol1.setTranslateY(200+40+18.5+100+300);//(200+40+18.5);
        root.getChildren().add(sol1);
        
        Rectangle terre1 = new Rectangle (1200,300,Color.CHOCOLATE);
        terre1.setTranslateY(200+40+18.5+20+95+300);
        root.getChildren().add(terre1);
        
        //TERRAIN
        
        
        
        
        /*Rectangle sol2 = new Rectangle (1200,20, Color.DARKSEAGREEN);
        sol2.setTranslateY(200+40+18.5+100+150);
        sol2.setTranslateX(550);//(200+40+18.5);
        root.getChildren().add(sol2);
        
        Rectangle terre2 = new Rectangle (1200,10000,Color.CHOCOLATE);
        terre2.setTranslateY(200+40+18.5+20+95+150);
        terre2.setTranslateX(550);
        root.getChildren().add(terre2);
        
        Rectangle sol3 = new Rectangle (300,25, Color.DARKSEAGREEN);
        sol3.setTranslateY(200+40+18.5+100+300);
        sol3.setTranslateX(290);//(200+40+18.5);
        sol3.getTransforms().add(new Rotate(-30));
        
        root.getChildren().add(sol3);
        
        Rectangle terre3 = new Rectangle (309,300,Color.CHOCOLATE);
        terre3.setTranslateY(200+40+18.5+20+95+300);
        terre3.setTranslateX(290);
        terre3.getTransforms().add(new Rotate(-30));
        root.getChildren().add(terre3);*/
        
        
        
        
        
        
        Button lanceur = new Button("Appuyer pour lancer le char!");
        lanceur.setTranslateX(100);
        lanceur.setTranslateY(100);
        root.getChildren().add(lanceur);
        
        
    
        
        
        
        
        jeux.setOnKeyPressed(deplaManu); //-------------------------------------ICI
        jeux.setOnKeyReleased(monArret);
        
        
        
        
        
        
        /*Button lanceur2 = new Button("Voulez-vous prendre les commandes ?");
        lanceur2.setTranslateX(300);
        lanceur2.setTranslateY(85);
        root.getChildren().add(lanceur2);*/
        
        
        //scene.setOnKeyPressed(deplaManu); //-------------------------------------ICI
        
        
        //scene.setOnKeyReleased(deplaManu);
        
        //Roue maRoue = new Roue();
        //root.getChildren().add(maRoue);
        
        /*
        Roue roueTest0 = new Roue(0,100);
        roueTest0.setTranslateY(100);
        root.getChildren().add(roueTest0);
        Circle roueTest = new Circle(12.5,Color.CORAL);
        roueTest.setTranslateY(100);
        root.getChildren().add(roueTest);*/
        
        //Rectangle corps = new Rectangle(120,40, Color.GRAY);
        //root.getChildren().add(corps);
        
        
        
        
        
        //tirer.setOnAction(monAction2);
        lanceur.setOnAction(monAction1);
        //lanceur2.setOnAction(monAction2 );
        
        /*scene.setOnMousePressed(new EventHandler <MouseEvent>() { 
            public void handle(MouseEvent me) {
                
                monChar.translationChar(2000);
                
            }
            });*/
            
        
        
        mediaPlayer.setVolume(0.1);
  		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);

        
         // Fenêtre menu
        
        
        Group rootmenu = new Group();
        Scene menu = new Scene(rootmenu,1200,800, Color.CHOCOLATE);
        
        
        primaryStage.setScene(menu);
        primaryStage.setTitle("UN CHAR TROP LOIN");
        
        
        
        String musicFile2 = "Ofenbach vs. Nick Waterhouse - Katchi (Official Video).mp3";
        Media sound2 = new Media(new File(musicFile2).toURI().toString());
        MediaPlayer mediaPlayer2 = new MediaPlayer(sound2);
        mediaPlayer2.play();
        
        Button jouer = new Button(" JOUER");
        jouer.setTranslateX(550);
        jouer.setTranslateY(300);
        rootmenu.getChildren().add(jouer);
        
        Button quitter = new Button(" QUITTER");
        quitter.setTranslateX(550);
        quitter.setTranslateY(400);
        rootmenu.getChildren().add(quitter);
        
        QuitteJeux monQuitteJeux = new QuitteJeux();
        quitter.setOnAction(monQuitteJeux);
        
        LanceJeux monLanceJeux =  new LanceJeux(primaryStage,jeux,mediaPlayer2);
        jouer.setOnAction(monLanceJeux);
        
        primaryStage.setScene(menu);
        primaryStage.show();
        
        
        
        
         // 	FIN Fenêtre menu
    
        
        Button retourmenu = new Button(" MENU");
        retourmenu.setTranslateX(0);
        retourmenu.setTranslateY(0);
        root.getChildren().add(retourmenu);
        LanceMenu monLanceMenu= new LanceMenu(primaryStage,menu,mediaPlayer2);
        retourmenu.setOnAction( monLanceMenu);
        
    }
    
    
    
    
    
    class MonAction1 implements EventHandler<ActionEvent>{
          Group root;  
          
          public MonAction1 (Group root) {
        	  this.root = root;
    		
          }
    	
          public void handle(ActionEvent e) {
        	  		
        	  		MonAction2 monAction2 = new UnCharTropLoin.MonAction2();
        	  		Button tirer = new Button("Appuyer pour tirer !");
        	  		tirer.setTranslateX(350);
        	  		tirer.setTranslateY(100);
        	  		root.getChildren().add(tirer);
        	  		tirer.setOnAction(monAction2);
    		
    		
        	  		//monChar.translationChar(10000);//100000/3);
        	  		
        	  		monChar.setLayoutX(500);
        	  		
        	  		
                
            }
        
        }
    
    
    
    
    
    
    
    
    
    class MonAction2 implements EventHandler<ActionEvent>{
       
    		public void handle(ActionEvent e) {
                monChar.translationObus(10000);//100000/3);
                
                String musicFile1 = "sf_canon_01.mp3";
                Media sound1 = new Media(new File(musicFile1).toURI().toString());
                MediaPlayer mediaPlayer1 = new MediaPlayer(sound1);
                mediaPlayer1.play();
                

                mediaPlayer1.setVolume(1);
            
        }
    
    }
    
    
    
    
    
    
    class LanceJeux implements EventHandler<ActionEvent>{
        
    	  Stage sta;
   	  Scene sce;
   	  MediaPlayer media;
   	  
   	   public LanceJeux (Stage sta1, Scene sce,MediaPlayer media1)
   	   {
   		   
   		   sta = sta1;
   		   this.sce = sce;
   		   media = media1;
   		   
   		   
   		   
   	   }
   	   
    	
    	
    	
		public void handle(ActionEvent e) {
			
			
			sta.setScene(sce);
 		    sta.show();
 		    media.stop();            
        
        }

  }
   
    
    class LanceMenu implements EventHandler<ActionEvent>{
        
  	  Stage sta;
 	  Scene sce;
 	  MediaPlayer media;
 	  
 	   public LanceMenu (Stage sta1, Scene sce,MediaPlayer media1)
 	   {
 		   
 		   sta = sta1;
 		   this.sce = sce;
 		   media = media1;
 		   
 		   
 		   
 	   }
 	   
  	
  	
  	
		public void handle(ActionEvent e) {
			
			
			sta.setScene(sce);
		    sta.show();
		    media.play();            
      
      }

}
    
    
    
    
    
    
    
    
    
    
    class QuitteJeux implements EventHandler<ActionEvent>{
        
		public void handle(ActionEvent e) {
			
			Platform.exit();
            
        
    }

}
    
       
    
    
    
    
    
    
    class DeplaManu implements EventHandler<KeyEvent>{
        
        Timeline timeline = new Timeline();
        Timeline timelineA;
        
        
        public void handle(KeyEvent e) {
               
                
                if (! (timeline.getStatus()== Animation.Status.RUNNING)){ 
                
                timeline = new Timeline();
                
                if (e.getCode().toString()=="RIGHT"){
                    monChar.translationManuChar(500*100,100*100,timeline);
                    System.out.println("à droite");
                    
        	  		mediaPlayer.play();
        	  		
                   
                    
                    
                }else if(e.getCode().toString()=="LEFT"){
                    
                    monChar.translationManuChar(500*100,-100*100,timeline);
                    System.out.println("à gauche");
                   
                    
                    
        	  		mediaPlayer.play();
        	  		
                    
                }
                }
                
                
            }
    
    }
    
    
    class Arret implements EventHandler<KeyEvent>{
        
        public void handle(KeyEvent e) {
           
            
            if (e.getCode().toString()=="RIGHT" || e.getCode().toString()=="LEFT" ){
                deplaManu.timeline.stop();
                mediaPlayer.pause();
                
                
            }
            
                       }

}    
    
}