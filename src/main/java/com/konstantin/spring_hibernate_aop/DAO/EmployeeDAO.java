/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring_hibernate_aop.DAO;

import com.konstantin.spring_hibernate_aop.Model.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JavaDev
 */
@Repository
public class EmployeeDAO {

    @Autowired
    ApplicationContext applicationContext;

    public List<Employee> showAllEmployees() {
        return new ArrayList<>();
    }
}
