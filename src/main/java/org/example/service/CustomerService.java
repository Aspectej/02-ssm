package org.example.service;

import org.example.domain.Customer;

import java.util.List;

public interface CustomerService {
    //添加顾客
    int addCustomer(Customer customer);
    //查询用户
    List<Customer> queryCustomer();

    //删除用户
    int deleteCustomer(Integer id);

    //更新用户
    int updateCustomer(Customer customer);
}
