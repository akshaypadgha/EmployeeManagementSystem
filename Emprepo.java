package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prog.entity.Employee;
@Repository
public interface Emprepo extends JpaRepository<Empolyee,Integer>{

}
