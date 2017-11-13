package unchartroploin;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Nuage extends Parent {
	
	
	Rectangle corps = new Rectangle(75,40, Color.DEEPSKYBLUE);
	Circle contour1 = new Circle ( 15,Color.DEEPSKYBLUE);
	Circle contour2 = new Circle ( 15,Color.DEEPSKYBLUE);
	Circle contour3 = new Circle ( 15,Color.DEEPSKYBLUE);
	Circle contour4 = new Circle ( 15,Color.DEEPSKYBLUE);
	Circle contour5 = new Circle ( 15,Color.DEEPSKYBLUE);
	Circle contour6 = new Circle ( 15,Color.DEEPSKYBLUE);
	Circle contoura = new Circle ( 20,Color.DEEPSKYBLUE);
	Circle contourb = new Circle ( 20,Color.DEEPSKYBLUE);
	
	Circle contourc = new Circle ( 15,Color.DEEPSKYBLUE);
	
	
	
	
	public Nuage (double x, double y) {
		
		this.getChildren().add(corps);
		this.getChildren().add(contour1);
		this.getChildren().add(contour2);
		this.getChildren().add(contour3);
		this.getChildren().add(contour4);
		this.getChildren().add(contour5);
		this.getChildren().add(contour6);
		this.getChildren().add(contoura);
		this.getChildren().add(contourb);
		this.getChildren().add(contourc);
		
		
		  contour1.setTranslateX(10);
		  contour2.setTranslateX(30);
		  contour3.setTranslateX(50);
		  
		  contour4.setTranslateX(10);
		  contour5.setTranslateX(30);
		  contour6.setTranslateX(50);
		  contour4.setTranslateY(40);
		  contour5.setTranslateY(40);
		  contour6.setTranslateY(40);
		  
		  
		  contoura.setTranslateY(15);
		  
		  contourb.setTranslateY(15);
		  contourb.setTranslateX(65);
		  
		  contourc.setTranslateX(65);
		  contourc.setTranslateY(30);
		  
		  
		  
		
		
		setTranslateX(x);
		setTranslateY(y);
	}
	
	

}
