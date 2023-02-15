package ru.poltorak.alishev.rest.firstrestapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.poltorak.alishev.rest.firstrestapp.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person,Integer> {
//    Optional<Person> findByUsername(String username);
}
