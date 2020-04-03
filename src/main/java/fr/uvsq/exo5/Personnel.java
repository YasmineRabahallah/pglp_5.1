package fr.uvsq.exo5;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 * 
 * la classe personnel 
 * @author rabahallah yasmine
 *
 */
public  final class Personnel  implements InterfacePersonnel ,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * nom d une personne 
	 */
	private final String nom ;
	/**
	 * prenom d une personne 
	 */
	private final  String prenom ;
	/**
	 * telephone
	 */
	private    ArrayList<String> telephone ;
	/**
	 * fonctions
	 */
	private final  String fonction ;
	/**
	 * la date de naissance
	 */
	private  LocalDate  dateDeNaissance ;
	
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	
	public String getFonction() {
		return fonction;
	}
	public ArrayList<String> getTelephone() {
		return telephone;
	}
	private Personnel (Builder builder) {
		
		this.nom =  builder.nom;
		this.prenom =  builder.prenom;
		this.fonction =  builder.fonction;
		this.dateDeNaissance= builder.dateDeNaissance;
		this.telephone=builder.telephone ;
		
	}
	
	public static class Builder 
    {   
		/**
		 * nom de la personne 
		 */
        private final String nom;
        /**
         * prenom de la personne
         */
        private final String prenom;
        /**
         * fonction de la personne
         */
        private final String fonction;
        /**
    	 * la date de naissance
    	 */
        private LocalDate dateDeNaissance; 
        /**
         * numero de tel de la personne
         */

		private  ArrayList<String> telephone = new ArrayList<String>();
        
        public Builder(String nom, String prenom , String fonction) {
            this.nom=nom ;
            this.prenom=prenom;
            this.fonction=fonction ;
        }
        /**
         * 
         * @param dateDeNaissance date
         * @return instance
         */
        public Builder date(LocalDate  dateDeNaissance) {
            this. dateDeNaissance =  dateDeNaissance;
            return this;
        }
        /**
         * 
         * @param telephone number de telephone
         * @return instance
         */
        public Builder telephone(String  telephone) {
            this.telephone.add(telephone);
            return this;
        }
        /**
         * 
         * @return new objet personnel
         */
        public Personnel build ( ) {
			 return new Personnel ( this ) ;
			 }
		
		
	}

	public String print() {
		   return "name " + this.getNom();

		
	}
	public ArrayList<InterfacePersonnel> getPersonnes() {
		return null;
	}

}
