package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomer customerDal;
	
	
	public CustomerManager(ICustomer customerDal) {
		this.customerDal = customerDal;
	}


	public void add() {
			//iþ kurallarý
	customerDal.add();
	}
}
