package com.project.dinein.dao;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DishDAOImpl implements DishDAO{

    private static List<Dish> DBDishes = new ArrayList<>();
    @Override
    public int insertDish(int id, Dish dish) {
//        DBDishes.add(new Dish(id,dish.getName(), dish.getDescription(), dish.getImage(),dish.getPrice(),dish.getType()));
        DBDishes.add(new Dish(id,dish.getName(), dish.getDescription(), dish.getPrice(),dish.getType()));
        return 1;
    }

    @Override
    public int insertDish(Dish dish) {
        return DishDAO.super.insertDish(dish);
    }

    @Override
    public List<Dish> selectAllDishes() {
        return DBDishes;
    }

    @Override
    public int deleteDishById(int id) {
        Optional<Dish> dishMayBe = selectDishById(id);
        if (dishMayBe.isEmpty()){
            return 0;
        }
        DBDishes.remove(dishMayBe.get());
        return 1;
    }

    @Override
    public int updateDishById(int id, Dish dish) {
        return selectDishById(id).map(p->{
            int index = DBDishes.indexOf(dish);
            if(index >=0){
                DBDishes.set(index,dish);
                return  1;
            }
            return 0;
        }).orElse(0);
    }

    @Override
    public Optional<Dish> selectDishById(int id) {
        return DBDishes.stream().filter(dish -> dish.getDishId() == id).findFirst();
    }
}
