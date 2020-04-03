package fr.uvsq.exo5;

public interface Iterator<InterfacePersonnel> {
	/**
	 * 
	 * @return un booleen si il ya un element dans notre liste
	 */
	boolean hasNext();
	/**
	 * 
	 * @return return l'element suivant 
	 */
	InterfacePersonnel Next() ;

}
