package org.jrue.designpatterns.dynamicproxy;

public class StaticProxyMain {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		
		CustomerService customerServiceProxy = new CustomerServiceImplProxy(customerService);
		customerServiceProxy.saveCustomerInfo();
		
	}
}
