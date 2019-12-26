package model;

import java.util.List;

public class DeliveryPost {
	
		  String merchantOrderID;
		  String serviceType;
		  String paymentMethod;
		  List<Package> packages;
		  Contact sender;
		  Contact recipient;
		  Place origin;
		  Place destination;
		  CashOnDelivery cashOnDelivery;
		  Schedule schedule;
		  Boolean highValue;
		  
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
		public String getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public List<Package> getPackages() {
			return packages;
		}
		public void setPackages(List<Package> packages) {
			this.packages = packages;
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
		public CashOnDelivery getCashOnDelivery() {
			return cashOnDelivery;
		}
		public void setCashOnDelivery(CashOnDelivery cashOnDelivery) {
			this.cashOnDelivery = cashOnDelivery;
		}
		public Schedule getSchedule() {
			return schedule;
		}
		public void setSchedule(Schedule schedule) {
			this.schedule = schedule;
		}
		public Boolean getHighValue() {
			return highValue;
		}
		public void setHighValue(Boolean highValue) {
			this.highValue = highValue;
		}
}
