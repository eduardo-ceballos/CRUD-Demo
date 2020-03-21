package com.github.eduardoceballos.crud.interfaces;

import com.github.eduardoceballos.crud.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerson extends CrudRepository<Person, Long> {

}
