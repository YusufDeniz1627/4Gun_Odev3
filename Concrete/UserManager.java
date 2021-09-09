package Concrete;

import java.rmi.RemoteException;

import Abstract.IUserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	IUserCheckService userCheckService;
	
	public UserManager(IUserCheckService ýuserCheckService) {
		this.userCheckService = ýuserCheckService ;
	}
	
	@Override
	public void Add(User user)throws NumberFormatException, RemoteException {
		if(IUserCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName()+" Ýsimli Kullanýcý Kayýt Edildi.");
		}else {
			System.out.println(user.getFirstName()+" Ýsimli Kullanýcý Kayýt Edilemedi.");
		}
		}
		
	

	@Override
	public void Delete(User user) {
		System.out.println(user.getFirstName()+" Ýsimli Kullanýcý Silinidi.");
		
	}

	@Override
	public void Update(User user) {
		System.out.println(user.getFirstName()+" Ýsimli Kullanýcý Güncellendi.");
		
	}
	
}
