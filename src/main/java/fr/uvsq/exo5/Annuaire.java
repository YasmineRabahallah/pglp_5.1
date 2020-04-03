package fr.uvsq.exo5;

import java.io.Serializable;
import java.util.ArrayList;

public class Annuaire implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Annuaire INSTANCE ;
	private  ArrayList<InterfacePersonnel> list = new ArrayList<InterfacePersonnel>() ;
	public Annuaire(){
	}
	public static Annuaire getinstance(){
		if(INSTANCE == null){
			INSTANCE = new Annuaire ();
		}
		return INSTANCE ;
	}
	public void addAnnuaire(InterfacePersonnel p){
		list.add(p);
	}
	public void removeAnnuaire(InterfacePersonnel p){
	    	 if (list.contains(p))
	    		 list.remove(p);
	    	 else
	    		 System.out.println("l'element n'existe pas ");
	    		 
	    }
	
	public void affichageAnnuaire(){
		for (InterfacePersonnel p : list){
			System.out.println(p.print());
		}
	}
	
	

}
