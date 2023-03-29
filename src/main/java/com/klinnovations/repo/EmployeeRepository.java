package com.klinnovations.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klinnovations.entity.Employee;

import net.bytebuddy.matcher.MethodSortMatcher.Sort;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


}
