import java.util.HashMap;

public class Tester {

	public static void main(String[] args) {
		//*******setting Up stores**************//
		Store storeFlipkart = new Store(1,1,"Flipkart" );
		Store storeSnapdeal = new Store(2,2,"Snapdeal" );
		Store storeMyntra = new Store(3,3,"Myntra" );
		
		//*******setting Up customers**************//
		Customer customerYash = new Customer(1, 1, 101101,"Yash");
		Customer customerVibhor = new Customer(1, 2, 010010,"Vibhor");
		
		//*******setting Up item in stores**************//
		HashMap<Integer,Integer> storePriceHashMap=new HashMap<Integer,Integer>();
		storePriceHashMap.put(1,41000);
		storePriceHashMap.put(2,41500);
		Item itemIphone = new Item(1,"Iphone 6S",storePriceHashMap);
		storePriceHashMap.clear();
		
		storePriceHashMap.put(1,41000);
		storePriceHashMap.put(2,41500);
		storePriceHashMap.put(2,41500);
		Item itemRolex = new Item(1,"Rolex",storePriceHashMap);
		storePriceHashMap.clear();
		
		PaymentInterface payment = new Payment();
		
		
		payment.setPaymentItemId(item.getItemId());
		payment.setPaymentStoreId(store.getStoreId());
		payment.setPaymentCustomerId(customer.getCustomerId());
		payment.setDelivered(false);
		payment.setPaymentPaid(true);

	}

}
