/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring_hibernate_aop.DAO;

import com.konstantin.spring_hibernate_aop.Model.Employee;
import java.util.List;
import org.springframework.ui.Model;

/**
 *
 * @author JavaDev
 */
public interface IEmplDAO {

    List<Employee> showAllEmployees();
    void addEmployee(); 

}
