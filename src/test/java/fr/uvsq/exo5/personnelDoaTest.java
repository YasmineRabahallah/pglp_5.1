package fr.uvsq.exo5;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class personnelDoaTest {
	Dao<Personnel> dao1;
	@Test
	public void createtest(){
		File f = new File("rabahallah");
		f.delete();
		 dao1= new PersonnelDao();
		Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		assertFalse(f.exists());
		dao1.create(p1);
		assertTrue(f.exists());
		
	}
	@Test
	public void updatetest(){
		dao1=new PersonnelDao();
		Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		Personnel p2 = new Personnel.Builder("rabahallah", "hayet","chargé de missions").build();
		dao1.create(p1);
		p1=p2;
		dao1.update(p2);
		Personnel p = dao1.retrieve("rabahallah");
		assertEquals(p.getPrenom(),"hayet");
		}
	@Test
	public void deletetest(){
		File f = new File("arkoub");
		dao1=new PersonnelDao();
		Personnel p1 = new Personnel.Builder("arkoub", "achor","chargé de mission").build();
        dao1.create(p1);
		assertTrue(f.exists());
		dao1.delete(p1);
		assertFalse(f.exists());
		}
	@Test
	public void retrievetest(){
		dao1=new PersonnelDao();
		Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		dao1.create(p1);
		Personnel p = dao1.retrieve("rabahallah");
		assertEquals(p.getPrenom(),"yasmine");
		}
	
	
}
 
