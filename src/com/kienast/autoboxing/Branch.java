package com.kienast.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private String name;
    private List<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String name, double initialTransaction) {
        if (findCustomer(name) == null) {
            Customer customer = new Customer(name, initialTransaction);
            customers.add(customer);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
