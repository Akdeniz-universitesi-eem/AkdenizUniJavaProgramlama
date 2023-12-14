package com.akdenizbank.mls.user.repository;

import com.akdenizbank.mls.user.CustomerUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeUserRepository extends JpaRepository<CustomerUser, String> {

}
