package org.jrue.designpatterns.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyMain {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		AuditLogger logger = new AuditLogger(customerService);
		CustomerService generatedProxy = (CustomerService) Proxy.
				newProxyInstance(customerService.getClass().getClassLoader(), customerService.getClass().getInterfaces(), logger);
		generatedProxy.saveCustomerInfo();
	}
}
