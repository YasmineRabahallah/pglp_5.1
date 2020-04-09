package fr.uvsq.exo5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class AfficheIteratorGroupeTest {
	@Test
	public void test1(){
		
		Personnelcomposite g1 = new Personnelcomposite(1);
		Personnelcomposite g2 = new Personnelcomposite(2);
		Personnelcomposite g3 = new Personnelcomposite(3);
		Personnelcomposite g4 = new Personnelcomposite(4);
		Personnelcomposite g5 = new Personnelcomposite(5);
		Personnelcomposite g6 = new Personnelcomposite(6);
		Personnelcomposite g7 = new Personnelcomposite(7);
		Personnelcomposite g8 = new Personnelcomposite(8);
		Personnelcomposite g9 = new Personnelcomposite(9);
		Personnelcomposite g10 = new Personnelcomposite(10);
		g1.add(g2);
		g1.add(g3);
		g1.add(g4);
		
		g2.add(g5);
		g2.add(g6);
		g3.add(g7);
		g3.add(g8);
		g4.add(g9);
		g5.add(g10);
		 ArrayList<Ipersonnel> list = new ArrayList<Ipersonnel>() ;
		  list.add(g1);
		  list.add(g2);
		  list.add(g3);
		  list.add(g4);
		  list.add(g5);
		  list.add(g6);
		  list.add(g7);
		  list.add(g8);
		  list.add(g9);
		  list.add(g10);
		  ArrayList<Ipersonnel> list2 = new ArrayList<Ipersonnel>() ;
		  AffichageParGroupe af = new  AffichageParGroupe(g1);
			Iterator it = af.getIterator();
			do{
				Ipersonnel pr = (Ipersonnel)it.next();
				list2.add(pr);
			}while (it.hasNext()) ;
		 
			assertEquals(list, list2); 
		}
	@Test
	public void test2(){
		
		Personnelcomposite g1 = new Personnelcomposite(1);
		Personnelcomposite g2 = new Personnelcomposite(2);
		Personnelcomposite g3 = new Personnelcomposite(3);
		Personnelcomposite g4 = new Personnelcomposite(4);
		Personnelcomposite g5 = new Personnelcomposite(5);
		Personnelcomposite g6 = new Personnelcomposite(6);
		Personnelcomposite g7 = new Personnelcomposite(7);
		Personnelcomposite g8 = new Personnelcomposite(8);
		Personnelcomposite g9 = new Personnelcomposite(9);
		Personnelcomposite g10 = new Personnelcomposite(10);
		g7.add(g1);
		g7.add(g5);
		g7.add(g3);
		g1.add(g2);
		g1.add(g4);
		g3.add(g6);
		g3.add(g8);
		g2.add(g9);
		g2.add(g10);
		ArrayList<Ipersonnel> list = new ArrayList<Ipersonnel>() ;
		  list.add(g7);
		  list.add(g1);
		  list.add(g5);
		  list.add(g3);
		  list.add(g2);
		  list.add(g4);
		  list.add(g6);
		  list.add(g8);
		  list.add(g9);
		  list.add(g10);
		  ArrayList<Ipersonnel> list2 = new ArrayList<Ipersonnel>() ;
		  AffichageParGroupe af = new  AffichageParGroupe(g7);
				Iterator it = af.getIterator();
				do{
					Ipersonnel pr = (Ipersonnel)it.next();
					list2.add(pr);
				}while (it.hasNext()) ;
			 
				assertEquals(list, list2); 
			}
	
}
