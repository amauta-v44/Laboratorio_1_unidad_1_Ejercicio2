package lab13;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CreaObjeto {
	
	public static void main(String[] args) {
		
		
		Usuario miusuario=new Usuario();
		System.out.println(miusuario);
		
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("user.out"));
			o.writeObject(miusuario);
			o.close();
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
