package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomer customerDal;
	
	
	public CustomerManager(ICustomer customerDal) {
		this.customerDal = customerDal;
	}


	public void add() {
			//i� kurallar�
	customerDal.add();
	}
}
