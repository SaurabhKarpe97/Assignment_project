package com.assugment.demoProject.Repositories;

import com.assugment.demoProject.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByVisibleTrue();
}
