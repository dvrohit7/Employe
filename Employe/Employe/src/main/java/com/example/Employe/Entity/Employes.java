package com.example.Employe.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employes")
public class Employes {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String phone;

}