package com.klinnovations;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import com.klinnovations.entity.Employee;
import com.klinnovations.repo.EmployeeRepository;
import org.springframework.data.domain.Pageable.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		EmployeeRepository repo = ctxt.getBean(EmployeeRepository.class);

		/*
		 * System.out.println(repo.getClass().getNAME());
		 * 
		 * Employee e1 = new Employee(10001, "Anitha", 850000.00, "Female", "Finance");
		 * Employee e2 = new Employee(10002, "Laxman", 100000.00, "Male", "Developer");
		 * Employee e3 = new Employee(10003, "Sailu", 30000.00, "Male", "Accountant");
		 * Employee e4 = new Employee(10004, "Raju", 25000.00, "Male", "Driver");
		 * Employee e5 = new Employee(10005, "Naveen", 350000.00, "Male", "Designer");
		 * Employee e6 = new Employee(10006, "Vamshi", 20000.00, "Male", "Sales");
		 * Employee e7 = new Employee(10007, "Varshika", 40000.00, "Female", "Finance");
		 * Employee e8 = new Employee(10008, "Vinith", 450000.00, "Male", "Sales");
		 * Employee e9 = new Employee(10009, "Bhavani", 50000.00, "Female",
		 * "Accountant"); Employee e10 = new Employee(10010, "Karthik", 550000.00,
		 * "Male", "Developer");
		 * 
		 * 
		 * repo.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
		 * System.out.println("Record Saved SuccessFully....");
		 */

		 //pagenation
		
			/*
			 * Sort ascending = Sort.by("empName", "empSalary").descending(); int pageNo =
			 * 2; PageRequest page = PageRequest.of(pageNo - 1, 3); Page<Employee> findAll =
			 * repo.findAll(page); List<Employee> emps =findAll.getContent();
			 * emps.forEach(System.out::println);
			 */

		//Quary By Example(Dinamic)
		Employee emp = new Employee();
		emp.setEmpgender("Male");
		emp.setDept("Developer");
		
		Example <Employee> exm = Example.of(emp);
		List<Employee> emps = repo.findAll(exm);
		emps.forEach(System.out::println);
		
	}

}
