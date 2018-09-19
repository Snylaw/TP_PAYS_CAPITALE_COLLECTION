import java.util.Scanner;

public class Main {
	
	private static Scanner clavier;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		clavier = new Scanner(System.in);
		
		String nom;
		String langue;
		String monnaie;
		String capitale;
		int nbHabitant;
		int superficie;
		int choix;
		
		Pays unPays = new Pays();
		Ville uneVille = null;		
		
		//Samuel Umtiti
		
		//Menu
		/*
        do{
            System.out.println("TABLEAUX");
            System.out.println("\t 1- Ajouter une ville.");
            System.out.println("\t 2- Rechercher une ville.");
            System.out.println("\t 3- Supprimer une ville.");
            System.out.println("\t 0- Quitter");
            System.out.println("Votre choix ?");
            choix = clavier.nextInt();

            switch (choix){
                case 1:
                    System.out.println("Ajouter une ville\n");
                    
                    System.out.println("\nNom de la ville :");
                    nom = clavier.nextLine();
                    
                    clavier.nextLine();
                    
                    System.out.println("\nNombre d'habitant de la ville :");
                    nbHabitant = clavier.nextInt();
                    
                    clavier.nextLine();
                    
                    System.out.println("\nSuperficie de la ville :");
                    superficie = clavier.nextInt();
                    
                    uneVille = new Ville(nom,nbHabitant,superficie);
                    		
                    unPays.ajouterUneVille(uneVille);
                    
                    break;
                case 2:
                    System.out.println("Rechercher une ville.\n");
                    
                    break;

                case 3:
                    System.out.println("Supprimer une ville.\n");
                    clavier.nextLine();                     
                    
                    break;

                case 0:
                    System.out.println("Fin du programme.");
                    break;
                default:
                    System.out.println("Ce choix n'existe pas.");
                    break;
            }
        } while (choix != 0);*/
		do {
	        System.out.println("-------- MENU --------\n"
	                + "1. Liste des villes\n"
	                + "2. Ajouter une ville\n"
	                + "3. Supprimer une ville\n"
	                + "4. Rechercher une ville\n"
	                + "0. Quitter");
	        System.out.println("Quel est votre choix ?");
	        choix = clavier.nextInt();
	        clavier.nextLine();
	        
	        switch(choix) {
	            case 1 : 
	                System.out.println(unPays.toString());
	                break;

	            case 2 : 
	            	System.out.println("\nNom de la ville :");
                    nom = clavier.nextLine();
                    
                    clavier.nextLine();
                    
                    System.out.println("\nNombre d'habitant de la ville :");
                    nbHabitant = clavier.nextInt();
                    
                    clavier.nextLine();
                    
                    System.out.println("\nSuperficie de la ville :");
                    superficie = clavier.nextInt();
                    
	            	uneVille = new Ville(nom, nbHabitant,superficie);
	            	unPays.ajouterUneVille(uneVille);
	            	System.out.println("Ville ajouté.");
	            	
	                break;

	            case 3 :
	            	System.out.println("Saisir le nom de l'animal à supprimer :");
	            	nom = clavier.nextLine();
	            	if (unPays.rechercher(nom)) {
	            		uneVille = unPays.rechercheVille(nom);
	            		unPays.supprimerUneVille(uneVille);
	            		System.out.println("Ville supprimé.");
	            	}
	            	else {
	            		System.out.println("La ville ne peut pas être supprimé");
	            	}
	            	break;

	            case 4 :
	            	System.out.println("Recherche d'une ville :");
	            	nom = clavier.nextLine();
	                System.out.println(unPays.rechercher(nom));
	                break;

	            case 0 : 
	            	System.out.println("Vous avez quitté la liste.");
	                break;
	            
	            default :
	            	System.out.println("Erreur de saisie, veuillez saisir à nouveau.");
	        }
	        
	        System.out.println();
	    }while(choix != 0);
    }
}
