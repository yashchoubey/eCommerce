
public class Payment implements PaymentInterface{
	private int  itemId;
	private int  storeId;
	private int customerId;
	private boolean isPaid;
	private boolean  isDelivered;
	public void setPaymentItemId(int itemId) {
		this.itemId=itemId;
	}

	public void setPaymentStoreId(int storeId) {
		this.storeId=storeId;
	}

	public void setPaymentCustomerId(int customerId) {
		this.customerId=customerId;
	}

	public void setPaymentPaid(boolean payment) {
		this.isPaid=payment;
	}

	public void setDelivered(boolean delivery) {
		this.isDelivered=delivery;
	}
	
	public int getPaymentItemId(){ return itemId; }
	public int getPaymentStoreId(){ return storeId; }
	public int getPaymentCustomerId(){ return customerId; }
	public boolean getPaymentPaid(){ return isPaid; }
	public boolean getDelivered(){ return isDelivered; }
}
