package com.designpatterns.proxy;

/**
 * Interface for some customer service that we will import to our package.
 */
public interface ICustomerService {
    public void addCustomer(Customer customer);
    public Customer getCustomerByCustomerId(String customerId);
}
