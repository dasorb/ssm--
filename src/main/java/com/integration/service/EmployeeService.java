package com.integration.service;

import com.integration.mapper.EmployeeMapper;
import com.integration.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenjie
 * @date 2018/9/27 0027 - 11:15
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee getEmployeeById(int id){
        Employee employee = employeeMapper.getEmployeeById(id);
        return employee;
    }

}
