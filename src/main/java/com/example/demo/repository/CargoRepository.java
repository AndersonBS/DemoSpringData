package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {

}
