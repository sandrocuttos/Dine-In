package com.project.dinein.dao;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DishDAO {

    int insertDish(UUID id, Dish dish);

    default int insertDish(Dish dish){
        UUID id = UUID.randomUUID();
        return insertDish(id,dish);
    }

    List<Dish> selectAllDishes();

    int deleteDishById(UUID id);

    int updateDishById(UUID id, Dish dish);

    Optional<Dish> selectDishById(UUID id);
}

