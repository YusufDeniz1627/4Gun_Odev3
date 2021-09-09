package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface UserService {
void Add(User user) throws NumberFormatException, RemoteException;
void Delete(User user)throws NumberFormatException, RemoteException;
void Update(User user)throws NumberFormatException, RemoteException;
}
