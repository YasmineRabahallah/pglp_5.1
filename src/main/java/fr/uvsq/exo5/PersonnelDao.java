package fr.uvsq.exo5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonnelDao implements Dao<Personnel>{

	public Personnel create(Personnel obj) {
		try {
			FileOutputStream fos = new FileOutputStream(obj.getNom());
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	public Personnel retrieve(String s) {
		File f= new File(s);
		Personnel p = null;
		if(f.exists()){
		try {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			p = (Personnel) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
			System.out.println("Does not Exists");
		}
	    return p;
	}

	public Personnel update(Personnel obj) {
		File f = new File(obj.getNom());
		if(f.exists()){
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} else {
			System.out.println("Does not Exists");
		}
		
		
		return obj;
	}

	public void delete(Personnel obj) {
		File f = new File(obj.getNom());
		if(f.exists()){
			f.delete();
		} else {
			System.out.println("Does not Exists");
		}		
	}

	

}
