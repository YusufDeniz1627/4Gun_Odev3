package Concrete;

import Abstract.OfferService;
import Entities.Offer;

public class OfferManager implements OfferService{

	@Override
	public void Add(Offer offer) {
		System.out.println(offer.getOfferName()+" Kampanyası Eklenmiştir." );
		
	}

	@Override
	public void Delete(Offer offer) {
		System.out.println(offer.getOfferName()+" Kampanyası Silinmiştir." );
		
	}

	@Override
	public void Update(Offer offer) {
		System.out.println(offer.getOfferName()+" Kampanyası Guncellenmiştir." );
		
	}
	
}	
