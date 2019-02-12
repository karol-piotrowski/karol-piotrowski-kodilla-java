package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveEmployeesWithLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee jamesSmith = new Employee("James", "Smith");

        List<Integer> ids = new ArrayList<>();
        employeeDao.save(johnSmith);
        ids.add(johnSmith.getId());
        employeeDao.save(stephanieClarckson);
        ids.add(stephanieClarckson.getId());
        employeeDao.save(lindaKovalsky);
        ids.add(lindaKovalsky.getId());
        employeeDao.save(jamesSmith);
        ids.add(jamesSmith.getId());

        //When
        List<Employee> smiths = employeeDao.retrieveEmployeesWithLastName("Smith");
        List<Employee> clarcksons = employeeDao.retrieveEmployeesWithLastName("Clarckson");
        List<Employee> kovalskys = employeeDao.retrieveEmployeesWithLastName("Kovalsky");
        List<Employee> novacks = employeeDao.retrieveEmployeesWithLastName("Novack");

        //Then
        try {
            Assert.assertEquals(2, smiths.size());
            Assert.assertEquals(1, clarcksons.size());
            Assert.assertEquals(1, kovalskys.size());
            Assert.assertEquals(0, novacks.size());
        } finally {
            //CleanUp
            ids.stream()
                    .forEach(id -> employeeDao.delete(id));
        }


    }

    @Test
    public void testRetrieveCompaniesStartingWith3Characters() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company greenEnergy = new Company("Green Energy");

        List<Integer> ids = new ArrayList<>();
        companyDao.save(softwareMachine);
        ids.add(softwareMachine.getId());
        companyDao.save(dataMaesters);
        ids.add(dataMaesters.getId());
        companyDao.save(greyMatter);
        ids.add(greyMatter.getId());
        companyDao.save(greenEnergy);
        ids.add(greenEnergy.getId());

        //When
        List<Company> startsWithSof = companyDao.retrieveCompaniesStartingWith3Characters("Sof");
        List<Company> startsWithDat = companyDao.retrieveCompaniesStartingWith3Characters("Dat");
        List<Company> startsWithGre = companyDao.retrieveCompaniesStartingWith3Characters("Gre");
        List<Company> startsWithKod = companyDao.retrieveCompaniesStartingWith3Characters("Kod");


        //Then
        try {
            Assert.assertEquals(1, startsWithSof.size());
            Assert.assertEquals(1, startsWithDat.size());
            Assert.assertEquals(2, startsWithGre.size());
            Assert.assertEquals(0, startsWithKod.size());
        } finally {
            //CleanUp
            ids.stream()
                    .forEach(id -> companyDao.delete(id));
        }
    }
}