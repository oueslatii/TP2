
package tp2;

import java.rmi.Naming;


public class TestClient {
public static void main(String[]args){
	ICompte obj;
	String montant,m1,m2;
try{
	obj=(ICompte)Naming.lookup("rmi://localhost:1099/HelloServer");
	montant=obj.liremontant();
	System.out.println(montant);
	obj.criditer(500);
	m1=obj.liremontant();
	System.out.println(m1);
	obj.debiter(1000);
	m2=obj.liremontant();
	System.out.println(m2);
}catch(Exception e){
	e.printStackTrace();
}
}}
