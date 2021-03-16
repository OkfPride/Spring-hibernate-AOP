///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.konstantin.spring_hibernate_aop.Servise;
//
//import com.konstantin.spring_hibernate_aop.DAO.EmployeeDAO;
//import com.konstantin.spring_hibernate_aop.Model.Employee;
//import java.util.List;
//import javax.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author JavaDev
// */
//@Service
//public class Servise implements IServise {
//
//    @Autowired
//    EmployeeDAO employeeDAO;
//
//    
//    @Override
//    public List<Employee> showAllEmployees() {
//        System.out.println("check1");
//        List<Employee> showAllEmployees = employeeDAO.showAllEmployees();
//        return showAllEmployees;
//    }
//
//}
