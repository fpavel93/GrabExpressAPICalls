package model;

import java.util.List;

public class Quote {

	Service service;
	int amount;
	Timeline estimatedTimeline;
	int distance;
	List<Package> packages;
	Place origin;
	Place destination;
	
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Timeline getEstimatedTimeline() {
		return estimatedTimeline;
	}
	public void setEstimatedTimeline(Timeline estimatedTimeline) {
		this.estimatedTimeline = estimatedTimeline;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
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