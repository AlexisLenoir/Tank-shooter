package unchartroploin;

import javafx.scene.Group;
import javafx.scene.Parent;

public class Foret extends Parent {
	
	double[][] pos;
	Arbre [] tableauArbre;
	
	
	
	public Foret (int nbArbre, double sol, double taille, Group root ) {
		
		
		
		 tableauArbre = new Arbre [nbArbre];
		 positionAbres(taille, nbArbre, sol);
		 double echelle;
		 for ( int k=0; k < nbArbre; k++ )
		{	
			 echelle = 1 + Math.random()*2;
			tableauArbre[k] = new Arbre(      pos[k][0]     ,      pos [k][1]  ) ;
			
			this.getChildren().add(tableauArbre[k]); 
			
		}
		 root.getChildren().add(this); 
	}
	
	
	

	
	private void positionAbres (double taille, int nbArbre, double sol) {
		
		
		this.pos = new double[nbArbre][2];
		for ( int k = 0; k < nbArbre; k++)
		{
		   pos [k] [0] = Math.random()*taille;
		   pos [k] [1] = sol ;
		   
		}
		
		
		
		
	}
	
	
	

}
