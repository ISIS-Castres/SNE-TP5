import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("--> Utilisation de collections = ArrayList");

    // ---- création d'une liste de patients
    ArrayList<Patient>  lPatients = new ArrayList<Patient>();
    // la méthode "add" de la classe ArrayListe permet
    //   d'ajouter un elt en fin de tableau
    lPatients.add(new Patient("Dupont","Jean",1.78, 65));
    lPatients.add(new Patient("Durand","Leon",1.83, 110));
    lPatients.add(new Patient("Leroy","Leon",1.74, 85));
    // --- affichage de la liste
    System.out.println("--> liste initiale : ");
    

    // --- calcul du poids moyen
    System.out.println("--> poids moyen : ");
    
    // --- ajout d'un patient si pas présent
    System.out.println("--> ajout fait : ");
    
    // --- ajout d'un patient déjà présent
    System.out.println("--> ajout fait : ");

    // --- supprimer un patient présent dans la liste
    System.out.println("--> supp faite : ");
    
    // --- supprimer un patient absent dans la liste
    System.out.println("--> supp faite : ");
   
    // ---- suppresion des patients < à une taille données
    System.out.println("--> liste apres suppression taille < 1.75 :");
    
    // --- tableau des "Leon"
    System.out.println("--> liste des 'Leon' : ");
    
  }
  /* 
   Afficher une liste de patients
   données : 
   résultat :
  */

  
  /*
   Poids moyen
   données : 
   résultats : 
  */ 
 
  /* 
   Ajouter un patient dans une collection 
     (en verifiant qu'il ne soit pas déjà présent)
   données :       
   résultats :     
  */

  /* 
   supprimer un patient (en vérifiant qu'il soit présent)
   données : 
   résultats : 
  */ 

  /* 
   supprimer des patients dont la taille < valeur donnée
   données : 
   résultats :  
  */ 

  /*
   Créer un tableau contenant les patients portant un prénom donné
   données : 
   résultats : 
  */

}