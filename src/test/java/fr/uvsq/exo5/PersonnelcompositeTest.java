package fr.uvsq.exo5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class PersonnelcompositeTest {
	Dao<Personnelcomposite> dao ;
	@Test
	public void createtest(){
		File f = new File("groupe1");
		f.delete();
		Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		Personnel p2 = new Personnel.Builder("khait", "hayet","chargé d'equipe").build();
		Personnelcomposite g1 = new Personnelcomposite(1);
		g1.add(p1);
		g1.add(p2);
		dao = new PersonnelcompositeDao();
		assertFalse(f.exists());
		dao.create(g1);
		assertTrue(f.exists());
		}
	@Test
	public void retrievetest(){
		dao = new PersonnelcompositeDao();
		Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		Personnel p2 = new Personnel.Builder("khait", "hayet","chargé d'equipe").build();
		Personnelcomposite g2 = new Personnelcomposite(2);
		g2.add(p1);
		g2.add(p2);
		dao.create(g2);
		Personnelcomposite g3= dao.retrieve("groupe2");
		assertEquals(g3.getPersonnes().size(),2);
		}
	@Test
	public void updatetest(){
		dao = new PersonnelcompositeDao();
		Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		Personnel p2 = new Personnel.Builder("khait", "hayet","chargé d'equipe").build();
		Personnelcomposite g3 = new Personnelcomposite(3);
		g3.add(p1);
		dao.create(g3);
		assertEquals(g3.getPersonnes().size(),1);
		g3.add(p2);
		dao.update(g3);
		Personnelcomposite g = dao.retrieve("groupe3");
		assertEquals(g.getPersonnes().size(),2);
		}
	@Test
	public void deletetest(){
		File f = new File("groupe4");
		dao = new PersonnelcompositeDao();
		Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		Personnelcomposite g4 = new Personnelcomposite(4);
		g4.add(p1);
		dao.create(g4);
		assertTrue(f.exists());
		dao.delete(g4);
		assertFalse(f.exists());
		
		
		}
	
	
	
	

}
