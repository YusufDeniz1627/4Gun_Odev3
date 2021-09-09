package Concrete;

import Abstract.GameSale;
import Entities.Game;
import Entities.Offer;
import Entities.User;

public class GameSaleManager implements GameSale{

	@Override
	public void sale(User user, Game game, Offer offer) {

		double lastPrice = game.getPrice() - (game.getPrice()*offer.getDiscount()/100);
		
		System.out.println(user.getFirstName()+" �simli Oyuncuya "+game.getPrice()+"TL Fiyat�ndaki "+game.getGameName()+" �simli Oyun "
		+offer.getOfferName()+" Kampanyas� �le Y�zde "+offer.getDiscount()+" �ndirimle "+lastPrice+" Fiyata Sat�lm��t�r.")                  ;
		
	}

}
