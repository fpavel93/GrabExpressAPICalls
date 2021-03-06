package model;

public class Delivery {

	String deliveryID;
	String merchantOrderID;
	String serviceType;
	Quote quote;
	Contact sender;
	Contact recipient;
	CashOnDelivery cashOnDelivery;
	String status;
	Courier courier;
	Timeline timeline;
	String trackingURL;
	AdvanceInfo advanceInfo;
	
	public String getDeliveryID() {
		return deliveryID;
	}
	public void setDeliveryID(String deliveryID) {
		this.deliveryID = deliveryID;
	}
	public String getMerchantOrderID() {
		return merchantOrderID;
	}
	public void setMerchantOrderID(String merchantOrderID) {
		this.merchantOrderID = merchantOrderID;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public Quote getQuote() {
		return quote;
	}
	public void setQuote(Quote quote) {
		this.quote = quote;
	}
	public Contact getSender() {
		return sender;
	}
	public void setSender(Contact sender) {
		this.sender = sender;
	}
	public Contact getRecipient() {
		return recipient;
	}
	public void setRecipient(Contact recipient) {
		this.recipient = recipient;
	}
	public CashOnDelivery getCashOnDelivery() {
		return cashOnDelivery;
	}
	public void setCashOnDelivery(CashOnDelivery cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
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
