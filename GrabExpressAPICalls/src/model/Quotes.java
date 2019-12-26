package model;

import java.util.List;

public class Quotes {

	List<QuoteParam> quotes;
	List<Package> packages;
	Place origin;
	Place destination;
	
	public List<QuoteParam> getQuotes() {
		return quotes;
	}
	public void setQuotes(List<QuoteParam> quotes) {
		this.quotes = quotes;
	}
	public List<Package> getPackages() {
		return packages;
	}
	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}
	public Place getOrigin() {
		return origin;
	}
	public void setOrigin(Place origin) {
		this.origin = origin;
	}
	public Place getDestination() {
		return destination;
	}
	public void setDestination(Place destination) {
		this.destination = destination;
	}
}
