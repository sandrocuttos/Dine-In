package com.project.dinein.dao;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Person;

import java.util.List;
import java.util.Optional;


public interface DishDAO {

    int insertDish(int id, Dish dish);

    default int insertDish(Dish dish){
        int id = (int)Math.random() * 100;
        return insertDish(id,dish);
    }

    List<Dish> selectAllDishes();

    int deleteDishById(int id);

    int updateDishById(int id, Dish dish);

    Optional<Dish> selectDishById(int id);
}

