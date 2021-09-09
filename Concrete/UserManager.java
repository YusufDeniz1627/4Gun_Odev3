package Concrete;

import java.rmi.RemoteException;

import Abstract.IUserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	IUserCheckService userCheckService;
	
	public UserManager(IUserCheckService �userCheckService) {
		this.userCheckService = �userCheckService ;
	}
	
	@Override
	public void Add(User user)throws NumberFormatException, RemoteException {
		if(IUserCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName()+" �simli Kullan�c� Kay�t Edildi.");
		}else {
			System.out.println(user.getFirstName()+" �simli Kullan�c� Kay�t Edilemedi.");
		}
		}
		
	

	@Override
	public void Delete(User user) {
		System.out.println(user.getFirstName()+" �simli Kullan�c� Silinidi.");
		
	}

	@Override
	public void Update(User user) {
		System.out.println(user.getFirstName()+" �simli Kullan�c� G�ncellendi.");
		
	}
	
}
