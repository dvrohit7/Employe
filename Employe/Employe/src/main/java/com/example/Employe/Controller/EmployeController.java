package com.example.Employe.Controller;

import com.example.Employe.Entity.Employes;
import com.example.Employe.Service.EmployeServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employe")
public class EmployeController {
    @Autowired
    private EmployeServiceimp es;

    public EmployeController(EmployeServiceimp es) {
        this.es = es;
    }
    @PostMapping("/add")
    public String addEmploye(@RequestBody Employes e) {
        return es.addEmplye(e);
    }
    @GetMapping("/getAll")
    public String getAllEmployes() {
        return es.getAllEmployes().toString();
    }
    @PutMapping("/update")
    public String updateEmploye(@RequestBody Employes e) {
        return es.updateEmploye(e);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEmploye(@PathVariable int id) {
        return es.deleteEmploye(id);
    }

}
