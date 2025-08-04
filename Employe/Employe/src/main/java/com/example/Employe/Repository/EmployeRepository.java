package com.example.Employe.Repository;

import com.example.Employe.Entity.Employes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employes, Integer> {

    // Additional query methods can be defined here if needed
}
