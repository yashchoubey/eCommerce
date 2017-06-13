public class Customer implements CustomerInterface{
	private int customerId;
	private int customerLocation;
	private int customerCard;
	private String customerName;
	
	public Customer(int customerId, int customerLocation, int customerCard, String customerName) {
		this.customerId=customerId;
		this.customerLocation=customerLocation;
		this.customerCard=customerCard;
		this.customerName=customerName;
	}

	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}

	public void setCustomerLocation(int customerLocation) {
		this.customerLocation=customerLocation;
	}

	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}

	public void setCustomerCard(int cardNumber) {
		this.customerCard=cardNumber;
	}
	
	public String getCustomerName(){ return customerName; }
	public int getCustomerId(){ return customerId; }
	public int getCustomerCard(){ return customerCard; }
	public int getCustomerLocation(){ return customerLocation; }

}