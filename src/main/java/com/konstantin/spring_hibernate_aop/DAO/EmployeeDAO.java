/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring_hibernate_aop.DAO;

import com.konstantin.spring_hibernate_aop.Model.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JavaDev
 */
@Repository
public class EmployeeDAO implements IEmplDAO {

   
    private SessionFactory sessionFactory;

    @Autowired
    public EmployeeDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    @Override 
    public void addEmployee() {
        Employee employee = new Employee();
    }

    @Override
    @Transactional
    public List<Employee> showAllEmployees() {
        System.out.println("check2");
        Session currentSession = sessionFactory.getCurrentSession();
        Query createQuery = currentSession.createQuery("from Employee", Employee.class);
        List resultList = createQuery.getResultList();
        System.out.println(resultList); 
        return resultList;
//return null;
    }
}
