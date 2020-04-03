package fr.uvsq.exo5;

import java.util.ArrayList;
/**
 * 
 * @author rabahallah yasmine
 *
 */
public class AffichageParGroupe   {
	private  ArrayList<InterfacePersonnel> list ;
	/**
	 * 
	 * @param root  la racine de hiérarchique de l’organisation
	 */
     public AffichageParGroupe( InterfacePersonnel root){
    	 list = new ArrayList<InterfacePersonnel>() ;
		this.list.add(root) ;
	}
 	/**
 	 * 
 	 * @return Iretator
 	 */
 	public Iterator getIterator(){
         return new groupeIterator();
     }
     /**
      * 
      * @author rabahallah yasmine
      *
      */
	private class groupeIterator implements Iterator {
		/**
		 * 
		 */
	public groupeIterator(){
		int verifie =0;
		while (verifie< list.size()){
			
		   if (list.get(verifie) instanceof personnel_composite ){
			   for(InterfacePersonnel p : list.get(verifie).getPersonnes()) {
					list.add(p);
				}
			   
		   }
		   verifie++ ;
		}
	}
	
	private int position=0;
	
	public boolean hasNext() {
			if (position < list.size()) {
					
					return true;
			}
			 return false;
		}

	public InterfacePersonnel Next() {
		if(this.hasNext()){
		InterfacePersonnel p = list.get(position++);
		return p;
		}
		else
		{
			return null ;
		}
	}
  }


}
