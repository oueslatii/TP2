package tp2;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class TestServer {
	public static void main(String[]args){
		try{
			LocateRegistry.createRegistry(1099);
			CompteImp obj= new CompteImp();
			Naming.rebind("rmi://localhost:1099/HelloServer", obj);
			System.out.println(obj.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
			
		
	}

}

