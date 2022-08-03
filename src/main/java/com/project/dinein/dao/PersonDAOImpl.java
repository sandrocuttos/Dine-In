package com.project.dinein.dao;

import com.project.dinein.model.Person;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("FakePersonDAOImpl")
public class PersonDAOImpl implements PersonDAO {

    private static List<Person> DBPerson = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DBPerson.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public int insertPerson(Person person) {
        return PersonDAO.super.insertPerson(person);
    }

    @Override
    public List<Person> selectAllPeople() {
        return DBPerson;
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personMaybe = selectPersonById(id);
        if (personMaybe.isEmpty()){
            return 0;
        }
        DBPerson.remove(personMaybe.get());
        return 1;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return selectPersonById(id).map(p->{
            int index = DBPerson.indexOf(person);
            if(index >=0){
                DBPerson.set(index,person);
                return  1;
            }
            return 0;
        }).orElse(0);
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DBPerson.stream().filter(person -> person.getId().equals(id)).findFirst();
    }
}
