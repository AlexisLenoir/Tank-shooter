package unchartroploin;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Menu extends Parent {


Rectangle sante1 = new Rectangle(19,4, Color.RED);
Rectangle sante2 = new Rectangle(4,15, Color.RED);
Rectangle sante3 = new Rectangle(15,4, Color.RED);
Rectangle sante4 = new Rectangle(4,15, Color.RED);
Rectangle sante5 = new Rectangle(15,4, Color.RED);

public Menu (double x, double y) {
	
	this.getChildren().add(sante1);
    this.getChildren().add(sante2);
    this.getChildren().add(sante3);
    this.getChildren().add(sante4);
    this.getChildren().add(sante5);
    
    sante3.setTranslateY(15);
    sante5.setTranslateY(26);
    sante4.setTranslateX(15);
    sante4.setTranslateY(15);
    
    
    
	
	
	setTranslateX(x);
    setTranslateY(y);
}



}
