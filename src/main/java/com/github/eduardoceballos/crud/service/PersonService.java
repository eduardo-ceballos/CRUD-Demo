package com.github.eduardoceballos.crud.service;

import com.github.eduardoceballos.crud.interfaceService.IPersonService;
import com.github.eduardoceballos.crud.interfaces.IPerson;
import com.github.eduardoceballos.crud.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private IPerson iPerson;

    @Override
    public List<Person> list() {
        return (List<Person>) iPerson.findAll();
    }

    @Override
    public Person listId(long id) {
        Optional<Person> person = iPerson.findById(id);
        return person.orElseGet(Person::new);
    }

    @Override
    public void save(Person person) {
        iPerson.save(person);
    }

    @Override
    public void delete(long id) {
        iPerson.deleteById(id);
    }
}
