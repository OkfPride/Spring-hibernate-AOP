/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring_hibernate_aop.Servise;

import com.konstantin.spring_hibernate_aop.DAO.EmployeeDAO;
import com.konstantin.spring_hibernate_aop.DAO.IEmplDAO;
import com.konstantin.spring_hibernate_aop.Model.Employee;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JavaDev
 */
@Service
public class Servise implements IServise {

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Autowired
    private IEmplDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> showAllEmployees() {
        List<Employee> showAllEmployees = employeeDAO.showAllEmployees();
        return showAllEmployees;
    }

    @Override
    @Transactional
    public Employee add() {
        return  employeeDAO.addEmployee();
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void delete(Employee employee) {
        employeeDAO.deleteEmployee(employee);
    }
    

}
