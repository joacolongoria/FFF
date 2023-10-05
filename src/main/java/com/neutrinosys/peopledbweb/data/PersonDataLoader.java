package com.neutrinosys.peopledbweb.data;

import com.neutrinosys.peopledbweb.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Component
public class PersonDataLoader implements ApplicationRunner {
    private PersonRepository personRepository;

    public PersonDataLoader(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {


        if (personRepository.count() == 0) {
           List<Person> people = List.of(
                    new Person(null, "Jake1","Snake", LocalDate.of( 1950,1,1), "dummy@sammple.com" ,new BigDecimal("50000")),
                    new Person(null, "Jake2","Snake", LocalDate.of( 1950,1,1), "dummy@sammple.com", new BigDecimal("50000")),
                    new Person(null, "Jake3","Snake", LocalDate.of( 1950,1,1), "dummy@sammple.com", new BigDecimal("50000")),
                    new Person(null, "Jake4","Snake", LocalDate.of( 1950,1,1), "dummy@sammple.com", new BigDecimal("50000")),
                    new Person(null, "Jake5","Snake", LocalDate.of( 1950,1,1), "dummy@sammple.com", new BigDecimal("50000"))



            );
            personRepository.saveAll(people);
        }


    }
}
