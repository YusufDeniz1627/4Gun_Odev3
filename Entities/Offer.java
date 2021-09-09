package Entities;

import java.time.LocalDate;

public class Offer {
	int Id;
	String OfferName;
	int Discount;
	LocalDate StartOffer;
	LocalDate EndOffer;
	
	// Field
	public Offer(int id, String offerName, int discount, LocalDate startOffer, LocalDate endOffer) {
		super();
		Id = id;
		OfferName = offerName;
		Discount = discount;
		StartOffer = startOffer;
		EndOffer = endOffer;
	}
	
	
	//Getter and Setter
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getOfferName() {
		return OfferName;
	}
	public void setOfferName(String offerName) {
		OfferName = offerName;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	public LocalDate getStartOffer() {
		return StartOffer;
	}
	public void setStartOffer(LocalDate startOffer) {
		StartOffer = startOffer;
	}
	public LocalDate getEndOffer() {
		return EndOffer;
	}
	public void setEndOffer(LocalDate endOffer) {
		EndOffer = endOffer;
	}
}	
