package com.example.Employe.Service;

import com.example.Employe.Entity.Employes;

import java.util.List;

public interface EmployeService {

    String addEmplye(Employes e);
    List<Employes> getAllEmployes();
    String updateEmploye(Employes e);
    String deleteEmploye(int id);
}
