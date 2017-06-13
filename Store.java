
public class Store implements StoreInterface{
	private int storeId;
	private int storeLocation;
	private String storeName;
	
	public Store(int storeId, int storeLocation, String storeName) {
		this.storeId=storeId;
		this.storeLocation=storeLocation;
		this.storeName=storeName;
	}

	public void setStoreId(int sid) {
		this.storeId=sid;
	}

	public void setStoreLocation(int storeLocation) {
		this.storeLocation=storeLocation;
	}

	public void setStoreName(String storeName) {
		this.storeName=storeName;
	}
	
	public String getStoreName(){ return storeName; }
	public int getStoreId(){ return storeId; }
	public int getStoreLocation(){ return storeLocation; }

}
