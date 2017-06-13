import java.util.HashMap;

public class Item implements ItemInterface {
	
	private int itemId;
	private String description;
	private HashMap<Integer,Integer> storePriceHashMap=new HashMap<Integer,Integer>();  
	
	public Item(int itemId, String description,HashMap hmap) {
		this.itemId=itemId;
		this.description=description;
		this.storePriceHashMap=hmap;
	}

	public void setItemId(int itemId) {
		this.itemId=itemId;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public void setStorePrice(int storeId, int price) {
		this.storePriceHashMap.put(storeId, price);
	}

	public String getDescription(){ return description; }
	public int getItemId(){ return itemId; }
	public HashMap getStorPrice(){return storePriceHashMap;}

}
