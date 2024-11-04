package com.example.demo.repository;

//public class EmployeeRepsitory {
    import com.example.demo.model.Employee;
    import org.springframework.data.jpa.repository.JpaRepository;
    public interface EmployeeRepsitory extends JpaRepository<Employee,Long> {
     //crud
    }
       

