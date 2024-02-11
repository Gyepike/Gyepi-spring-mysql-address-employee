package com.anti.Gyepispringmysqladddressemployee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String empName;
    private Integer empAge;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Address> addresslist;
}
