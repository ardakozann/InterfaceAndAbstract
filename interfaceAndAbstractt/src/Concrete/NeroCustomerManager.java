package Concrete;

import Abstract.BaseCustomerManager;
//import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
//	private ICustomerCheckService iCustomerCheckService;
//	
//	public NeroCustomerManager() {
//		super();
//	}
//
//	public NeroCustomerManager(ICustomerCheckService iCustomerCheckService) {
//		super();
//		this.iCustomerCheckService = iCustomerCheckService;
//	}
	
	public void save (Customer customer) throws Exception {
		super.save(customer);
	}
}
