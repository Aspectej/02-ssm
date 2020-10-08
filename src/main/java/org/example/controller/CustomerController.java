package org.example.controller;

import org.example.domain.Customer;
import org.example.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;
    @RequestMapping("/some.do")
    public ModelAndView insertCustomer(Customer customer){
        ModelAndView mv=new ModelAndView();
        int nums=customerService.addCustomer(customer);
        String tips="顾客信息注册失败!" ;
        if(nums>0){
            tips="顾客:"+customer.getName()+",注册成功!";
        }
        mv.addObject("tips",tips);
        mv.setViewName("show");
        return mv;
    }

    //查询学生
    @RequestMapping("/queryCustomer.do")
    @ResponseBody
    public List<Customer> queryCustomer(){
        List<Customer> customers=customerService.queryCustomer();
        return customers;
    }

    //删除用户
    @RequestMapping("/deleteCustomer.do")
    public ModelAndView deleteCustomer(Integer id){
        ModelAndView mv=new ModelAndView();
        Integer nums=customerService.deleteCustomer(id);
        String tips="用户删除失败!";
        if(nums>0){
            tips="用户编号:"+id+"删除信息成功!";
        }
        mv.addObject("tips",tips);
        mv.setViewName("delete");
        return mv;
    }

    //更新用户信息
    @RequestMapping("/updateCustomer.do")
    public ModelAndView updateCustomer(Customer customer){
        ModelAndView mv=new ModelAndView();
        int nums=customerService.updateCustomer(customer);
        String tips="用户更新失败!";
        if(nums>0){
            tips="用户:"+customer.getId()+",修改成功!" ;
        }
        mv.addObject("tips",tips);
        mv.setViewName("update");
        return mv;
    }
}
