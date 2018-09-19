import java.util.ArrayList;

public class Pays {
	
	private String nom;
	private String langue;
	private String monnaie;
	private String capitale;
	
	private Capitale saCapitale;
	
	private ArrayList<Ville> listeVilles;
	
	// Constructeurs
	public Pays(){
		
	}
	
	public Pays (String unNom,String uneLangue, String uneMonnaie, String uneCapitale){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.capitale = uneCapitale;
		
		this.listeVilles = new ArrayList <Ville>();
	}
	
	// Accesseurs
	
	public String getNom(){
        return this.nom;
    }
	
    public void setNom(String unNom){
        this.nom = unNom;
    }
    
    // Méthode getNomMaj
	
	public String getNomMaj(){
		return (this.nom.toUpperCase());
	}
	
	// Méthode getNomMajMin
	
	public String getNomMajMin(){
		String maj = this.nom.substring(0,1).toUpperCase();
		String min = this.nom.substring(1).toLowerCase();
		return(maj+min);
	}
	
	// Methode getCompteurPays
	
	public int getCompteurVille(){
		return this.listeVilles.size();
	}
	
	// Methode ajouterUneVille 
	
	public void ajouterUneVille(Ville uneVille){
		this.listeVilles.add(uneVille);
	}
	
	/* Methode supprimer une ville */
	
	public void supprimerUneVille(Ville uneVille){
		this.listeVilles.remove(uneVille);
	}
	
	/* Methode recherche une ville */
	
	public Ville rechercheVille(String nom) {
		int i = 0;
		int taille = listeVilles.size();
		boolean trouver = false;
		while (i < taille && trouver == false) {
			if (nom.equals(this.listeVilles.get(i).getNom())) {
				trouver = true;
			}
			else {
				i++;
			}
		}
		if (trouver) {
			return this.listeVilles.get(i);
		}
		else {
			return null;
		}
	}
	
	public boolean rechercher(String nom) {
		int i = 0;
		int taille = listeVilles.size();
		boolean trouver = false;
		while (i < taille && trouver == false) {
			if (nom.equals(this.listeVilles.get(i).getNom())) {
				trouver = true;
			}
			else {
				i++;
			}
		}
		if (trouver) {
			return true;
		}
		else {
			return false;
		}
	}
		
    // Methode toString
    
    public String toString(){
    	String chaine = "Nom : " + getNomMajMin() + 
						"\nLangue : " + this.langue +
						"\nMonnaie : " + this.monnaie + 
						"\nCapitale : " + this.capitale +
						"--------------------------------";
    	
    	if(getCompteurVille() == 0){
    		chaine += "\nLe pays ne contient aucune Ville.";
    	}
    	else
    	{
    		for(int i = 0 ; i < getCompteurVille() ; i ++){
    			chaine += "\n" + this.listeVilles.get(i).toString();
    		}
    	}    

        return chaine;
    }

}
