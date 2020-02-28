package com.springbootmongodb;

import com.springbootmongodb.books.Book;
import com.springbootmongodb.books.BookRepository;
import com.springbootmongodb.customer.Customer;
import com.springbootmongodb.customer.CustomerRepository;
import com.springbootmongodb.factura.Registro;
import com.springbootmongodb.factura.RegistroRepository;
import com.springbootmongodb.persons.Address;
import com.springbootmongodb.persons.Hobby;
import com.springbootmongodb.persons.Person;
import com.springbootmongodb.persons.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
public class SpringBootMongodbApplication extends SpringBootServletInitializer {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongodbApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {

           Address address1=new Address();

           address1.setCountry("UK");
            address1.setAddressLineOne("19 Imaginary Road");
            address1.setAddressLineTwo("Imaginary Place");
            address1.setCity("Imaginary City");

            final Hobby badminton = new Hobby("Badminton");
            final Hobby tv = new Hobby("TV");
            final List<Hobby> hobbies = Arrays.asList(badminton, tv);

            final Person john = new Person(
                    "John",
                    "Doe",
                    LocalDateTime.now(),
                    address1,
                    "Winner",
                    100,
                    hobbies);
            personRepository.save(john);

            System.out.println("Find by first name");
            personRepository.findByFirstName("John").forEach(System.out::println);

            System.out.println("Find by country (UK)");
            personRepository.findByCountry("UK").forEach(System.out::println);

            address1.setCountry("US");
            personRepository.save(john);
            System.out.println("Find by country (US)");
            personRepository.findByCountry("US").forEach(System.out::println);

            System.out.println("Find by hobby (TV)");
            personRepository.findByHobby("TV").forEach(System.out::println);
        };
    }

}
