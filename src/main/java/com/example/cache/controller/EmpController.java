package com.example.cache.controller;
import com.example.cache.bean.Employee;
import com.example.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmpController {
    @Autowired
    EmployeeService employeeService;
    //查询员工信息
    @GetMapping("/getEmp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
        Employee emp = employeeService.getEmp(id);
        return emp;
    }
    //删除员工信息
    @GetMapping("/deleteEmp/{id}")
    public void deleteEmployee(@PathVariable("id") Integer id){
         employeeService.deleteEmp(id);
    }
    //增加员工信息
    @GetMapping("/insertEmp")
    //这里，在传参的时候，只需要将床底的参数的名称和Bean里面的参数的名称一致即可，employee就可以接收到所有的参数信息
    public void insertEmployee(Employee employee){
        System.out.println(employee);
        employeeService.insertEmp(employee);
    }
    //修改员工信息
    @GetMapping("/updateEmp/{id}")
    public void updateEmployee(Employee employee,@PathVariable("id") Integer id){
        System.out.println(employee);
        employeeService.updateEmp(employee);
    }
}
