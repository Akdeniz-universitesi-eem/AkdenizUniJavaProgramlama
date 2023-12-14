package com.akdenizbank.mls.user.controller;

import com.akdenizbank.mls.user.EmployeeUser;
import com.akdenizbank.mls.user.service.EmployeeUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeUserController {

    private final com.akdenizbank.mls.user.service.EmployeeUserService employeeUserService;

    public EmployeeUserController(EmployeeUserService employeeUserService) {
        this.employeeUserService = employeeUserService;
    }

    @PostMapping
    public ResponseEntity<EmployeeUser> createEmployeeUser(@RequestBody EmployeeUser employeeUser) {
        // Create the employee user and return a response entity with the created user
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeUser> getEmployeeUserById(@PathVariable String id) {
        // Get the employee user by id and return a response entity with the user
        return null;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeUser>> getAllEmployeeUsers() {
        // Get all employee users and return a response entity with the list of users
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeUser> updateEmployeeUser(@PathVariable String id, @RequestBody EmployeeUser employeeUser) {
        // Update the employee user and return a response entity with the updated user
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployeeUserById(@PathVariable String id) {
        // Delete the employee user and return a response entity with the appropriate status code
        return null;
    }
}
