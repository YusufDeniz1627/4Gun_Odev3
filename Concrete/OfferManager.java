package Concrete;

import Abstract.OfferService;
import Entities.Offer;

public class OfferManager implements OfferService{

	@Override
	public void Add(Offer offer) {
		System.out.println(offer.getOfferName()+" Kampanyas� Eklenmi�tir." );
		
	}

	@Override
	public void Delete(Offer offer) {
		System.out.println(offer.getOfferName()+" Kampanyas� Silinmi�tir." );
		
	}

	@Override
	public void Update(Offer offer) {
		System.out.println(offer.getOfferName()+" Kampanyas� Guncellenmi�tir." );
		
	}
	
}	
