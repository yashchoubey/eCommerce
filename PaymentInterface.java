public interface PaymentInterface {
	public void setPaymentItemId(int itemId);
	public void setPaymentStoreId(int storeId);
	public void setPaymentCustomerId(int customerId);
	public void setPaymentPaid(boolean payment);
	public void setDelivered(boolean delivery);
}
