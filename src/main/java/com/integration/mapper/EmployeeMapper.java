package com.integration.mapper;

import com.integration.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenjie
 * @date 2018/9/27 0027 - 11:10
 */
public interface EmployeeMapper {
    Employee getEmployeeById(int id);
}
