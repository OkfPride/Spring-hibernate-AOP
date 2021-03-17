/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring_hibernate_aop.Controllers;

import com.konstantin.spring_hibernate_aop.DAO.EmployeeDAO;
import com.konstantin.spring_hibernate_aop.DAO.IEmplDAO;
import com.konstantin.spring_hibernate_aop.Model.Employee;
import com.konstantin.spring_hibernate_aop.Servise.IServise;
//import com.konstantin.spring_hibernate_aop.Servise.IServise;
//import com.konstantin.spring_hibernate_aop.Servise.Servise;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author JavaDev
 */
@Controller
public class EmployeeController {

    @Autowired
    IServise servise;
//    @Autowired
//    private IEmplDAO employeeDAO;

    @GetMapping(path = "/")
    public String showAllEmpmloyees(Model model) {
        List<Employee> showAllEmployees = servise.showAllEmployees();
//        List<Employee> showAllEmployees = employeeDAO.showAllEmployees();

        model.addAttribute("employees", showAllEmployees);
        return "/show-all-employees.jsp";
    }

    @GetMapping(path = "/add")
    public String addnewEmployee(Model model) {
        System.out.println("123");
        model.addAttribute("employee", servise.add());
        System.out.println("321");
        return "/create-new-employee.jsp";
    }

    @PostMapping(path = "/save")
    public String UpdateEmployee(@ModelAttribute Employee employee) {
        System.out.println(employee + " before");
        servise.save(employee);
        System.out.println(employee + " after");
        return "redirect:/";
    }

    @GetMapping(path = "/edit")
    public String update(Model model, @RequestParam("empId") int id) {
        Employee employee = servise.getEmployee(id);
        model.addAttribute("employee", employee);

        return "/create-new-employee.jsp";
    }

    @GetMapping(path = "/delete")
    public String delete(@RequestParam("empId") int id) {
        servise.delete(servise.getEmployee(id));
        return "redirect:/";
    }

}
