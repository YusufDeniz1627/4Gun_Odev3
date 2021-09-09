package Adapters;

import java.rmi.RemoteException;



import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import Abstract.IUserCheckService;
import Entities.User;

public class MernisServiceAdapter implements IUserCheckService{
	
	static KPSPublicSoapProxy kps = new KPSPublicSoapProxy();
	
	static boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException {
			
			
			boolean result = kps.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),user.getDateOfBird());
			if(result == true) {
				System.out.println("Kaydedildi.");
				return true;
			}else{
				System.out.println("Kaydedilemedi.");
				return false;
			}
	}
}
