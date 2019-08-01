package login.submit.registration;

public interface CustomerDao {
	
	public int insertCustomer(Customer c);
	public Customer getCustomer(String username,String pass);

}
