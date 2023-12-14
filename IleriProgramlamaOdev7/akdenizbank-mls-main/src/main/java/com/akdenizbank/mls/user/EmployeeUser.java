package com.akdenizbank.mls.user;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Entity
@Getter
@Setter
public class EmployeeUser extends AppUser {
    @Override
    public void setSalary(Object salary) {

    }

    @Override
    public void setPosition(Object position) {

    }
    //TODO: Create Repository-Service-Controller for employee user
}

