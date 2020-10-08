package org.example.dao;

import org.example.domain.Customer;

import java.util.List;

public interface CustomerDao {
    //添加顾客
    int insertCustomer(Customer customer);
    //查询学生
    List<Customer> selectCustomers();

    //删除用户(提供编号)
    int deleteCustomer(Integer id);

    //更改用户
    int updateCustomer(Customer customer);
}
