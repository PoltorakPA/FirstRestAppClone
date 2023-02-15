package ru.poltorak.alishev.rest.firstrestapp.services;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.poltorak.alishev.rest.firstrestapp.models.Person;
import ru.poltorak.alishev.rest.firstrestapp.repositories.PeopleRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

 public List<Person> findAll(){
        return peopleRepository.findAll();
 }
 public Person findOne(int id){
     Optional<Person> foundPerson=peopleRepository.findById(id);
     return foundPerson.orElse(null);
 }
}
