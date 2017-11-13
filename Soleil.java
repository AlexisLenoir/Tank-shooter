package unchartroploin;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Soleil extends Parent {
	
	Circle coeur = new Circle(60,Color.GOLD);

	
	
	public Soleil (double x, double y) {
		
		this.getChildren().add(coeur);
	    
	    
		
	    Rectangle[] traits = new Rectangle [10];
	    for (int k = 0; k<10; k++)
	    {
	    	traits[k] = new Rectangle(10,120, Color.GOLD);
	    	traits[k].getTransforms().add(new Rotate(-36*k));
	    	this.getChildren().add(traits[k]);
	    	
	    }
	    
	    
	    
	    
	    
		 setTranslateX(x);
		 setTranslateY(y);
	}

}
