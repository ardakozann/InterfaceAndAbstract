package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Veritaban�na kaydedildi : " + customer.getFirstName());
	}

}
