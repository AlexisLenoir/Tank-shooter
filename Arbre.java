package unchartroploin;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Arbre extends Parent {
	
	Rectangle tronc = new Rectangle(16,120, Color.MAROON);
	Rectangle branche1 = new Rectangle(50,7, Color.MAROON);
	Rectangle branche2 = new Rectangle(80,8, Color.MAROON);
	Circle feuille = new Circle(50,Color.DARKGREEN);
	Circle feuille1 = new Circle(13,Color.DARKGREEN);
	Circle feuille2 = new Circle(10,Color.DARKGREEN);
	
	
	public Arbre (double x, double y) {
		
		this.getChildren().add(tronc);
	    this.getChildren().add(branche1);
	    this.getChildren().add(branche2);
	    this.getChildren().add(feuille);
	    this.getChildren().add(feuille1);
	    this.getChildren().add(feuille2);
	    
	    feuille.setTranslateX(8);
	    feuille.setTranslateY(-40);
	    feuille1.setTranslateX(-30);
	    feuille1.setTranslateY(20);
	    feuille2.setTranslateX(44);
	    feuille2.setTranslateY(10);
	    
	    branche1.getTransforms().add(new Rotate(-45));
	    branche1.setTranslateY(45);
	    branche1.setTranslateX(7);
	    branche2.getTransforms().add(new Rotate(-125));
	    branche2.setTranslateY(85);
	    branche2.setTranslateX(7);
	    
	    setTranslateX(x);
	    setTranslateY(y);
	    
	   /* this.setScaleX(value); .setScaleX(coeffx);
	    this.setScaleY(coeffy);*/
	    
	
	}
}
