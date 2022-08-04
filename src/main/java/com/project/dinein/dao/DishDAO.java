package com.project.dinein.dao;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Person;

import java.util.List;
import java.util.Optional;
<<<<<<< Updated upstream
import java.util.UUID;
=======
import java.util.Random;

>>>>>>> Stashed changes

public interface DishDAO {

    int insertDish(int id, Dish dish);

    default int insertDish(Dish dish){
<<<<<<< Updated upstream
        int id = (int) Math.random() * 100;
=======
        Random random = new Random();
        int id = random.nextInt();
>>>>>>> Stashed changes
        return insertDish(id,dish);
    }

    List<Dish> selectAllDishes();

    int deleteDishById(int id);

    int updateDishById(int id, Dish dish);

    Optional<Dish> selectDishById(int id);
}

