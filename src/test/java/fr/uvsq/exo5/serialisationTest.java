package fr.uvsq.exo5;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Assert;
import org.junit.Test;


public class serialisationTest {
	@Test
	public void saveObject(){
		Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		try {
			FileOutputStream fos = new FileOutputStream("file") ;
			ObjectOutputStream oos = new ObjectOutputStream(fos) ;
			oos.writeObject(p1);
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void saveObject2(){
		Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		Personnelcomposite g1 = new Personnelcomposite(1);
		g1.add(p1);
		try {
			FileOutputStream fos = new FileOutputStream("file") ;
			ObjectOutputStream oos = new ObjectOutputStream(fos) ;
			oos.writeObject(p1);
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void readObject(){
		try {
			Personnel p1 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
			FileInputStream fis = new FileInputStream("file") ;
			ObjectInputStream ois = new ObjectInputStream(fis);
			Personnel p = (Personnel) ois.readObject() ;
			assertEquals(p.getNom(),"rabahallah");
			assertEquals(p.getPrenom(),"yasmine");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
