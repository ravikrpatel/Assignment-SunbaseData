package com.JavaSunbaseDataAssignment.Repository;

import com.JavaSunbaseDataAssignment.Model.CustomerDetailsClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetailsClass, Integer> {
}
