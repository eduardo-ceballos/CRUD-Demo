package com.github.eduardoceballos.crud.interfaceService;

import com.github.eduardoceballos.crud.model.Person;

import java.util.List;

public interface IPersonService {
    List<Person> list();
    Person listId(long id);
    void save(Person person);
    void delete(long id);
}
