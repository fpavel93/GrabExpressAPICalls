package model;

public class QuoteParam {

	Service service;
	int amount;
	Timeline estimatedTimeline;
	int distance;
	
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
}
