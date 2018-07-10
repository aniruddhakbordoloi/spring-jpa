package com.codesmack.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aniruddha on 10-07-2018.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
