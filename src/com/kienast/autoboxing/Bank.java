package com.kienast.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            Branch branch = new Branch(name);
            branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String customerName, String branchName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, String branchName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(customerName);
            customer.addTransaction(initialTransaction);
            return true;
        }
        return false;
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            List<Customer> customers = branch.getCustomers();
            for (Customer customer : customers) {
                System.out.println(customer.getName() + " -> " );
                if (showTransactions) {
                    List<Double> transactions = customer.getTransactions();
                    for (Double transaction : transactions) {
                        System.out.println(transaction);
                    }
                }
            }
        }
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }
}
