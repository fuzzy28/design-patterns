package org.jrue.designpatterns.dynamicproxy;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public void saveCustomerInfo() {
		System.out.println("Saving customer info...");
	}

}
