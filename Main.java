
import java.rmi.RemoteException;
import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.OfferManager;
import Concrete.UserManager;
import Entities.Game;
import Entities.Offer;
import Entities.User;

public class Main {



	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		//User
		User user = new User(1, "Yusuf", "Deniz", 2006, "11111111");
		UserManager userManager = new UserManager(new MernisServiceAdapter());		
		userManager.Add(user);
	
		//Game
		Game game = new Game(1, "Red Dead Redeption 2", "Action",1500);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
	
		//Offer
		Offer offer1 = new Offer(1, "Kýþ Sezonu Ýndirimi", 15, LocalDate.of(2021, 9, 10), LocalDate.of(2021, 9, 15));
		OfferManager offerManager = new OfferManager();
		offerManager.Add(offer1);
		
		//Sale
		GameSaleManager gameSaleManager =  new GameSaleManager();
		gameSaleManager.sale(user, game, offer1);
	
	}


	
	
	
}
