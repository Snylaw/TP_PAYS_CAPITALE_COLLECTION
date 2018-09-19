public class Ville {
	
	private String nom;
	private int nbHabitants;
	private int superficie;
	private Pays sonPays;
	
	
	// Constructeurs
	public Ville(){
		
	}
	
	public Ville(String unNom,int unNbHabitant, int uneSuperficie){
		this.nom = unNom;
		this.nbHabitants = unNbHabitant;
		this.superficie = uneSuperficie;
	}
	
	public Ville(String unNom,int unNbHabitant, int uneSuperficie, Pays unPays){
		this.nom = unNom;
		this.nbHabitants = unNbHabitant;
		this.superficie = uneSuperficie;
		this.sonPays = unPays;
		this.sonPays.ajouterUneVille(this);
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
        String chaine = "Nom de la ville : " + this.nom + 
        				"\nNombre d'habitant : " + this.nbHabitants +
        				"\nSuperficie : " + this.superficie;

        return chaine;
    }

}
