package com.project.dinein.dao;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public interface DishDAO {

    int insertDish(int id, Dish dish);

    default int insertDish(Dish dish){
        Random random = new Random();
        int id = random.nextInt();
        return insertDish(id,dish);
    }

    List<Dish> selectAllDishes();

    int deleteDishById(int id);

    int updateDishById(int id, Dish dish);

    Optional<Dish> selectDishById(int id);
}

