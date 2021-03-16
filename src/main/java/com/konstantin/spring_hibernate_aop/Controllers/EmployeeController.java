/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring_hibernate_aop.Controllers;

import com.konstantin.spring_hibernate_aop.DAO.EmployeeDAO;
import com.konstantin.spring_hibernate_aop.DAO.IEmplDAO;
import com.konstantin.spring_hibernate_aop.Model.Employee;
//import com.konstantin.spring_hibernate_aop.Servise.IServise;
//import com.konstantin.spring_hibernate_aop.Servise.Servise;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author JavaDev
 */
@Controller
public class EmployeeController {

//    @Autowired
//    Servise servise;
    @Autowired
    private IEmplDAO employeeDAO;

    @GetMapping(path = "/all")
    public String showAllEmpmloyees(Model model) {
        System.out.println("123");
//        List<Employee> showAllEmployees = servise.showAllEmployees();
        List<Employee> showAllEmployees = employeeDAO.showAllEmployees();

        model.addAttribute("employees", showAllEmployees);
        return "/show-all-employees";
    }
}
