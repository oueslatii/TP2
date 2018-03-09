package tp2;
	import java.rmi.RemoteException;
	import java.rmi.server.UnicastRemoteObject;
	public class CompteImp extends UnicastRemoteObject implements ICompte{
		double montant=10000;
		public CompteImp() throws RemoteException{
			super();
		}
       public String liremontant() throws RemoteException {
    	   return("le montant est:"+montant);
	   }
	@Override
	public void debiter(double m) throws RemoteException {
		// TODO Auto-generated method stub
		montant=montant+m;
		
		
	}
	@Override
	public void criditer(double m) throws RemoteException {
		// TODO Auto-generated method stub
		montant=montant-m;
		
		
	}
	}


