package com.example.cache.service;

import com.example.cache.bean.Employee;
import com.example.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    //查询员工信息
    public Employee getEmp(Integer id){
        System.out.println("查询"+id+"号员工信息");
        Employee emp = employeeMapper.getEmpById(id);
        return emp;
    }
    //删除员工信息
    public void deleteEmp(Integer id){
        System.out.println("删除"+id+"号员工信息");
        employeeMapper.deleteEmp(id);
    }
    //增加员工信息
    public void insertEmp(Employee employee){
        System.out.println("增加新的员工信息");
        employeeMapper.insertEmp(employee);
    }
    //修改员工信息
    public void updateEmp(Employee employee){
        System.out.println("修改"+employee.getId()+"号员工信息");
        employeeMapper.updateEmp(employee);
    }
}
