package org.jrue.designpatterns.dynamicproxy;

public class CustomerServiceImplProxy implements CustomerService{

	CustomerService customerServiceImpl;
	
	public CustomerServiceImplProxy(CustomerService customerServiceImpl) {
		this.customerServiceImpl = customerServiceImpl;
	}
	
	@Override
	public void saveCustomerInfo() {
		System.out.println("Generating audit logs");
		customerServiceImpl.saveCustomerInfo();
	}
}
