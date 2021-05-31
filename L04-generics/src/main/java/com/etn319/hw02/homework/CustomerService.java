package com.etn319.hw02.homework;


import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CustomerService {
    private NavigableMap<Customer, String> customers = new TreeMap<>();

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

    public Map.Entry<Customer, String> getSmallest() {
        //Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk
        var firstEntry = customers.firstEntry();
        return firstEntry == null ? firstEntry : copyCustomerEntry(firstEntry);
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        var nextEntry = customers.higherEntry(customer);
        return nextEntry == null ? nextEntry : copyCustomerEntry(nextEntry);
    }

    public void add(Customer customer, String data) {
        Customer customerCopy = copy(customer);
        customers.put(customerCopy, data);
    }

    private Map.Entry<Customer, String> copyCustomerEntry(Map.Entry<Customer, String> entry) {
        Customer customer = entry.getKey();
        Customer copied = copy(customer);
        return Map.entry(copied, entry.getValue());
    }

    private Customer copy(Customer customer) {
        return customer.clone();
    }
}
