package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFacadeTestSuite {
    @Autowired
    private ManyToManyFacade manyToManyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testGetCompaniesByPartialName() {
        //given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        //when
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        List<Company> companies = manyToManyFacade.getCompaniesByPartialName("te");
        //then
        Assert.assertEquals(2, companies.size());

        //cleanup
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(greyMatter);
    }

    @Test
    public void testGetEmployeesByPartialName() {
        //given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaMitchel = new Employee("Linda", "Mitchel");
        //when
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaMitchel);

        List<Employee> employees = manyToManyFacade.getEmployeesByPartialName("it");
        //then
        Assert.assertEquals(2, employees.size());

        //cleanup
        employeeDao.delete(johnSmith);
        employeeDao.delete(stephanieClarckson);
        employeeDao.delete(lindaMitchel);
    }
}
