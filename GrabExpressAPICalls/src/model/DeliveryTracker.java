package model;

public class DeliveryTracker {

	String status;
	Courier courier;
	Timeline timeline;
	String trackingURL;
	AdvanceInfo advanceInfo;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Courier getCourier() {
		return courier;
	}
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	public Timeline getTimeline() {
		return timeline;
	}
	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}
	public String getTrackingURL() {
		return trackingURL;
	}
	public void setTrackingURL(String trackingURL) {
		this.trackingURL = trackingURL;
	}
	public AdvanceInfo getAdvanceInfo() {
		return advanceInfo;
	}
	public void setAdvanceInfo(AdvanceInfo advanceInfo) {
		this.advanceInfo = advanceInfo;
	}
}
