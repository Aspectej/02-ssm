package org.example.service.impl;

import org.example.dao.CustomerDao;
import org.example.domain.Customer;
import org.example.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;

    @Override
    public int addCustomer(Customer customer) {
        int nums=customerDao.insertCustomer(customer);
        return nums;
    }

    @Override
    public List<Customer> queryCustomer() {
        List<Customer> customers=customerDao.selectCustomers();
        return customers;
    }

    @Override
    public int deleteCustomer(Integer id) {
        int nums=customerDao.deleteCustomer(id);
        return nums;
    }

    @Override
    public int updateCustomer(Customer customer) {
        int nums=customerDao.updateCustomer(customer);
        return nums;
    }
}
