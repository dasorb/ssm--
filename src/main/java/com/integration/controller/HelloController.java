package com.integration.controller;

import com.integration.pojo.Employee;
import com.integration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenjie
 * @date 2018/9/21 0021 - 21:18
 */
@Controller
public class HelloController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/employee/{strId}")
    @ResponseBody
    public String getEmpById(@PathVariable("strId") String strId){
        int id = Integer.parseInt(strId);
        Employee employee = employeeService.getEmployeeById(id);
        System.out.println(employee);
        return employee.toString();
    }
}
