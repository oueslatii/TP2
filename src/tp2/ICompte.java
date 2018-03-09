
package tp2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICompte extends Remote{
	public void debiter(double m) throws RemoteException;
	public void criditer(double m) throws RemoteException;
	public String liremontant() throws RemoteException;
}
