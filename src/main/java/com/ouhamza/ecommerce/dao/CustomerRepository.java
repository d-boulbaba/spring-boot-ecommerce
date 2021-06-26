package com.ouhamza.ecommerce.dao;

import com.ouhamza.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Controller;

@Controller
@RepositoryRestResource(collectionResourceRel = "CustomerRepository", path = "Customer-Repository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
