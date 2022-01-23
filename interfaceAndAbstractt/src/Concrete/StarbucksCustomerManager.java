package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService iCustomerCheckService;
	
	
	
	public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		super();
		this.iCustomerCheckService = iCustomerCheckService;
	}



	public StarbucksCustomerManager() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void save(Customer customer) throws Exception {
		if(iCustomerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
		}
		else {
			throw new Exception("Kullanýcý bilgileri doðru deðil.");
		}
	} 
}
