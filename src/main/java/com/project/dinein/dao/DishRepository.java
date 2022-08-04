package com.project.dinein.dao;

// public interface EmployeeRepository extends JpaRepository<Employee, Integer>

import com.project.dinein.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {
}
