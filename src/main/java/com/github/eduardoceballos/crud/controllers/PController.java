package com.github.eduardoceballos.crud.controllers;

import com.github.eduardoceballos.crud.interfaceService.IPersonService;
import com.github.eduardoceballos.crud.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PController {

    @Autowired
    private IPersonService iPersonService;

    @GetMapping(value = "/")
    public String list(Model model) {
        List<Person> people = iPersonService.list();
        model.addAttribute("people", people);
        return "index";
    }

    @GetMapping(value = "/new")
    public String add(Model model) {
        model.addAttribute("person", new Person());
        return "form";
    }

    @GetMapping(value = "/edit/{id}")
    public String listId(@PathVariable(value = "id") long id, Model model) {
        Person person = iPersonService.listId(id);
        model.addAttribute("person", person);
        return "edit";
    }

    @PostMapping(value = "/save")
    public String save(@Valid Person person) {
        iPersonService.save(person);
        return "redirect:/";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteId(@PathVariable(value = "id") long id) {
        iPersonService.delete(id);
        return "redirect:/";
    }
}
