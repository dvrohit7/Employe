package com.example.Employe.Service;

import com.example.Employe.Entity.Employes;
import com.example.Employe.Repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeServiceimp implements EmployeService {
    @Autowired
    private EmployeRepository er;

    public EmployeServiceimp(EmployeRepository er) {
        this.er = er;
    }

    @Override
    public String addEmplye(Employes e) {
        // Implementation for adding an employee
        er.save(e);
        return "Employee added successfully";
    }

    @Override
    public List<Employes> getAllEmployes() {
        // Implementation for retrieving all employees
        List<Employes> le=er.findAll();
        return le;
    }

    @Override
    public String updateEmploye(Employes e) {
        // Implementation for updating an employee
        er.save(e);
        return "Employee updated successfully";
    }

    @Override
    public String deleteEmploye(int id) {
        // Implementation for deleting an employee by ID
        er.deleteById(id);
        return "Employee deleted successfully";
    }
}
