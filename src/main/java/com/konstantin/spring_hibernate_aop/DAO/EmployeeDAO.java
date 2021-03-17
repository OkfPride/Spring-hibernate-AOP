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
import org.springframework.web.bind.annotation.ModelAttribute;

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
    public Employee addEmployee() {
        Employee employee = new Employee();
//        Session currentSession = sessionFactory.getCurrentSession();
//        currentSession.update("insert Employee", Employee.class);
        return employee;
    }

    @Override
    public List<Employee> showAllEmployees() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query createQuery = currentSession.createQuery("from Employee", Employee.class);
        List resultList = createQuery.getResultList();
        return resultList;

//return null;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session currentSession = sessionFactory.getCurrentSession();
        System.out.println("EMPL id = " + employee);
        currentSession.saveOrUpdate(employee);

    }

    @Override
    public void deleteEmployee(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }

    public Employee getEmployee(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Employee get = currentSession.get(Employee.class, id);
//        Query createQuery = currentSession.createQuery("from Employee", Employee.class);
//        createQuery.setParameter("id", id);
//        createQuery.getSingleResult();
        return get;
    }
}
