package ru.poltorak.alishev.rest.firstrestapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.poltorak.alishev.rest.firstrestapp.models.Person;
import ru.poltorak.alishev.rest.firstrestapp.services.PeopleService;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }


    @GetMapping
    public List<Person> getPeople() {
        return peopleService.findAll();//jackson конвертирует эти объекты в JSON
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return peopleService.findOne(id);//jackson конвертирует в JSON
    }
}
