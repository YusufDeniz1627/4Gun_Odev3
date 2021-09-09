package Concrete;

import Abstract.GameSale;
import Entities.Game;
import Entities.Offer;
import Entities.User;

public class GameSaleManager implements GameSale{

	@Override
	public void sale(User user, Game game, Offer offer) {

		double lastPrice = game.getPrice() - (game.getPrice()*offer.getDiscount()/100);
		
		System.out.println(user.getFirstName()+" Ýsimli Oyuncuya "+game.getPrice()+"TL Fiyatýndaki "+game.getGameName()+" Ýsimli Oyun "
		+offer.getOfferName()+" Kampanyasý Ýle Yüzde "+offer.getDiscount()+" Ýndirimle "+lastPrice+" Fiyata Satýlmýþtýr.")                  ;
		
	}

}
