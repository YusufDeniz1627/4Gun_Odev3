package Concrete;

import Abstract.OfferService;
import Entities.Offer;

public class OfferManager implements OfferService{

	@Override
	public void Add(Offer offer) {
		System.out.println(offer.getOfferName()+" Kampanyasý Eklenmiþtir." );
		
	}

	@Override
	public void Delete(Offer offer) {
		System.out.println(offer.getOfferName()+" Kampanyasý Silinmiþtir." );
		
	}

	@Override
	public void Update(Offer offer) {
		System.out.println(offer.getOfferName()+" Kampanyasý Guncellenmiþtir." );
		
	}
	
}	
