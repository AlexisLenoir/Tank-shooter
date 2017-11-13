package unchartroploin;

import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class Obus extends Parent {

	
	Rectangle corps2 = new Rectangle(10,10, Color.GOLDENROD);
	
	Circle tete = new Circle(5,Color.GOLDENROD);
	
	public Obus (double x, double y) {
		
        this.getChildren().add(tete);
        this.getChildren().add(corps2);
        
        corps2.setTranslateX(0);
        tete.setTranslateX(10);
        tete.setTranslateY(5);
        
        
        
        setTranslateX(x);
        setTranslateY(y);
	}
}
