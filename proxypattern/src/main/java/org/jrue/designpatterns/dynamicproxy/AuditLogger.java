package org.jrue.designpatterns.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AuditLogger implements InvocationHandler {

	private CustomerService service;
	
	public AuditLogger(CustomerService service) {
		this.service = service;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Generating audit logs");
		Object result = method.invoke(service, args);
		return result;
	}
}
