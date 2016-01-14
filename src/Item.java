
/**
 * @author Geoff
 *
 */
public class Item {
    private String sellerUserName; //e.g. Lisa 
    private String itemName; //the complete name which includes the seller user name like ''Lisa-Book' 
    private String description; //e.g. Head First Java 
    private double currentBidPrice; //e.g. 11.0 
    private int expiryTime; //e.g. 10 
    private String bidderName; //based on the message from server when there is a bid. Initially was null 

    public void Item(){
        
    }
}
