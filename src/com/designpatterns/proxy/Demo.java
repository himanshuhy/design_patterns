package com.designpatterns.proxy;

public class Demo {
    public static void main(String[] args) {

        //The client thinks it has access to the customer Service, but actually it has proxy to it.
        ICustomerService customerService = new CustomerServiceProxy();
        customerService.addCustomer(new Customer());
        final Customer customerByCustomerId = customerService.getCustomerByCustomerId("1234_1234_1234");
    }
}
