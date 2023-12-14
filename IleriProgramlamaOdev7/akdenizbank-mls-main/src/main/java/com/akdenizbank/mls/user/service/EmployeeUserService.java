package com.akdenizbank.mls.user.service;

import com.akdenizbank.mls.user.EmployeeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeUserService {

    private final EmployeeUserService.EmployeeUserRepository employeeUserRepository;

    public EmployeeUserService(EmployeeUserService.EmployeeUserRepository employeeUserRepository) {
        this.employeeUserRepository = employeeUserRepository;
    }

    public EmployeeUser createEmployeeUser(EmployeeUser employeeUser) {
        // Create the employee user and return it
        return employeeUser;
    }

    public EmployeeUser getEmployeeUserById(String id) {
        // Get the employee user by id and return it
        return null;
    }

    public List<EmployeeUser> getAllEmployeeUsers() {
        // Get all employee users and return them
        return null;
    }

    public EmployeeUser updateEmployeeUser(String id, EmployeeUser employeeUser) {
        // Update the employee user and return it
        return employeeUser;
    }

    public void deleteEmployeeUserById(String id) {
        // Delete the employee user
    }
    @Repository
    public interface EmployeeUserRepository extends JpaRepository<EmployeeUser, String> {

    }
}
