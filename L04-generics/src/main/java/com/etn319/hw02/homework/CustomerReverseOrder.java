package com.etn319.hw02.homework;


import java.util.Stack;

public class CustomerReverseOrder {
    private Stack<Customer> customerStack = new Stack<>();

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"

    public void add(Customer customer) {
        customerStack.push(customer);
    }

    public Customer take() {
        return customerStack.pop();
    }
}
