package com.example.gym;

import com.example.gym.user.User;
import com.example.gym.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
//    @Autowired
//    private UserRepository repo;
//
//    @Test
//    public void testAddNew(){
//        User user = new User();
//        user.setName("Jane");
//        user.setEmail("jane@gmail.com");
//        user.setMobile("0716786533");
//        user.setAddress("Kandy");
//        user.setJoinedDate("2022-08-27");
//
//        User savedUser = repo.save(user);
//
//        Assertions.assertThat(savedUser).isNotNull();
//        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
//    }
//
//    @Test
//    public void testListAll(){
//        Iterable<User> users = repo.findAll();
//        Assertions.assertThat(users).hasSizeGreaterThan(0);
//
//        for(User user : users){
//            System.out.println(user);
//        }
//    }
//
//    @Test
//    public void testUpdate() {
//        Integer userId = 1;
//        Optional<User> optionalUser = repo.findById(userId);
//        User user = optionalUser.get();
//        user.setAddress("Ratnapura");
//        repo.save(user);
//
//        User updateUser = repo.findById(userId).get();
//        Assertions.assertThat(updateUser.getAddress()).isEqualTo("Ratnapura");
//    }
//
//    @Test
//    public void testGet(){
//        Integer userId = 2;
//        Optional<User> optionalUser = repo.findById(userId);
//        Assertions.assertThat(optionalUser).isPresent();
//        System.out.println(optionalUser.get());
//    }
//
//    @Test
//    public void testDelete(){
//        Integer userId = 2;
//        repo.deleteById(userId);
//
//        Optional<User> optionalUser = repo.findById(userId);
//        Assertions.assertThat(optionalUser).isNotPresent();
//    }
}
