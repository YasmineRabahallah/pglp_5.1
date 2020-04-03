package fr.uvsq.exo5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class personnel_composite  implements InterfacePersonnel , Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * liste des personnels 
	 */
     private  ArrayList<InterfacePersonnel>  personnes ;
     /**
      * id de groupe de personnels 
      */
     private int id;
     /**
      * constructeur de personnel_composite 
      * @param id de groupe 
      */
     public personnel_composite(int id ){
    	 this.id= id ;
    	 personnes= new ArrayList<InterfacePersonnel>();
     }
     /**
      * ajouter un personnel
      * @param personnel personnel a ajouter 
      */
     public void add( InterfacePersonnel personnel){
    	 personnes.add(personnel);
     }
     /**
      * supprimer un personnel
      * @param personnel personnel a supprimer 
      */
     public void remove( InterfacePersonnel personnel ){
    	 if (personnes.contains(personnel))
    		 personnes.remove(personnel);
    	 else
    		 System.out.println("l'element n'existe pas ");
    		 
    }
     /**
      * 
      * @return id de groupe personnels
      */
     public int getid(){
    	 return id ;
     }
     /**
      * affichage les informations de tous les personnels du groupe 
      */
	public String print() {
		String s="" ;
		for ( InterfacePersonnel p :personnes ){
			s += " "+p.print() ;
		}
		return "id groupe ="+id +" "+ s ;
	}
		
	/**
	 * 
	 * @return listePersonnel liste des personnels 
	 */
	public ArrayList<InterfacePersonnel> getPersonnes() {
		return personnes;
	}
	}
	
	

