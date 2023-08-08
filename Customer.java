import javax.swing.JFrame;

public class Customer{
  private String customerName;
  private String customerAddress;

  public Customer( String name, String address ){
    customerName = name;
    customerAddress = address;
  }

  public void setCustomerName( String name ){
    customerName = name;
  }
}
