public class Capitale extends Ville{
	
	private String nom;
	private int nbHabitants;
	private int superficie;
	
	
	// Constructeurs
	public Capitale(){
		
	}
		
	public Capitale (String unNom,int unNbHabitant, int uneSuperficie){
		super();
		this.nom = unNom;
		this.nbHabitants = unNbHabitant;
		this.superficie = uneSuperficie;
	}
	
	// Accesseurs
	
	public String getNom(){
        return this.nom;
    }
	
    public void setNom(String unNom){
        this.nom = unNom;
    }
    
    public int getNbHabitants(){
        return this.nbHabitants;
    }
	
    public void setNbHabitants(int unNbHabitant){
        this.nbHabitants = unNbHabitant;
    }
    
    public int getSuperficie(){
        return this.superficie;
    }
	
    public void setSuperficie(int uneSuperficie){
        this.superficie = uneSuperficie;
    }
		
    // Methode toString
    
    public String toString(){
        String chaine = "Nom de la capitale : " + this.nom + 
        				"\nNombre d'habitant : " + this.nbHabitants +
        				"\nSuperficie : " + this.superficie;

        return chaine;
    }

}
