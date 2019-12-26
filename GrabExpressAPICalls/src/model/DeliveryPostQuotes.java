package model;

import java.util.List;

public class DeliveryPostQuotes {
	
		  String serviceType;
		  List<Package> packages;
		  Place origin;
		  Place destination;
		  
		public String getServiceType() {
			return serviceType;
		}
		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
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
