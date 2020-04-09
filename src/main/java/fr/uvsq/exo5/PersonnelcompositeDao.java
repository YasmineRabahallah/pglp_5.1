package fr.uvsq.exo5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonnelcompositeDao implements Dao<Personnelcomposite> {

	public Personnelcomposite create(Personnelcomposite obj) {
		try {
			FileOutputStream fos = new FileOutputStream("groupe"+obj.getid());
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

	public Personnelcomposite retrieve(String s) {
		File f = new File(s);
		Personnelcomposite p = null ;
		if(f.exists()){
		try {
			FileInputStream fis = new FileInputStream(s);
			ObjectInputStream ois = new ObjectInputStream(fis);
			p = (Personnelcomposite)ois.readObject();		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		} else {
			System.out.println("Does not Exists");
		}
		return p;
	}

	public Personnelcomposite update(Personnelcomposite obj) {
		File f = new File("groupe"+obj.getid());
		if(f.exists()){
			try {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(obj);
				oos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("Does not Exists");
		}
		return obj;
	}

	public void delete(Personnelcomposite obj) {
		File f = new File("groupe"+obj.getid());
		if(f.exists()){
			f.delete();
		} else {
			System.out.println("Does not Exists");
		}
		
		
	}

}
