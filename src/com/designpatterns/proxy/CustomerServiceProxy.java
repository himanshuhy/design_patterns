package com.designpatterns.proxy;

/**
 * Example of remote customer service proxy.
 * It hides the fact that when we request.
 * It implements the ICustomerService interface so that its client
 * dont understand whether it is a proxy or not.
 */
public class CustomerServiceProxy implements ICustomerService{
    public CustomerServiceProxy() {
        //setus up the connection to the remote serer.
    }
    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Accessed the remote server to add the customer into the database");

        //Can check access from the client perspective.
        //can provide a local L1 cache which can be used to retrieve the customer object
        //Can batch over multple requests to make it efficient
    }

    @Override
    public Customer getCustomerByCustomerId(String customerId) {
        System.out.println("Fetching the customer via the remote service");
        //dummy representation for some returned customer.
        return new Customer();
    }
}
