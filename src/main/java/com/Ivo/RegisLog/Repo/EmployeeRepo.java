package com.Ivo.RegisLog.Repo;

import com.Ivo.RegisLog.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Optional<Employee> findOneByEmailAndPassword(String email,String password);
    Employee findByEmail(String email);
}
