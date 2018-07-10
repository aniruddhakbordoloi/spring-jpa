package com.codesmack.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aniruddha on 10-07-2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = { EmployeeJpaConfig.class },
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class DBTest {

    @Resource
    private EmployeeRepository employeeRepository;

    @Test
    public void given_Employee_whenSave_thenGetOk() {
        Employee employee = new Employee(1, "john");
        employeeRepository.save(employee);

        Employee employee2 = employeeRepository.getOne(new Long(1));
        assertEquals("john", employee2.getName());
    }
}
