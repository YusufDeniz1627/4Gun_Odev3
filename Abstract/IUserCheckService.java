package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface IUserCheckService {
	  static boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException {
		
		return false;
	}
}
